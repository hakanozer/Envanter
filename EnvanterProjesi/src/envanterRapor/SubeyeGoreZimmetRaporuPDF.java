package envanterprojesi;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SubeyeGoreZimmetRaporuPDF {

    public SubeyeGoreZimmetRaporuPDF() throws Exception {
        String subeAdi = "";
        SimpleDateFormat baslikformat = new SimpleDateFormat("dd-MM-yyyy");
        Date tarih = new Date();
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("subeyeGoreZimmetRaporu(" + baslikformat.format(tarih) + ").pdf"));
        document.open();
        PdfPTable table = new PdfPTable(2); // Code 1

        table.addCell(new Paragraph("Ürün adı", FontFactory.getFont(FontFactory.TIMES_ROMAN, "ISO-8859-9", FontFactory.defaultEmbedding, 13, 1, BaseColor.BLUE)));
        table.addCell(new Paragraph("Zimmetli Ürün Sayısı", FontFactory.getFont(FontFactory.TIMES_ROMAN, "ISO-8859-9", FontFactory.defaultEmbedding, 13, 1, BaseColor.BLUE)));

        // Code 3
        DB db = new DB();
        try {
            ResultSet rs = db.baglan().executeQuery("select urunler.urun_adi,zimmetler.zim_urun_adet,ilceler.ilce_adi,subeler.sube_adi from zimmetler \n"
                    + "LEFT JOIN urunler on zimmetler.zim_urun_id=urunler.urun_id \n"
                    + "LEFT JOIN subeler on subeler.sube_id=zimmetler.zim_sube_id \n"
                    + "LEFT JOIN ilceler on ilceler.ilce_id=subeler.sube_ilce_id\n"
                    + "where ilceler.ilce_id='" + AdminRapor.subeyeGoreIlceID + "'");
            while (rs.next()) {
                table.addCell(new Paragraph(rs.getString("urunler.urun_adi"), FontFactory.getFont(FontFactory.TIMES_ROMAN, "ISO-8859-9", FontFactory.defaultEmbedding, 10, 1, BaseColor.BLACK)));
                table.addCell(new Paragraph(rs.getString("zimmetler.zim_urun_adet"), FontFactory.getFont(FontFactory.TIMES_ROMAN, "ISO-8859-9", FontFactory.defaultEmbedding, 10, 1, BaseColor.BLACK)));

                subeAdi = rs.getString("subeler.sube_adi");

            }
        } catch (Exception e) {
            System.out.println("hata var : " + e);
        } finally {
            db.kapat();
        }

        // Code 5
        document.setMargins(30, 80, 100, 300);

        SimpleDateFormat tarihformat = new SimpleDateFormat("EEEE,dd-MM-yyyy HH:mm");
        document.add(new Paragraph("--------- " + subeAdi + " - Zimmet Raporu (" + tarihformat.format(tarih) + ")" + " ---------", FontFactory.getFont(FontFactory.TIMES_ROMAN, "ISO-8859-9", FontFactory.defaultEmbedding, 13, 1, BaseColor.BLACK)));

        document.add(new Paragraph(" ", FontFactory.getFont(FontFactory.TIMES_ROMAN, "ISO-8859-9", FontFactory.defaultEmbedding, 13, 1, BaseColor.BLUE)));
        document.add(table);
        document.close();
    }

    public static void main(String[] args) {
        try {
            SubeyeGoreZimmetRaporuPDF pdfTable = new SubeyeGoreZimmetRaporuPDF();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

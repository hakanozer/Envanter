package envanterprojesi;

import static envanterprojesi.AdminRapor.personelRaporunaGorePersonelID;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class personeleGoreZimmetRaporu extends ApplicationFrame {

    /**
     * Default constructor.
     *
     * @param title the frame title.
     */
    public personeleGoreZimmetRaporu(String title) {
        super(title);
        setContentPane(createDemoPanel());

    }

    /**
     * Creates a sample dataset.
     *
     * @return A sample dataset.
     */
    private static PieDataset createDataset() {
        Map<String, Integer> veriler = new HashMap<String, Integer>();
        DB db = new DB();
        try {
            ResultSet rs = db.baglan().executeQuery("select urunler.urun_adi,zimmetler.zim_urun_adet from zimmetler LEFT JOIN urunler on urunler.urun_id=zimmetler.zim_urun_id LEFT JOIN personeller on personeller.personel_id=zimmetler.zim_personel_id where zimmetler.zim_personel_id='"+AdminRapor.personelRaporunaGorePersonelID+"'");
            while (rs.next()) {
                veriler.put(rs.getString("urunler.urun_adi"), Integer.valueOf(rs.getString("zimmetler.zim_urun_adet")));
            }
        } catch (Exception e) {
            System.out.println("hata var : " + e);
        } finally {
            db.kapat();
        }
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Map.Entry<String, Integer> entrySet : veriler.entrySet()) {
            String demirbasaKayitliurunAdi = entrySet.getKey();
            Integer demirbasaKayitliUrunAdedi = entrySet.getValue();
            String duzenlenmisIsım = demirbasaKayitliurunAdi + " : " + demirbasaKayitliUrunAdedi + " Adet";
            dataset.setValue(duzenlenmisIsım, new Double(demirbasaKayitliUrunAdedi));
        }
        return dataset;
    }

    /**
     * Creates a chart.
     *
     * @param dataset the dataset.
     *
     * @return A chart.
     */
    private static JFreeChart createChart(PieDataset dataset) {

        JFreeChart chart = ChartFactory.createPieChart(
                AdminRapor.personelRaporunaGorePersonelAdi+" isimli kişinin Zimmetler Raporu ", // chart title
                dataset, // data
                true, // include legend
                true,
                false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage(AdminRapor.personelRaporunaGorePersonelAdi+" isimli kişinin Zimmet Bulunmuyor ...");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
        return chart;

    }

    /**
     * Creates a panel for the demo (used by SuperDemo.java).
     *
     * @return A panel.
     */
    public static JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset());
        return new ChartPanel(chart);
    }

    /**
     * Starting point for the demonstration application.
     *
     * @param args ignored.
     */
    public static void main(String[] args) {
        personeleGoreZimmetRaporu demo = new personeleGoreZimmetRaporu("Şubeye Göre Zimmet Raporu");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);

        demo.setVisible(true);

    }

    @Override
    public void windowClosing(final WindowEvent evt) {
        if (evt.getWindow() == this) {
            dispose();

        }
    }

}

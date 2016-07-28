package envanterprojesi;

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

public class GeneleGoreDemirbasRaporu extends ApplicationFrame {

    /**
     * Default constructor.
     *
     * @param title the frame title.
     */
    public GeneleGoreDemirbasRaporu(String title) {
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
            ResultSet rs = db.baglan().executeQuery("select urunler.urun_adi as urunadi,demirbaslar.demirbas_urun_adet as demirbasadedi from demirbaslar \n" +
"LEFT JOIN urunler on demirbaslar.demirbas_urun_id=urunler.urun_id");
            while (rs.next()) {
               
                veriler.put(rs.getString("urunadi"), Integer.valueOf(rs.getString("demirbasadedi")));
            }
        } catch (Exception e) {
            System.out.println("hata var : " + e);
        } finally {
            db.kapat();
        }
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Map.Entry<String, Integer> entrySet : veriler.entrySet()) {
            String demirbasUrunleri = entrySet.getKey();
            Integer demirbasSayisi = entrySet.getValue();
            String duzenlenmisIsım = demirbasUrunleri + " : " + demirbasSayisi + " Adet";
            dataset.setValue(duzenlenmisIsım, new Double(demirbasSayisi));
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
                "Firmadaki Tüm Demirbaş Raporu", // chart title
                dataset, // data
                true, // include legend
                true,
                false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("Firmanın Demirbaşı Bulunmuyor ...");
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
        GeneleGoreDemirbasRaporu demo = new GeneleGoreDemirbasRaporu("Firmadaki Tüm Demirbaş Raporu");
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

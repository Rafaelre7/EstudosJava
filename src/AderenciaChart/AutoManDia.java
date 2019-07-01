package AderenciaChart;

import java.awt.Color;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class AutoManDia extends ApplicationFrame {

	private static final long serialVersionUID = 1L;

	static {
		ChartFactory.setChartTheme(new StandardChartTheme("JFree/Shadow", true));
	}

	public AutoManDia(String title) {
		super(title);
		CategoryDataset dataset = createDataset();
		JFreeChart chart = createChart(dataset);
		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setFillZoomRectangle(true);
		chartPanel.setMouseWheelEnabled(true);
		chartPanel.setPreferredSize(new Dimension(655, 490));
		setContentPane(chartPanel);
	}

	// Adicionando informações do chart
	private static CategoryDataset createDataset() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		dataset.addValue(70, "AUTOMÁTICO", "03/04");
		dataset.addValue(30, "MANUAL", "03/04");
		dataset.addValue(94, "AUTOMÁTICO", "04/04");
		dataset.addValue(6, "MANUAL", "04/04");
		dataset.addValue(96, "AUTOMÁTICO", "05/04");
		dataset.addValue(4, "MANUAL", "05/04");
		dataset.addValue(85, "AUTOMÁTICO", "06/04");
		dataset.addValue(15, "MANUAL", "06/04");
		dataset.addValue(80, "AUTOMÁTICO", "07/04");
		dataset.addValue(20, "MANUAL", "07/04");


		return dataset;

	}

	private static JFreeChart createChart(CategoryDataset dataset) {

		JFreeChart chart = ChartFactory.createBarChart(null,
				"Ultimos 5 dias" /* x-axis label */, "Porcentagem %"/* y-axis label */, dataset);
		chart.setBackgroundPaint(Color.white);
		CategoryPlot plot = (CategoryPlot) chart.getPlot();

		NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		BarRenderer renderer = (BarRenderer) plot.getRenderer();
		
		// Linha do 3D
		renderer.setDrawBarOutline(false);
		renderer.setBaseItemLabelsVisible(true);
		renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
		chart.getLegend().setFrame(BlockBorder.NONE);
		return chart;
	}

	// Metodo main para execução do java
	public static void main(String[] args) {
		AutoManDia demo = new AutoManDia("Chart Dia");
		demo.pack();
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
	}

}

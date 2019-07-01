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

public class ConsolidadoFrente extends ApplicationFrame {

	private static final long serialVersionUID = 1L;

	static {
		ChartFactory.setChartTheme(new StandardChartTheme("JFree/Shadow", true));
	}

	public ConsolidadoFrente(String title) {
		super(title);
		CategoryDataset dataset = createDataset();
		JFreeChart chart = createChart(dataset);
		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setFillZoomRectangle(true);
		chartPanel.setMouseWheelEnabled(true);
		chartPanel.setPreferredSize(new Dimension(830, 150));
		setContentPane(chartPanel);
	}

	// Adicionando informações do chart
	private static CategoryDataset createDataset() {
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		//1
//		dataset.addVa
		dataset.addValue(75, "FRENTE 1", "12/09/2017");
		dataset.addValue(50, "FRENTE 2", "12/09/2017");
		dataset.addValue(50, "FRENTE 3", "12/09/2017");
		dataset.addValue(0, "SEM DADOS", "12/09/2017");
		//2
		dataset.addValue(71, "FRENTE 1", "13/09/2017");
		dataset.addValue(56, "FRENTE 2", "13/09/2017");
		dataset.addValue(46, "FRENTE 3", "13/09/2017");
		dataset.addValue(66, "FRENTE 4", "13/09/2017");
		dataset.addValue(51, "FRENTE 5", "13/09/2017");
		dataset.addValue(62, "FRENTE 6", "13/09/2017");
		dataset.addValue(0, "SEM DADOS ", "13/09/2017");
		


		return dataset;

	}

	private static JFreeChart createChart(CategoryDataset dataset) {

		JFreeChart chart = ChartFactory.createBarChart3D(null,
				null /* x-axis label */, null/* y-axis label */, dataset);
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
		ConsolidadoFrente demo = new ConsolidadoFrente("Consolidado Frente");
		demo.pack();
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
	}

}

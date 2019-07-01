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

public class AutoManMes extends ApplicationFrame {

	private static final long serialVersionUID = 1L;

	static {
		ChartFactory.setChartTheme(new StandardChartTheme("JFree/Shadow", true));
	}

	public AutoManMes(String title) {
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

		dataset.addValue(90, "AUTOMÁTICO", "Janeiro 2018");
		dataset.addValue(10, "MANUAL", "Janeiro 2018");
		dataset.addValue(93, "AUTOMÁTICO", "Fevereiro 2018");
		dataset.addValue(7, "MANUAL", "Fevereiro 2018");
		dataset.addValue(93, "AUTOMÁTICO", "Março 2018");
		dataset.addValue(7, "MANUAL", "Março 2018");
		dataset.addValue(88, "AUTOMÁTICO", "Abril 2018");
		dataset.addValue(12, "MANUAL", "Abril 2018");
		dataset.addValue(60, "AUTOMÁTICO", "Maio 2018");
		dataset.addValue(40, "MANUAL", "Maio 2018");


		return dataset;

	}

	private static JFreeChart createChart(CategoryDataset dataset) {

		JFreeChart chart = ChartFactory.createBarChart(null,
				"Ultimos 5 meses" /* x-axis label */, "Porcentagem %"/* y-axis label */, dataset);
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
		AutoManMes demo = new AutoManMes("Chart Mês");
		demo.pack();
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
	}

}

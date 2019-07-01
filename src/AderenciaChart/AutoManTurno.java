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

public class AutoManTurno extends ApplicationFrame {

	private static final long serialVersionUID = 1L;

	static {
		ChartFactory.setChartTheme(new StandardChartTheme("JFree/Shadow", true));
	}

	public AutoManTurno(String title) {
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
		//1
		dataset.addValue(82, "AUTOMÁTICO", "TURNO A");
		dataset.addValue(18, "MANUAL", "TURNO A");
		//2
		dataset.addValue(88, "AUTOMÁTICO", "TURNO B");
		dataset.addValue(12, "MANUAL", "TURNO B");
		//3
		dataset.addValue(84, "AUTOMÁTICO", "TURNO C");
		dataset.addValue(16, "MANUAL", "TURNO C");
		


		return dataset;

	}

	private static JFreeChart createChart(CategoryDataset dataset) {

		JFreeChart chart = ChartFactory.createBarChart3D(null,
				"Turnos Ativos" /* x-axis label */, "Porcentagem %"/* y-axis label */, dataset);
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
		AutoManTurno demo = new AutoManTurno("Chart Dia");
		demo.pack();
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
	}

}

package AderenciaChart;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Scanner;

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

public class AutoManFrente extends ApplicationFrame {

	private static final long serialVersionUID = 1L;
	static {
		ChartFactory.setChartTheme(new StandardChartTheme("JFree/Shadow", true));
	}

	public AutoManFrente(String title) {
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
		int tamanho;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o tamanho :");
		tamanho = sc.nextInt();
		System.out.println("O tamanho é: " + tamanho);
		do {
			System.out.println("Teste");
			
		}while(tamanho < tamanho); 
			dataset.addValue(70, "AUTOMÁTICO","2322"); //Trazer o desc da frente
			dataset.addValue(30, "MANUAL", "2322");
			tamanho++;
		
//		switch (tamanho) {
//		case 1:
//			// 1
//			dataset.addValue(80, "AUTOMÁTICO", "2322");
//			dataset.addValue(20, "MANUAL", "2322");
//
//			break;
//		case 2:
//			// 1
//			dataset.addValue(80, "AUTOMÁTICO", "2322");
//			dataset.addValue(20, "MANUAL", "2322");
//			// 2
//			dataset.addValue(58, "AUTOMÁTICO", "2323");
//			dataset.addValue(42, "MANUAL", "2323");
//			break;
//		case 3:
//			// 1
//			dataset.addValue(80, "AUTOMÁTICO", "2322");
//			dataset.addValue(20, "MANUAL", "2322");
//			// 2
//			dataset.addValue(58, "AUTOMÁTICO", "2323");
//			dataset.addValue(42, "MANUAL", "2323");
//			// 3
//			dataset.addValue(79, "AUTOMÁTICO", "2324");
//			dataset.addValue(21, "MANUAL", "2324");
//			break;
//		case 4:
//			// 1
//			dataset.addValue(80, "AUTOMÁTICO", "2322");
//			dataset.addValue(20, "MANUAL", "2322");
//			// 2
//			dataset.addValue(58, "AUTOMÁTICO", "2323");
//			dataset.addValue(42, "MANUAL", "2323");
//			// 3
//			dataset.addValue(79, "AUTOMÁTICO", "2324");
//			dataset.addValue(21, "MANUAL", "2324");
//			// 4
//			dataset.addValue(69, "AUTOMÁTICO", "2325");
//			dataset.addValue(31, "MANUAL", "2325");
//			break;
//		case 5:
//			// 1
//			dataset.addValue(80, "AUTOMÁTICO", "2322");
//			dataset.addValue(20, "MANUAL", "2322");
//			// 2
//			dataset.addValue(58, "AUTOMÁTICO", "2323");
//			dataset.addValue(42, "MANUAL", "2323");
//			// 3
//			dataset.addValue(79, "AUTOMÁTICO", "2324");
//			dataset.addValue(21, "MANUAL", "2324");
//			// 4
//			dataset.addValue(69, "AUTOMÁTICO", "2325");
//			dataset.addValue(31, "MANUAL", "2325");
//			// 5
//			dataset.addValue(71, "AUTOMÁTICO", "2326");
//			dataset.addValue(29, "MANUAL", "2326");
//			break;
//		case 6:
//			// 1
//			dataset.addValue(80, "AUTOMÁTICO", "2322");
//			dataset.addValue(20, "MANUAL", "2322");
//			// 2
//			dataset.addValue(58, "AUTOMÁTICO", "2323");
//			dataset.addValue(42, "MANUAL", "2323");
//			// 3
//			dataset.addValue(79, "AUTOMÁTICO", "2324");
//			dataset.addValue(21, "MANUAL", "2324");
//			// 4
//			dataset.addValue(69, "AUTOMÁTICO", "2325");
//			dataset.addValue(31, "MANUAL", "2325");
//			// 5
//			dataset.addValue(71, "AUTOMÁTICO", "2326");
//			dataset.addValue(29, "MANUAL", "2326");
//			// 6
//			dataset.addValue(78, "AUTOMÁTICO", "2327");
//			dataset.addValue(22, "MANUAL", "2327");
//			break;
//		case 7:
//			// 1
//			dataset.addValue(80, "AUTOMÁTICO", "2322");
//			dataset.addValue(20, "MANUAL", "2322");
//			// 2
//			dataset.addValue(58, "AUTOMÁTICO", "2323");
//			dataset.addValue(42, "MANUAL", "2323");
//			// 3
//			dataset.addValue(79, "AUTOMÁTICO", "2324");
//			dataset.addValue(21, "MANUAL", "2324");
//			// 4
//			dataset.addValue(69, "AUTOMÁTICO", "2325");
//			dataset.addValue(31, "MANUAL", "2325");
//			// 5
//			dataset.addValue(71, "AUTOMÁTICO", "2326");
//			dataset.addValue(29, "MANUAL", "2326");
//			// 6
//			dataset.addValue(78, "AUTOMÁTICO", "2327");
//			dataset.addValue(22, "MANUAL", "2327");
//			// 7
//			dataset.addValue(78, "AUTOMÁTICO", "2328");
//			dataset.addValue(22, "MANUAL", "2328");
//			break;
//		case 8:
//			// 1
//			dataset.addValue(80, "AUTOMÁTICO", "2322");
//			dataset.addValue(20, "MANUAL", "2322");
//			// 2
//			dataset.addValue(58, "AUTOMÁTICO", "2323");
//			dataset.addValue(42, "MANUAL", "2323");
//			// 3
//			dataset.addValue(79, "AUTOMÁTICO", "2324");
//			dataset.addValue(21, "MANUAL", "2324");
//			// 4
//			dataset.addValue(69, "AUTOMÁTICO", "2325");
//			dataset.addValue(31, "MANUAL", "2325");
//			// 5
//			dataset.addValue(71, "AUTOMÁTICO", "2326");
//			dataset.addValue(29, "MANUAL", "2326");
//			// 6
//			dataset.addValue(78, "AUTOMÁTICO", "2327");
//			dataset.addValue(22, "MANUAL", "2327");
//			// 7
//			dataset.addValue(78, "AUTOMÁTICO", "2328");
//			dataset.addValue(22, "MANUAL", "2328");
//			// 8
//			dataset.addValue(78, "AUTOMÁTICO", "2329");
//			dataset.addValue(22, "MANUAL", "2329");
//			break;
//		case 9:
//			// 1
//			dataset.addValue(80, "AUTOMÁTICO", "2322");
//			dataset.addValue(20, "MANUAL", "2322");
//			// 2
//			dataset.addValue(58, "AUTOMÁTICO", "2323");
//			dataset.addValue(42, "MANUAL", "2323");
//			// 3
//			dataset.addValue(79, "AUTOMÁTICO", "2324");
//			dataset.addValue(21, "MANUAL", "2324");
//			// 4
//			dataset.addValue(69, "AUTOMÁTICO", "2325");
//			dataset.addValue(31, "MANUAL", "2325");
//			// 5
//			dataset.addValue(71, "AUTOMÁTICO", "2326");
//			dataset.addValue(29, "MANUAL", "2326");
//			// 6
//			dataset.addValue(78, "AUTOMÁTICO", "2327");
//			dataset.addValue(22, "MANUAL", "2327");
//			// 7
//			dataset.addValue(78, "AUTOMÁTICO", "2328");
//			dataset.addValue(22, "MANUAL", "2328");
//			// 8
//			dataset.addValue(78, "AUTOMÁTICO", "2329");
//			dataset.addValue(22, "MANUAL", "2329");
//			// 9
//			dataset.addValue(84, "AUTOMÁTICO", "2330");
//			dataset.addValue(16, "MANUAL", "2330");
//
//			break;
//		case 10:
//			// 1
//			dataset.addValue(80, "AUTOMÁTICO", "2322");
//			dataset.addValue(20, "MANUAL", "2322");
//			// 2
//			dataset.addValue(58, "AUTOMÁTICO", "2323");
//			dataset.addValue(42, "MANUAL", "2323");
//			// 3
//			dataset.addValue(79, "AUTOMÁTICO", "2324");
//			dataset.addValue(21, "MANUAL", "2324");
//			// 4
//			dataset.addValue(69, "AUTOMÁTICO", "2325");
//			dataset.addValue(31, "MANUAL", "2325");
//			// 5
//			dataset.addValue(71, "AUTOMÁTICO", "2326");
//			dataset.addValue(29, "MANUAL", "2326");
//			// 6
//			dataset.addValue(78, "AUTOMÁTICO", "2327");
//			dataset.addValue(22, "MANUAL", "2327");
//			// 7
//			dataset.addValue(78, "AUTOMÁTICO", "2328");
//			dataset.addValue(22, "MANUAL", "2328");
//			// 8
//			dataset.addValue(78, "AUTOMÁTICO", "2329");
//			dataset.addValue(22, "MANUAL", "2329");
//			// 9
//			dataset.addValue(84, "AUTOMÁTICO", "2330");
//			dataset.addValue(16, "MANUAL", "2330");
//			// 10
//			dataset.addValue(84, "AUTOMÁTICO", "2331");
//			dataset.addValue(16, "MANUAL", "2331");
//			break;
//		case 11:
//			// 1
//			dataset.addValue(80, "AUTOMÁTICO", "2322");
//			dataset.addValue(20, "MANUAL", "2322");
//			// 2
//			dataset.addValue(58, "AUTOMÁTICO", "2323");
//			dataset.addValue(42, "MANUAL", "2323");
//			// 3
//			dataset.addValue(79, "AUTOMÁTICO", "2324");
//			dataset.addValue(21, "MANUAL", "2324");
//			// 4
//			dataset.addValue(69, "AUTOMÁTICO", "2325");
//			dataset.addValue(31, "MANUAL", "2325");
//			// 5
//			dataset.addValue(71, "AUTOMÁTICO", "2326");
//			dataset.addValue(29, "MANUAL", "2326");
//			// 6
//			dataset.addValue(78, "AUTOMÁTICO", "2327");
//			dataset.addValue(22, "MANUAL", "2327");
//			// 7
//			dataset.addValue(78, "AUTOMÁTICO", "2328");
//			dataset.addValue(22, "MANUAL", "2328");
//			// 8
//			dataset.addValue(78, "AUTOMÁTICO", "2329");
//			dataset.addValue(22, "MANUAL", "2329");
//			// 9
//			dataset.addValue(84, "AUTOMÁTICO", "2330");
//			dataset.addValue(16, "MANUAL", "2330");
//			// 10
//			dataset.addValue(84, "AUTOMÁTICO", "2331");
//			dataset.addValue(16, "MANUAL", "2331");
//			// 11
//			dataset.addValue(84, "AUTOMÁTICO", "2332");
//			dataset.addValue(16, "MANUAL", "2332");
//			break;
//		case 12:
//			// 1
//			dataset.addValue(80, "AUTOMÁTICO", "2322");
//			dataset.addValue(20, "MANUAL", "2322");
//			// 2
//			dataset.addValue(58, "AUTOMÁTICO", "2323");
//			dataset.addValue(42, "MANUAL", "2323");
//			// 3
//			dataset.addValue(79, "AUTOMÁTICO", "2324");
//			dataset.addValue(21, "MANUAL", "2324");
//			// 4
//			dataset.addValue(69, "AUTOMÁTICO", "2325");
//			dataset.addValue(31, "MANUAL", "2325");
//			// 5
//			dataset.addValue(71, "AUTOMÁTICO", "2326");
//			dataset.addValue(29, "MANUAL", "2326");
//			// 6
//			dataset.addValue(78, "AUTOMÁTICO", "2327");
//			dataset.addValue(22, "MANUAL", "2327");
//			// 7
//			dataset.addValue(69, "AUTOMÁTICO", "2328");
//			dataset.addValue(31, "MANUAL", "2328");
//			// 8
//			dataset.addValue(84, "AUTOMÁTICO", "2329");
//			dataset.addValue(16, "MANUAL", "2329");
//			// 9
//			dataset.addValue(84, "AUTOMÁTICO", "2330");
//			dataset.addValue(16, "MANUAL", "2330");
//			// 10
//			dataset.addValue(84, "AUTOMÁTICO", "2331");
//			dataset.addValue(16, "MANUAL", "2332");
//			// 11
//			dataset.addValue(84, "AUTOMÁTICO", "2332");
//			dataset.addValue(16, "MANUAL", "2332");
//			// 12
//			dataset.addValue(84, "AUTOMÁTICO", "2333");
//			dataset.addValue(16, "MANUAL", "2334");
//			break;
//
//		default:
//			// 1
//			dataset.addValue(80, "AUTOMÁTICO", "2322");
//			dataset.addValue(20, "MANUAL", "2322");
//			// 2
//			dataset.addValue(58, "AUTOMÁTICO", "2323");
//			dataset.addValue(42, "MANUAL", "2323");
//			// 3
//			dataset.addValue(79, "AUTOMÁTICO", "2324");
//			dataset.addValue(21, "MANUAL", "2324");
//			// 4
//			dataset.addValue(69, "AUTOMÁTICO", "2325");
//			dataset.addValue(31, "MANUAL", "2325");
//			// 5
//			dataset.addValue(71, "AUTOMÁTICO", "2325");
//			dataset.addValue(29, "MANUAL", "2325");
//			// 6
//			dataset.addValue(78, "AUTOMÁTICO", "2326");
//			dataset.addValue(22, "MANUAL", "2326");
//			// 7
//			dataset.addValue(69, "AUTOMÁTICO", "2327");
//			dataset.addValue(31, "MANUAL", "2327");
//			// 8
//			dataset.addValue(84, "AUTOMÁTICO", "2328");
//			dataset.addValue(16, "MANUAL", "2328");
//
//			break;
//
//		}
		return dataset;

	}

	private static JFreeChart createChart(CategoryDataset dataset) {

		JFreeChart chart = ChartFactory.createBarChart3D(null, "Frentes Ativas" /* x-axis label */,
				"Porcentagem %"/* y-axis label */, dataset);
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
		AutoManFrente demo = new AutoManFrente("Chart Frente");
		demo.pack();
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
	}

}

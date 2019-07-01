package AderenciaChart;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class RegistrosIncompletos extends JFrame {

	public RegistrosIncompletos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Consolidado turno");
		setSize(298, 570);
		setLocationRelativeTo(null);
		criarGrafico();
		setVisible(true);

	}

	public void criarGrafico() {

		// Grafico de barra
		DefaultCategoryDataset barra = new DefaultCategoryDataset();
		barra.setValue(163, "Dados", "13/09");
		barra.setValue(14, "S/Dados", "12/09");

		JFreeChart grafico = ChartFactory.createBarChart3D("REGISTROS INCOMPLETOS", null, null, barra, PlotOrientation.HORIZONTAL, true, true,
				false);
		ChartPanel painel = new ChartPanel(grafico);
		add(painel);
		CategoryPlot plot = (CategoryPlot) grafico.getPlot();
		BarRenderer renderer = (BarRenderer) plot.getRenderer();
		renderer.setBaseItemLabelsVisible(true);
		renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());

	}

	public static void main(String[] args) {

		new RegistrosIncompletos();
		
	}

}

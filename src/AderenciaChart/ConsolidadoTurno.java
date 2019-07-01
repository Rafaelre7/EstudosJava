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

public class ConsolidadoTurno extends JFrame {

	public ConsolidadoTurno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Consolidado turno");
		setSize(425, 350);
		setLocationRelativeTo(null);
		criarGrafico();
		setVisible(true);

	}

	public void criarGrafico() {

		// Grafico de barra
		DefaultCategoryDataset barra = new DefaultCategoryDataset();
		barra.setValue(15, "1º Turno", "12/09");
		barra.setValue(5, "2º Turno", "12/09");
		barra.setValue(30, "3º Turno", "12/09");
		barra.setValue(28, "1º Turno", "13/09");
		barra.setValue(19, "2º Turno", "13/09");
		barra.setValue(28, "3º Turno", "13/09");

		JFreeChart grafico = ChartFactory.createBarChart(null, null, null, barra, PlotOrientation.VERTICAL, true, true,
				false);
		ChartPanel painel = new ChartPanel(grafico);
		add(painel);
		CategoryPlot plot = (CategoryPlot) grafico.getPlot();
		BarRenderer renderer = (BarRenderer) plot.getRenderer();
		renderer.setBaseItemLabelsVisible(true);
		renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
		

	}

	public static void main(String[] args) {

		new ConsolidadoTurno();
		
	}

}

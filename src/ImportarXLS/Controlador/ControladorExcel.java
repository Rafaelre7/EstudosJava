package ImportarXLS.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;

import ImportarXLS.Vista.VistaExcel;
import ImportarXLS.Modelo.ModeloExcel;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ControladorExcel implements ActionListener {

	ModeloExcel modeloE = new ModeloExcel();
	VistaExcel vistaE = new VistaExcel();
	JFileChooser selectArquivo = new JFileChooser();
	File arquivo;
	int contAcction;

	public ControladorExcel(VistaExcel vistaE, ModeloExcel modeloE) {
		this.vistaE = vistaE;
		this.modeloE = modeloE;
		this.vistaE.btnImportar.addActionListener(this);
		this.vistaE.btnExportar.addActionListener(this);
	}

	public void AgregarFiltro() {
		selectArquivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xls", "xls"));
		selectArquivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xlsx", "xlsx"));

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		contAcction++;
		if (contAcction == 1)
			AgregarFiltro();

		if (e.getSource() == vistaE.btnImportar) {
			if (selectArquivo.showDialog(null, "Selecionar arquivo") == JFileChooser.APPROVE_OPTION) {
				arquivo = selectArquivo.getSelectedFile();
				if (arquivo.getName().endsWith("xls") || arquivo.getName().endsWith("xlsx")) {
					JOptionPane.showMessageDialog(null, modeloE.Importar(arquivo, vistaE.jtDatos));
				} else {
					JOptionPane.showMessageDialog(null, "Entre com um formato valido");
				}
			}

		}
		if (e.getSource() == vistaE.btnExportar) {
			if (selectArquivo.showDialog(null, "Exportar arquivo") == JFileChooser.APPROVE_OPTION) {
				arquivo = selectArquivo.getSelectedFile();
				if (arquivo.getName().endsWith("xls") || arquivo.getName().endsWith("xlsx")) {
					JOptionPane.showMessageDialog(null, modeloE.Exportar(arquivo, vistaE.jtDatos));
				} else {
					JOptionPane.showMessageDialog(null, "Entre com um formato valido");
				}
			}

		}

	}

}

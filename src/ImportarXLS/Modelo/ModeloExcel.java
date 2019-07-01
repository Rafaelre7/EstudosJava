package ImportarXLS.Modelo;

import java.io.*;
import java.util.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ModeloExcel {
	Workbook wb;

	public String Importar(File arquivo, JTable tablaD) {
		String resposta = "Não foi possivel realizar a imporatacao";
		DefaultTableModel modelT = new DefaultTableModel();
		tablaD.setModel(modelT);
		try {
			wb = WorkbookFactory.create(new FileInputStream(arquivo));
			Sheet hoja = wb.getSheetAt(0);
			Iterator filaIterator = hoja.rowIterator();
			int indiceFila = -1;
			while (filaIterator.hasNext()) {
				indiceFila++;
				Row fila = (Row) filaIterator.next();
				Iterator columnaIterator = fila.cellIterator();
				Object[] listaColuna = new Object[5];
				int indiceColuna = -1;
				while (columnaIterator.hasNext()) {
					indiceColuna++;
					Cell celda = (Cell) columnaIterator.next();
					if (indiceFila == 0) {
						modelT.addColumn(celda.getStringCellValue());
					} else {
						if (celda != null) {
							switch (celda.getCellType()) {
							case Cell.CELL_TYPE_NUMERIC:
								listaColuna[indiceColuna] = (int) Math.round(celda.getNumericCellValue());
								break;
							case Cell.CELL_TYPE_STRING:
								listaColuna[indiceColuna]=celda.getStringCellValue();
								break;
							case Cell.CELL_TYPE_BOOLEAN:
								listaColuna[indiceColuna]=celda.getBooleanCellValue();
								break;
							default:
								listaColuna[indiceColuna]=celda.getDateCellValue();
								break;
							}
						}
					}
				}
				if(indiceFila !=0)modelT.addRow(listaColuna);
			}
			resposta = "Importacao exitosa";
		} catch (Exception e) {

		}
		return resposta;
	}
	
	
	public String Exportar(File arquivo, JTable tabelaD) {
		String resposta = "Não foi possivel realizar a exportacao";
		int numFila = tabelaD.getRowCount(), numColuna= tabelaD.getColumnCount();
		if (arquivo.getName().endsWith("xls")) {
			wb = new HSSFWorkbook();
			
		} else {
			wb = new XSSFWorkbook();
		}
		Sheet hoja = wb.getSheet("Proibido");
		try {
			for(int i = 0; i < numFila; i++) {
				Row fila = hoja.createRow(i+i);
				for(int j = 0; j < numColuna; j++) {
					Cell celda = fila.createCell(j);
					if(i==-1) {
						celda.setCellValue(String.valueOf(tabelaD.getColumnName(j)));
					}else {
						celda.setCellValue(String.valueOf(tabelaD.getValueAt(i, j)));;
					}
					wb.write(new FileOutputStream(arquivo));
				}
			}
			resposta="Exportação com exito";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return resposta;
	}
}

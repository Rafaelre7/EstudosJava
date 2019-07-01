package ImplementacaoRxtx;

import java.util.Enumeration;
import gnu.io.CommPortIdentifier;

import java.util.Enumeration;

public class SerialCom {

	protected String[] portas;
	protected Enumeration listaDePortas;

	// Construtor da classe
	public SerialCom() {
		listaDePortas = CommPortIdentifier.getPortIdentifiers();
	}

	// Metodo que retorna as portas disponiveis
	public String[] ObterPortas() {
		return portas;
	}

	// Metodo para listar portas seriais
	protected void ListarPortas() {
		int i = 0;

		portas = new String[10];

		while (listaDePortas.hasMoreElements()) {

			CommPortIdentifier ips = (CommPortIdentifier) listaDePortas.nextElement();

			portas[i] = ips.getName();

			i++;

		}
	}
	
	//Metodo que verifica se a porta esta sendo usada ainda
	public boolean portaExiste(String COMp) {

		String temp;
		boolean e = false;

		while (listaDePortas.hasMoreElements()) {

			CommPortIdentifier ips = (CommPortIdentifier) listaDePortas.nextElement();

			temp = ips.getName();

			if (temp.equals(COMp) == true) {
				e = true;
			}

		}

		return e;
	}

}

package DinamicamenteAbstracao;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ArrayList<Produto> p = new ArrayList<>();

		for (int i = 0; i < 2; i++) {

			String nome = JOptionPane.showInputDialog(null, "Entre com o nome do produto: ");
			p.add(new Produto(nome));

		}
			
		for(Iterator iterator = p.iterator(); iterator.hasNext();) {
			Produto pr = (Produto) iterator.next();
			System.out.println(pr.getNome());
		}
	}

}
package Vetor;

import java.util.Arrays;
import java.util.Collections;

public class Vetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = { 3, 2, 8, 7, 5, 4 }; // cria um vetor e adiciona valores a eles
		Arrays.sort(n); //Usando um metodo para ordenanar um vetor

//		for (int c = 0; c <= n.length - 1; c++) { //for convencional 
//			System.out.print(n[c]);
//		}
		
		for(int valor : n) { //For each para collection conta todos os dados e execulta até finalizar o vetor 
			System.out.print(valor + " ");
		}
		
		System.out.println("");//Pular linha
		int p = Arrays.binarySearch(n, 7);//Fazer uma busca dentro do vetor
		System.out.println("Encontrei o valor na posição "+ p);
	}

}
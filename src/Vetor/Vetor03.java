package Vetor;

import java.util.Arrays;

public class Vetor03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[] = new int [20];
		Arrays.fill(v, 0); //Preenchendo todos valores do vetor
		for(int valor : v) {
			System.out.print(valor+ " ");
		}
	}

}

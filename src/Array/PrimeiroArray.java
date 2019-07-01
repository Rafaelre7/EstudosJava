package Array;

public class PrimeiroArray {

	public static void main(String[] args) {
		
		String [] nomes = {"Rafael" , "Eduarda"};
		int [] numeros = {1,2,3,4,5};
		boolean[] itens = {true,false,false,true};
		long [] longsObj = {1L,2L,3L};
		long [] aux;
		
		
		System.out.println(nomes[0] +" - "+ nomes[1]); //Strings
		System.out.println(numeros[1]); //Inteiro
		System.out.println(itens[3]); // Valor booleano
//		for(int i = 0; i < longsObj.length; i++) {
//			System.out.println(longsObj[i]);
//			aux [i]= longsObj[i]; 
//		}
		System.out.println(longsObj);
	}
}

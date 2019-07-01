package Split;

public class ExemploSplit {
	
	public static void main(String[] args) {
		String texto = "Rafael/Eduardo/Dias/Pimenta";
		String frutas[] = texto.split("/");
		System.out.println(frutas[0]); //imprime banana
		System.out.println(frutas[1]); //imprime maçã
		System.out.println(frutas[2]); //imprime laranja
	
	}
}


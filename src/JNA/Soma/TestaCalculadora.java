package JNA.Soma;

import com.sun.jna.Native;

public class TestaCalculadora {

	public static void main(String[] args) {
		CalculadoraJNA calculadoraJNA = (CalculadoraJNA)
				Native.load("somadorJNA", CalculadoraJNA.class);
		
		int num1 = Integer.parseInt(args[1]);
		int num2 = Integer.parseInt(args[2]);
		
		int resultado = calculadoraJNA.soma(num1, num2);
		System.out.println("A soma é:" + resultado);
		

	}

}

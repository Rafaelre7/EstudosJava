package JNA.Soma;

public class Calculadora {
	public static void main(String[] args) throws ClassNotFoundException{
		Soma soma = (Soma) BibliotecaUtil.
				carregaBiblioteca("soma", "soma.dll");
		
		System.out.println(soma.soma(40, 55));
		
	}
}
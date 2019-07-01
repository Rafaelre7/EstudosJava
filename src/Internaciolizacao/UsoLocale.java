package Internaciolizacao;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class UsoLocale {

	public static void main(String[] args) {
		Locale ptBR = new Locale("pt", "BR"); // Falando que o Brasil é portugues

		Locale vmLocale = Locale.getDefault(); // Localização da jvm

		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, ptBR);
		System.out.println(dateFormat.format(new Date()));

		DateFormat timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, ptBR);
		System.out.println(timeFormat.format(new Date()));

		NumberFormat numberFormat = NumberFormat.getNumberInstance(ptBR); // para números
		System.out.println(numberFormat.format(13.23));

		NumberFormat moedaFormat = NumberFormat.getCurrencyInstance(ptBR); // para moedas
		System.out.println(moedaFormat.format(13.23));

		System.out.println(ptBR);

		System.out.println(vmLocale);
	}
}

package Internaciolizacao;

import java.util.Locale;

public class App {

	public static void main( String[] args ){

		Locale.setDefault(Locale.getDefault());
		
		
		Locale pt_BR = new Locale("pt", "BR");
		System.out.println("-------------------------------------------------------");
		System.out.println(pt_BR);
		System.out.println(ResourceMessages.getMessage(MessageEnum.TITLE, pt_BR));
		System.out.println(ResourceMessages.getMessage(MessageEnum.HELLO, pt_BR, "João"));
		System.out.println(ResourceMessages.getMessage(MessageEnum.GOODBYE, pt_BR));

		Locale es_AR = new Locale("es", "AR");
		System.out.println("-------------------------------------------------------");
		System.out.println(es_AR);
		System.out.println(ResourceMessages.getMessage(MessageEnum.TITLE, es_AR));
		System.out.println(ResourceMessages.getMessage(MessageEnum.HELLO, es_AR, "Juan"));
		System.out.println(ResourceMessages.getMessage(MessageEnum.GOODBYE, es_AR));

		Locale en_US = Locale.US;
		System.out.println("-------------------------------------------------------");
		System.out.println(en_US);
		System.out.println(ResourceMessages.getMessage(MessageEnum.TITLE, en_US));
		System.out.println(ResourceMessages.getMessage(MessageEnum.HELLO, en_US, "John"));
		System.out.println(ResourceMessages.getMessage(MessageEnum.GOODBYE, en_US));

		Locale chinese = Locale.CHINESE;
		System.out.println("-------------------------------------------------------");
		System.out.println(chinese);
		System.out.println(ResourceMessages.getMessage(MessageEnum.TITLE, chinese));
		System.out.println(ResourceMessages.getMessage(MessageEnum.HELLO, chinese, "Chin-chan"));
		System.out.println(ResourceMessages.getMessage(MessageEnum.GOODBYE, chinese));

	}

}

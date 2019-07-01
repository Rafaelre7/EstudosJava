import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExerciciosMaratona {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) { // Lê infinitamente até não ser inserido mais dados
			int N = sc.nextInt();
			if (N == 0) {// Se não for inserido nada sai do systema
				System.exit(0);
			}
			// N != 0, logo deve computar
			int questoesAcertadas = 0;
			int totalMinutos = 0;
			Map<Character, Integer> mapaIncorretos = new HashMap<>();
			
			for (int i = 0; i < N; i++) {
				// A 120 incorreto
				Character letraProblema = sc.next().charAt(0);// pega um caracter apenas
				int minutos = sc.nextInt();
				String resposta = sc.next();
				if (resposta.equals("correto")) {//le se esta correto
					questoesAcertadas++;//incrementa a resposta correta
					totalMinutos += minutos; //acresenta os minutos
					//precisa somar o tempo dos incorretos
					if(mapaIncorretos.containsKey(letraProblema)) {
						totalMinutos += mapaIncorretos.get(letraProblema);
					}
				}else {
					if(mapaIncorretos.containsKey(letraProblema)) {
						Integer quantosMinutos = mapaIncorretos.get(letraProblema);
						quantosMinutos+=20;
						mapaIncorretos.put(letraProblema, quantosMinutos);
					}else {
						mapaIncorretos.put(letraProblema, 20);
					}
					mapaIncorretos.put(letraProblema, 20);
				}
			}
			System.out.println(questoesAcertadas+" "+totalMinutos);
		}

	}
}

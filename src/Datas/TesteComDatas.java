package Datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteComDatas {
	public static void main(String[] args) throws ParseException {
		Calendar c = Calendar.getInstance();
		System.out.println("Data e hora atual: " + c.getTime()); // Data completa Tue Mar 13 11:29:33 BRT 2018
		System.out.println("Data e hora atual: " + c.getWeekYear() + "\n"); // Ano 2018
		
		//Forma do java 8 acima método Calendar
		System.out.println("Segundo: " + c.get(Calendar.SECOND));
		System.out.println("Minuto: " + c.get(Calendar.MINUTE));
		System.out.println("Hora: " + c.get(Calendar.HOUR_OF_DAY)+" \n");
		// String data = "21/07/2018 9:51:00";

		// Forma do java 7 para baixo
		Date horario = new Date(System.currentTimeMillis());
		System.out.println("Hora date: " + horario.getHours());
		System.out.println("Minuto date : " + horario.getMinutes());
		System.out.println("Segundo date : " + horario.getSeconds()+" \n");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfh = new SimpleDateFormat("HH:mm:ss");
		System.out.println("Data formatada: " + sdf.format(c.getTime()));
		System.out.println("Hora formatada: " + sdfh.format(c.getTime()));

		//
		// DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// DateFormat df2 = new SimpleDateFormat("yy-MM-dd");

		Date sdata = c.getTime();
		// Date data = df2.parse(sdata);

		// System.out.println("Teste: " + df1.format(sdata));

	}
}

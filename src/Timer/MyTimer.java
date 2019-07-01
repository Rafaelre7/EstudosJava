package Timer;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {
	public static final long TEMPO = (1000 * 10); // atualiza o site a cada 10 segundos

	public static void main(String[] args) {
		System.out.println("inicio");
		Timer timer = null;
		if (timer == null) {
			timer = new Timer();
			TimerTask tarefa = new TimerTask() {
				public void run() {
					try {
						System.out.println("Teste agendado");
						// chamar metodo
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);
		}
	}
}


/*
 * //    public void Atualizar() {
//     
//        System.out.println("Inicio");
//        public static final long TEMPO = (1000 * 10);
//        Timer timer = null;
//        if(timer == null){
//            timer = new Timer();
//            TimerTask tarefa = new TimerTask() {
//                @Override
//                public void run() {
//                    try {
//                         // REGISTROS CCT
//                registrosCCT1();
//                // CONCOLIDADO USINA
//                consolidadoUsinaSysdate();
//                // CONSOLIDADO FRENTE
//                consolidadoFrenteSysdate();
//                // CONSOLIDADO TURNO
//                consolidadoTurnoSysdate();
//
//                // MONTAR PERIODO
//                Calendar c = Calendar.getInstance();
//                pMax = sdfp.format(c.getTime());
//                lblPerido.setText("Período:" + pMax);
//
//                System.out.println("Atualizou");
//                
//                    } catch (Exception e) {
//                    }
//                }
//            };
//               timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);
//        }
//    }
//}
 * 
 */ 

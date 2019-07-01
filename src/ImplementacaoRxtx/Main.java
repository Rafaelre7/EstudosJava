package ImplementacaoRxtx;

import gnu.io.CommPortIdentifier;

public class Main extends SerialCom {

	public static void main(String[] args) {
		SerialComLeitura leitura = new SerialComLeitura("COM28", 115200, 0);
		// Iniciando leitura serial
		while (true) {
			try {
//				CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier("COM28");
//				if(portIdentifier.isCurrentlyOwned()) {
//					
//				}
				System.out.println("Habilitou Leitura");
				leitura.HabilitarLeitura();
				System.out.println("Obter Id");
				leitura.ObterIdDaPorta();
				System.out.println("Abriu Porta");
				leitura.AbrirPorta();
				// Thread.sleep(5000);
				System.out.println("Leu Dados");
				leitura.LerDados();
				leitura.HabilitarEscrita();
				leitura.EnviarUmaString("teste");
				Thread.sleep(2000);
				leitura.EnviarUmaString("teste");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {

				Thread.sleep(5000);

			} catch (InterruptedException ex) {

				System.out.println("Erro na Thread: " + ex);

			}
			System.out.println("Feixou Leitura\n");
			leitura.FecharCom();
		}

	}

}
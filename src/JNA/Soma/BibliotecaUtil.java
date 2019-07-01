package JNA.Soma;

import com.sun.jna.Native;

public class BibliotecaUtil {
	public static Object carregaBiblioteca(String classe,
			 String nomeArquivo) throws ClassNotFoundException{

			 String raizApp = System.getProperty("user.dir");
			 String separador = System.getProperty(
			 "file.separator");
			 String diretorioLib = "native";
			 
			 String caminho = raizApp +separador+
					 diretorioLib+separador+nomeArquivo;
			 System.load(caminho);
			 Class clazz = Class.forName(classe);
			 	return Native.load(clazz);

			 }
}
package SubString;

public class Substring {

	public static void main(String[] args) {
		String s = "Puxa vida, está vindo um lixo no fim da string*";
		if (s.length() > 0) {
		    s = s.substring (0, s.length() - 1);
		    s = s.substring (1,5);
		}
		System.out.println(s);
	}

}

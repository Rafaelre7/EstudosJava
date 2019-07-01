package JNA.Soma;

import com.sun.jna.Library;

public interface Soma extends Library {
	int soma(int x, int y);
}
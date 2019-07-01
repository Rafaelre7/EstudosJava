package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTeste {
	    public static void main(String[] args) {
	        Map<String,String> map = new LinkedHashMap<>(); //LinkedHashMap traz os dados com sequencia de entrada
//	        Map<String,String> map = new LinkedHashMap<>(); //S� ordena os valores
	        map.put("teklado", "teclado");
	        map.put("mouze", "mouse");
	        map.put("vc", "voc�");
	        map.put("Meza", "mesa");
//	        for(String key : map.values()){
//	            System.out.println(key);
//	        }	
	        for(Map.Entry<String, String> entry : map.entrySet()){
	            System.out.println(entry.getKey()+" "+entry.getValue());
	        }
	    }
	}

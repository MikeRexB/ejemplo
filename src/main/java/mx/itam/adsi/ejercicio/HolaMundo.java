package mx.itam.adsi.ejercicio;

public class HolaMundo {
  
    public static String hola(String s) {
        StringBuilder sb = new StringBuilder();

	sb.append("Hola: ");
        sb.append(s);
	
	return sb.toString();
    }
 
    public static void main(String... args) {
    	System.out.println(hola("Amanda"));
    }
}

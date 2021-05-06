import java.util.HashMap;
import java.util.Map;
public class MisionSecreta {
	static Map<Character,Integer> bacedifoguMap = new HashMap<Character,Integer>()
	{{
		put('B', 0);
		put('b', 0);
		put('A', 1);
		put('a', 1);
		put('C', 2);
		put('c', 2);
		put('E', 3);
		put('e', 3);
		put('D', 4);
		put('d', 4);
		put('I', 5);
		put('i', 5);
		put('F', 6);
		put('f', 6);
		put('O', 7);
		put('o', 7);
		put('G', 8);
		put('g', 8);
		put('U', 9);
		put('u', 9);
	}};
	public static void main(String[] args) {
		MisionSecreta ms = new MisionSecreta();
		System.out.println(ms.codificar("ayuda"));
	}
	public String codificar(String mensaje) {
		return morse(mensaje) + octal(mensaje) + bacedifogu(mensaje);
	}
	public String morse(String mensaje) {
		return "> " + mensaje + " (Morse)\n\n";
	}
	public String octal(String mensaje) {
		return "> " + mensaje + " (Octal)\n\n";
	}
	public String bacedifogu(String mensaje) {
		String stringEncriptado = "";		
		for (int i = 0; i < mensaje.length(); i++) {
			if (bacedifoguMap.containsKey(mensaje.charAt(i))) {
				stringEncriptado = stringEncriptado + bacedifoguMap.get(mensaje.charAt(i));
			} else {
				stringEncriptado = stringEncriptado + mensaje.charAt(i);
			}
        }
		return "> " + stringEncriptado + " (BACEDIFOGU)\n\n";
	}
}
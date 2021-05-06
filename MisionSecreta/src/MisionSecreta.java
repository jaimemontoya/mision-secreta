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
	static Map<Character,String> morseMap = new HashMap<Character,String>()
	{{
		put('A', ".-");
		put('a', ".-");
		put('B', "-...");
		put('b', "-...");
		put('C', "-.-.");
		put('c', "-.-.");
		put('D', "-..");
		put('d', "-..");
		put('F', "..-.");
		put('f', "..-.");
		put('G', "--.");
		put('g', "--.");
		put('H', "....");
		put('h', "....");
		put('I', "..");
		put('i', "..");
		put('J', ".---");
		put('j', ".---");
		put('K', "-.-");
		put('k', "-.-");
		put('L', ".-..");
		put('l', ".-..");
		put('M', "--");
		put('m', "--");
		put('N', "-.");
		put('n', "-.");
		put('O', "---");
		put('o', "---");
		put('P', ".--.");
		put('p', ".--.");
		put('Q', "--.-");
		put('q', "--.-");
		put('R', ".-.");
		put('r', ".-.");
		put('S', "...");
		put('s', "...");
		put('T', "-");
		put('t', "-");
		put('U', "..-");
		put('u', "..-");
		put('V', "...-");
		put('v', "...-");
		put('W', ".--");
		put('w', ".--");
		put('X', "-..-");
		put('x', "-..-");
		put('Y', "-.--");
		put('y', "-.--");
		put('Z', "--..");
		put('z', "--..");
		put('1', ".----");
		put('2', "..---");
		put('3', "...--");
		put('4', "....-");
		put('5', ".....");
		put('6', "-....");
		put('7', "--...");
		put('8', "---..");
		put('9', "----.");
		put('0', "-----");
	}};
	public static void main(String[] args) {
		MisionSecreta ms = new MisionSecreta();
		System.out.println(ms.codificar("ayuda"));
	}
	public String codificar(String mensaje) {
		return morse(mensaje) + octal(mensaje) + bacedifogu(mensaje);
	}
	public String octal(String mensaje) {
		String stringEncriptado = "";
		for (int i = 0; i < mensaje.length(); i++) {
			stringEncriptado = stringEncriptado + Integer.toOctalString(mensaje.charAt(i));
		}
		return "> " + stringEncriptado + " (Octal)\n\n";
	}
	public String morse(String mensaje) {
		String stringEncriptado = "";		
		for (int i = 0; i < mensaje.length(); i++) {
			if (morseMap.containsKey(mensaje.charAt(i))) {
				stringEncriptado = stringEncriptado + morseMap.get(mensaje.charAt(i));
			} else {
				stringEncriptado = stringEncriptado + mensaje.charAt(i);
			}
        }
		return "> " + stringEncriptado + " (Morse)\n\n";
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
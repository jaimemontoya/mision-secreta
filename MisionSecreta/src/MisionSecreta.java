public class MisionSecreta {
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
		return "> " + mensaje + " (BACEDIFOGU)\n\n";
	}
}
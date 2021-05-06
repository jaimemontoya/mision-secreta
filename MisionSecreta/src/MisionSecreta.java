public class MisionSecreta {
	public static void main(String[] args) {
		MisionSecreta ms = new MisionSecreta();
		ms.codificar("ayuda");
	}
	public void codificar(String mensaje) {
		System.out.println("Mensaje: "+mensaje);
	}
}
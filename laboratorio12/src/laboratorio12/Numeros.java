package laboratorio12;

public class Numeros {
	int numer;
	int i, neg = 0, par = 0;

	public void entrada() {
		for (i = 0; i < 5; i++) {
			numer = ingresarDatos("Digite un n�mero: " + (i+1));
			if (numer % 2 == 0) {
				par++;
			}

			if (numer < 0) {
				neg++;
			}
		}
		JOptionPane.showMessageDialog(null,
				"El n�mero de n�meros pares es: " + par + "\n" + "El n�mero de n�meros negativos es: " + neg);
	}

	public static int ingresarDatos(String mensaje) {
		String cadena;
		int valor;
		cadena = JOptionPane.showInputDialog(null, mensaje);
		valor = Integer.parseInt(cadena);
		return valor;
	}
}
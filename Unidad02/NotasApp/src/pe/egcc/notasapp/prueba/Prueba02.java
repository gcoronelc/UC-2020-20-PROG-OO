package pe.egcc.notasapp.prueba;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba02 {

	public static void main(String[] args) {

		int a = 20;
		int b = 0;

		int c = dividir(a, b);

		System.out.println("c = " + c);

	}

	private static int dividir(int a, int b)  {
		if (b == 0) {
			throw new RuntimeException("No se puede dividir entre 0.");
		}
		return (a / b);
	}

}

package mouredev;

public class sintaxis00 {

	public static void main(String[] args) {
//		* - Crea un comentario en el código y coloca la URL del sitio web oficial del
//		 *   lenguaje de programación que has seleccionado.
//		 * - Representa las diferentes sintaxis que existen de crear comentarios
//		 *   en el lenguaje (en una línea, varias...).
//		 * - Crea una variable (y una constante si el lenguaje lo soporta).
//		 * - Crea variables representando todos los tipos de datos primitivos
//		 *   del lenguaje (cadenas de texto, enteros, booleanos...).
//		 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"

		
		//https://www.java.com/
		//Este es un comentario de uns sola linea
		
		/*
		 * este es un comentario
		 * de varias lineas
		 */
		
		/**
		 * este es un comentario de documentacion (javadoc)
		 * se usa para comentar documentacion automatica
		 */
		
		//Creacion de una variable
		String miVariable = "Hola, Java"; //aqui podemos observar que es una variable tipo String
		
		//Creacion de una constante
		final int MI_CONSTANTE = 42; //tenemos una constante de tipo entero
		
		//Variable representando tipos de datos primitivos
		byte miByte = 127;
		short miShort = 32767;
		int miInt = 2147483647;
		long miLong = 922929837829387728L;
		float miFloat = 3.14f;
		double miDouble = 3.14159265359;
		boolean miBoolean = true;
		char miChar = 'A';
		
		//Impresion por terminal
		System.out.println("Hola, Java!");
		
		//Ejemplo del uso de algunas variables
		System.out.println(miVariable);
		System.out.println("El valor de mi constante es: " + MI_CONSTANTE);
		System.out.println("El número float: " + miFloat);
	}

}

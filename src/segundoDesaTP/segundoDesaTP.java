package segundoDesaTP;

import java.util.Scanner;

import java.util.InputMismatchException;

public class segundoDesaTP {
	/*
	 * Se debe crear un programa que simule las operaciones matemáticas de una
	 * calculadora, pero esta vez, se debe realizar un programa eficiente, con los
	 * temas vistos en el año. El programa debe mostrar un menú con las siguientes
	 * opciones: Suma Resta Multiplicación División El usuario seleccionará una de
	 * las opciones del menú. Luego: El programa debe solicitar al usuario que
	 * ingrese dos números para realizar la operación matemática seleccionada. El
	 * programa debe realizar la operación correspondiente (suma, resta,
	 * multiplicación o división) y mostrar el resultado al usuario. Cada una de las
	 * opciones anteriores, debe estar dentro de una función. Si el usuario
	 * selecciona la opción de división, deben manejar la excepción de división por
	 * cero, en caso de que el denominador sea igual a 0. Después de mostrar el
	 * resultado, el programa debe preguntar al usuario si desea realizar otra
	 * operación. Si la respuesta es "sí", debe volver al menú principal. Si la
	 * respuesta es "no", el programa debe finalizar. El programa debe ser capaz de
	 * manejar excepciones, como entradas no válidas (por ejemplo, letras en lugar
	 * de números) y otras situaciones que puedan causar errores.
	 */
	static float n1, n2;
	static float result;
	static String repetir, y = "yes", n = "no";
	static boolean flag = false;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		while (flag == false) {

			try {

				int opc;

				System.out.println("\t calculadora \n1. suma\n2. resta\n3. multiplicacion\n4. division");
				opc = entrada.nextInt();
				System.out.println();

				switch (opc) {
				case 1:

					suma();

					break;
				case 2:
					resta();

					break;
				case 3:
					multiplicacion();

					break;
				case 4:

					division();
					if (n1 == 0 || n2 == 0) {
						throw new ArithmeticException();
					}

					break;
				default:
					System.out.println("es incorrecto.");

					break;
				}

				System.out.println("el resultado es: " + result);
			}	catch (InputMismatchException e) {
					System.out.println("Se ha producido una excepción InputMismatchException. Ingresa un número válido.");
			
			} catch (ArithmeticException e) {

				System.out.println("Error. division por cero");
				
			} 
			
			
			System.out.println("¿desea hacer otra operacion?Yes/No");
			repetir = entrada.next().toLowerCase();

			if (repetir.equals("yes")) {
				flag = false;
			}
			if (repetir.equals("no")) {
				flag = true;
			}

		}
	}

	public static void suma() {
		elignum();
		result = n1 + n2;

	}

	public static void resta() {
		elignum();
		result = n1 - n2;

	}

	public static void multiplicacion() {
		elignum();
		result = n1 * n2;

	}

	public static void division() {
		elignum();
		result = n1 / n2;

	}

	public static void elignum() {
		try {
			Scanner entrada = new Scanner(System.in);

			System.out.println("ingresa un primer numero:");
			n1 = entrada.nextInt();

			System.out.println("ingresa un segundo numero:");
			n2 = entrada.nextInt();
		} catch (InputMismatchException e) {

			System.out.println("Error. ingreso invalido");

		}
	}

}

package funciones;

import java.util.Scanner;

public class funciones_sin_coment {
	
	static int n1, n2;
	
	public static void saludar() {
	    System.out.println("Hola. Quiero sumar");
	}

	public static void ingresarNumeros() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa un primer numero: ");
	    n1 = entrada.nextInt();
	    System.out.println("Ingresa un segundo numero: ");
	    n2 = entrada.nextInt();
	   
	}

	public static int sumar(int a, int b) { // parámetros: a y b.
	    int suma = a + b;
	    return suma;
	}
			

	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	    saludar();
	    ingresarNumeros();
	    sumar(n1, n2); //n1 y n2: argumentos
	    System.out.println("El resultado de la suma es: " + sumar(n1, n2));
	    
	}
}

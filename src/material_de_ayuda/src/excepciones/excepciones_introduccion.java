package excepciones;


/*
TRATAMIENTO DE EXCEPCIONES
Es una forma de manejar situaciones inesperadas o 
errores que pueden ocurrir durante la ejecucion de un programa. 
Las excepciones son eventos que pueden interrumpir el flujo normal 
de un programa y, en lugar de permitir que el programa se bloquee o 
termine abruptamente, Java ofrece una forma estructurada de manejar 
estas situaciones.

BLOQUE "TRY CATCH"
Un bloque try se utiliza para rodear el código que podría 
generar una excepción. Si ocurre una excepción en este bloque, 
el control se transfiere al bloque catch correspondiente, donde 
se puede manejar el error de manera adecuada.

    try {
           INSTRUCCIONES A INTENTAR REALIZAR
           
           throw new TIPO DE EXCEPCION (); 
           // "throw new" sirve para AGREGAR una excepcion que no este incluida en el 
            * tipo de excepcion.
            * Ejemplo: si no quiero agregar numero negativos a una variable, puedo usar 
            * "throw new ArithmeticException()" para agregar una excepcion que el programa no reconoce.
            * 
        	//
        } 
        catch (TIPO DE EXCEPCION e) {
            ACCION A REALIZAR SI OCURRIO UN ERROR
        } finally {
        	ACCION A REALIZAR OCURRA UN ERROR O NO. NO ES OBLIGATORIO.
        }
        
Nota: se suele colocar "e" seguido del tipo de excepcion. No es obligatorio
colocar siempre la "e", pero los programadores casi siempre lo hacen de esta
forma (colocando "e" después del tipo de excepcion).


TIPOS DE EXCEPCIONES (algunas...):
--- 
Todas las excepciones mostradas a continuacion, deben 
escribirse dentro del paréntesis del "catch".
Ejemplo catch (ArithmeticException e). Recordar que se escribe "e" luego 
del tipo de excepcion. 
---

- ArithmeticException: 
Esta excepcion se lanza cuando ocurre una operación aritmetica incorrecta, 
como una division por cero.

- NumberFormatException: Se lanza cuando intentas convertir una 
cadena en un tipo numerico (por ejemplo, Integer.parseInt()) y 
la cadena no tiene el formato numerics correcto.

- IndexOutOfBoundsException: Esta excepcion se lanza cuando intentas 
acceder a un indice fuera del rango valido en una estructura de 
datos como un array o una lista.

- IOException: Es una excepcion generica para problemas de entrada/salida. 
Representa errores que pueden ocurrir durante operaciones de lectura o
escritura de archivos, flujos, etc.

- FileNotFoundException: 
Se lanza cuando intentas abrir un archivo que no existe en el sistema.

- ClassNotFoundException: 
Esta excepcion se produce cuando se intenta cargar una clase a 
traves de su nombre y no se puede encontrar en tiempo de ejecucion.

- ArrayIndexOutOfBoundsException: 
Una subclase de IndexOutOfBoundsException, se lanza cuando intentas acceder a 
un indice que esta fuera del rango válido de un array.

- IllegalArgumentException: 
Esta excepcion se lanza cuando se pasa un argumento invalido a un metodo.

- InterruptedException: 
Se lanza cuando un hilo en espera es interrumpido.

- RuntimeException: 
Esta es una excepción generica que incluye muchas 
subclases que representan situaciones excepcionales 
en tiempo de ejecución, como NullPointerException, IndexOutOfBoundsException, etc.

- InputMismatchException: 
Se lanza cuando la entrada recibida no coincide con el formato esperado.

*/


// EJEMPLO: intentar dividir por cero. Y solo numeros enteros (NO negativos).
import java.util.InputMismatchException;
import java.util.Scanner;

public class excepciones_introduccion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
        
        // TRY intenta ejecutar sus instrucciones.
        // CATCH captura el error, y actua en consecuencia a ese error.
        try {
        	System.out.println("Ingresa un numero para dividir: ");
    		float numerador = entrada.nextInt();
    		
    		if (numerador < 0) {
                throw new ArithmeticException();
              // Agregro a ArithmeticException() que, si el numero es negativo, ser� un error (por eso "throw new").
            }
    		System.out.println("Por cuanto lo queres dividir? ");
    		
    		
    		
            float denominador = entrada.nextInt();
            
            if (denominador < 0) {
                throw new ArithmeticException();
             // Agregro a ArithmeticException() que, si el numero es negativo, ser� un error (por eso "throw new").
            }
            
            float resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
// Notar que se deben colocar las intrucciones que pueden fallar dentro de TRY.
           
        } catch (ArithmeticException e) { 
            System.out.println("Error: Division por cero o numero negativo.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un dato valido.");
        } finally { // Finally actua SIEMPRE. No es obligatorio.
        	System.out.println("Programa finalizado.");
        }
        

	}


}

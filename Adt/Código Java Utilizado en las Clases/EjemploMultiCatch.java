package ficheros;

// Dependiendo del tipo de error, obtendremos un mensaje u otro por pantalla
public class EjemploMultiCatch {
    public static void main(String[] args) {
        try {
            // Simulamos dos tipos de errores diferentes
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // ArrayIndexOutOfBoundsException
            //Creamos una división por cero que lanza otra excepción
            int a = 10 / 0; // ArithmeticException
        } 
        // Capturamos la excepción de índice fuera de rango
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice de array fuera de rango.");
        } 
        // Capturamos la excepción de división por cero
        catch (ArithmeticException e) {
            System.out.println("Error: división por cero.");
        } 
        //Capturamos cualquier otra excepción no prevista
        catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }
    }
}

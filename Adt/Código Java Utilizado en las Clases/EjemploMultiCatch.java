package ficheros;

// Dependiendo del tipo de error, obtendremos un mensaje u otro por pantalla
public class EjemploMultiCatch {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // ArrayIndexOutOfBoundsException

            int a = 10 / 0; // ArithmeticException
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice de array fuera de rango.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: división por cero.");
        } 
        catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }
    }
}

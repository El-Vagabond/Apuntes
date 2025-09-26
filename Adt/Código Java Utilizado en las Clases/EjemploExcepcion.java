package ficheros;

public class EjemploExcepcion {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;  // Esto lanza ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("¡Error! División por 0 no permitida.");
            System.out.println("Mensaje: " + e.getMessage());
            e.printStackTrace();  // Muestra detalles técnicos
        }
    }
}

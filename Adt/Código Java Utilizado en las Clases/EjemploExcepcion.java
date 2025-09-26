package ficheros;

public class EjemploExcepcion {
    public static void main(String[] args) {
        try {
            // Simulamos una operación que lanza una excepción
            int a = 10;
            int b = 0;
            int resultado = a / b;  // Esto lanza ArithmeticException
            // Si no hay excepción, mostramos el resultado
            System.out.println("Resultado: " + resultado);
            
        } 
        // Capturamos la excepción específica
        catch (ArithmeticException e) {
            // Manejamos la excepción
            System.out.println("¡Error! División por 0 no permitida.");
            // Mostramos detalles técnicos
            System.out.println("Mensaje: " + e.getMessage());
            // Opcionalmente, mostramos la traza completa
            e.printStackTrace();  // Muestra detalles técnicos
        }
    }
}

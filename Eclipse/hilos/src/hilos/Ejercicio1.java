package hilos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

	public static void main(String[] args) {
		try {
			// Creamos un proceso que haga ping a google 2 veces

			ProcessBuilder ping = new ProcessBuilder("ping", "-n", "2", "ww.google.es");

			// Inicializamos el Proceso
			Process ejeping = ping.start();
			
			// Mostramos el codigo de salida por pantalla
			BufferedReader lector = new BufferedReader( new InputStreamReader(ejeping.getInputStream()));
	            
	            String linea;
	            System.out.println("Salida del ping:");
	            System.out.println("------------------");
	            while ((linea = lector.readLine()) != null) {
	                System.out.println(linea);
	            }
	            lector.close();

			// Guardamos el codigo del proceso con la funcion .waitfor(); 
	            int codigoSalida = ejeping.waitFor();
		
			
			
			
			if (codigoSalida==0) {
				System.out.println("proceso realizado correctamente");
			}else {
				System.out.println("Error al terminar el proceso");
			}

		} catch (IOException e) {
			System.out.println("Error al crear el ping " + e.getMessage());
		} catch (InterruptedException e) {
			System.out.println("El proceso fue interrumpido: " + e.getMessage());

		}

	}
}

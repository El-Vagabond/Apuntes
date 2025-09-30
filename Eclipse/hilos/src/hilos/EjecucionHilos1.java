package hilos;

public class EjecucionHilos1 {

	public static void main(String[] args) {
		//Creamos un nuevo hilo para agregarle un trabajo especifico
		hilos1 pumba = new hilos1();
		//Arrancamos el proceso del hilo
		pumba.start();
		
		//Generamos el trabajo de este nuevo hilo
		for (int i=0;i<100;i++) {
			System.out.println("Ejecucion fuera de tarea en el hilo " + i);
			
		}
	}}
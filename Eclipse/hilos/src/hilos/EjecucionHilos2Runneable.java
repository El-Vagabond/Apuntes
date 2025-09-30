package hilos;

public class EjecucionHilos2Runneable {

	public static void main(String[] args) {
		// Creamos un Hilo que tenemos con la clase Implements

		hilos2 timon = new hilos2();

		// Creamos un Threads que use el hilo creado anteriormente para poder usar
		// .start()
		Thread ttimon = new Thread(timon);
		// Lo iniciamos
		ttimon.start();
		//Generamos el trabajo de este nuevo hilo
				for (int i=0;i<100;i++) {
					System.out.println("Ejecucion fuera de tarea en el hilo  ttimon " + i);
					
				}
		

	}

}

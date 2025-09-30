package hilos;

public class hilos1 extends Thread {
	
	//Creamos el "Hilo" principal que tendra una ejecucion fija
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Ejecucion de tarea en el hilo " + i);
		}
	}

}

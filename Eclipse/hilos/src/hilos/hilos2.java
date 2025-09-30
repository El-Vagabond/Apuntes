package hilos;

public  class hilos2 implements Runnable{

	@Override
	public void run() {
		for(int i =0;i<100;i++) {
			System.out.println("Ejecucion de tarea en el hilo Principal timon "+ i);
		}
	}

}

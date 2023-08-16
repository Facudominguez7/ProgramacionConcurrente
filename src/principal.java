//Para lanzar hilos se hace desde objetos que heredan de thread
//start() se lanzan los hilos
//Los hilos no se tienen que ejecutar cuando se lanzan
//No se sabe el orden de ejecucion de los hilos




public class principal extends Thread {
	
	private int id;
	
	public principal(int id) {
		this.id = id;
	}
	
	public void run() {
		System.out.println("Soy el hilo: "+ id);
	}

	public static void main(String[] args) {
		principal h1 = new principal(1);
		principal h2 = new principal(2);
		principal h3 = new principal(3);
	
		
		h1.start();
		h2.start();
		h3.start();
	
		
		System.out.println("Soy el hilo principal");
		

	}

}

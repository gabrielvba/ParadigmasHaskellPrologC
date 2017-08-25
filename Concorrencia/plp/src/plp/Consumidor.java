package plp;


public class Consumidor extends Thread{
	
	public BufferT buffer;
	public int iteracoes;
	public int id;
	
	public Consumidor(BufferT buffer,int id,int iteracoes) {
		this.buffer = buffer;
		this.iteracoes = iteracoes;
		this.id = id;
	}
	
	@Override
	public void run() {
		int i=0;
		while(i < iteracoes) {
			try {
				System.out.println("Consumidor #" + id + " consumiu: " + buffer.getData());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
		System.out.println("consumidor #" + id + " terminou");
	}

	
	
}

package plp;

public class Produtor extends Thread{
	
	public BufferT buffer;
	public int iteracoes;
	public int id;
	
	public Produtor(BufferT buffer,int id,int iteracoes) {
		this.buffer = buffer;
		this.iteracoes = iteracoes;
		this.id = id;
	}
	
	@Override
	public void run() {
		int i=0;
		while(i < iteracoes) {
			try {
				buffer.setData(i);
				System.out.println("Produtor #" + id + " produziu: " + i);
				i++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Produtor #" + id + " terminou" );
			
	}

}

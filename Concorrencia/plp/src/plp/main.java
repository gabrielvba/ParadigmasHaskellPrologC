package plp;

public class main {

	public static void main(String[] args) {
		
			
			BufferT buffer = new BufferT();
			
			Produtor p1 = new Produtor( buffer,1, 2);
			Produtor p2 = new Produtor( buffer,2, 3);
			Consumidor c1 = new Consumidor(buffer,1, 2);
			Consumidor c2 = new Consumidor( buffer,2, 2);
			
			p1.start();
			p2.start();
			c1.start();
			c2.start();
		
	}
}

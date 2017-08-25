package plp;

public class BufferT {

	int data;
	boolean flag = true;
	
	public BufferT() {

	}

	public synchronized int getData() throws InterruptedException {
		while(flag) {
			wait();
		}
		int retorno = data;
		flag = true;
		notify();
		return retorno;
	}

	public synchronized void setData(int data) throws InterruptedException {
		while(!flag) {
			wait();
		}
		this.data = data;
		flag = false;
		notify();
	}

	

}

package paquete.ejemplo;

public class Hilo extends Thread{
private int id;

	public Hilo(int id) {
	super();
	this.id = id;
}

	@Override
	public void run() {
		for (int i=0; i<200; i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hilo "+id+" i="+i);
		}
	}

}

package JavaConcepts.MultiThreadingConcepts;
class MyThread19 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
			try {Thread.sleep(2000);}catch(InterruptedException e) {}
		}
	}
}
public class DaemonThreadDemo2 {

	public static void main(String[] args) {
		MyThread19 t = new MyThread19();
		t.setDaemon(true);
		t.start();
		System.out.println("end of main thread");
	}
}

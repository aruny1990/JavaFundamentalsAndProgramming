package JavaConcepts.MultiThreadingConcepts;
class MyThread20 extends Thread{
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("I am Lazy Thread");
				Thread.sleep(2000);
			}
		} 
	 catch(InterruptedException e) { System.out.println("I got interrupted"); }
			 	}
}
public class InterruptThreadDemo {

	public static void main(String[] args) {
		MyThread20 t = new MyThread20();
		t.start();
		//t.interrupt();
		System.out.println("End of main thread");
	}
}

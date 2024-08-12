package JavaConcepts.MultiThreadingConcepts;
class MyThread18 extends Thread{
	
}
public class DaemonThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		MyThread18 t = new MyThread18();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
	}
}

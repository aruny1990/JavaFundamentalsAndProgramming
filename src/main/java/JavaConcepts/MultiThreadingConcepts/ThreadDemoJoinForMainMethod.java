package JavaConcepts.MultiThreadingConcepts;
class MyThread7 extends Thread{
	static Thread mt;
	public void run() {
	try {
		mt.join();
	}catch(InterruptedException e) {
		
	}
	for(int i=0;i<10;i++) {
		System.out.println("Child Thread");
	}
	}
}
public class ThreadDemoJoinForMainMethod {

	public static void main(String[] args) throws InterruptedException {
		MyThread7.mt = Thread.currentThread();
		MyThread7 t = new MyThread7();
		t.start();
		t.join();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
	}
}

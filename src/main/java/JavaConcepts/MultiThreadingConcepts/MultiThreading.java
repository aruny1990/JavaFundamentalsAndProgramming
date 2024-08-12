package JavaConcepts.MultiThreadingConcepts;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child Thread");
		}
	}
}
class MultiThreading {
public static void main(String[] args) throws InterruptedException {
	MyThread t = new MyThread();
	t.start();
	Thread.sleep(1000);
	t.sleep(1000);
	for(int i=0;i<10;i++) {
		System.out.println("Main Thread");
	}

}
}

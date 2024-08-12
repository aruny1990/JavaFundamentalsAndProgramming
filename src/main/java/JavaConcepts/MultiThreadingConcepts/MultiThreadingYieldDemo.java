package JavaConcepts.MultiThreadingConcepts;
class Mythread5 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
public class MultiThreadingYieldDemo {
public static void main(String[] args) {
	Mythread5 t = new Mythread5();
	t.start();
	for(int i=0;i<10;i++) {
		System.out.println("Main Thread");
	}
}
}

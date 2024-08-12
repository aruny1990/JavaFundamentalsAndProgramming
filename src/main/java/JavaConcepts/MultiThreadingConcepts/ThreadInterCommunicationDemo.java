package JavaConcepts.MultiThreadingConcepts;

class ThreadB extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculation");
			for (int i = 1; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("Child thread trying to give notification");
			this.notify();
			System.out.println("Notified");
		}
		;
		;
		;
		;
		;// 1 crore lines of code
	}
}

public class ThreadInterCommunicationDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		//b.join();
		//Thread.sleep(1000);
		//System.out.println(b.total);

		synchronized (b) {
			System.out.println("Main trying to call wait() method");
			b.wait();
			System.out.println("Main thread got notification");
			System.out.println(b.total);
		}

	}
}

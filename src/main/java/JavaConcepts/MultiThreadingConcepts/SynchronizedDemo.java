package JavaConcepts.MultiThreadingConcepts;

class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning:");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}

			System.out.println(name);
		}
	}
}

class MyThread9 extends Thread {
	Display d;
	String name;

	MyThread9(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
		MyThread9 t1 = new MyThread9(d, "Dhoni");
		MyThread9 t2 = new MyThread9(d, "Yuvraj");
		MyThread9 t3 = new MyThread9(d, "Kohli");
		t1.start();
		t2.start();
		t3.start();

	}

}

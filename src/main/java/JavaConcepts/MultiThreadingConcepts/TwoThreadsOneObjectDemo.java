package JavaConcepts.MultiThreadingConcepts;
class Display2{
	public synchronized void displayn() {
		for(int i=1;i<10;i++) {
			System.out.print(i);
		}try {Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
	}
	public synchronized void displayc() {
		for(int i=65;i<=75;i++) {
			System.out.print((char)i);
		}try {Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
	}
}

class MyThread10 extends Thread{
	Display2 d;
	MyThread10(Display2 d){
		this.d = d;
	}
	
	public void run() {
		d.displayn();
	}
}

class MyThread11 extends Thread{
	Display2 d;
	MyThread11(Display2 d){
		this.d = d;
	}
	
	public void run() {
		d.displayc();
	}
}
public class TwoThreadsOneObjectDemo {

	public static void main(String[] args) {
		Display2 d = new Display2();
		MyThread10 t1 = new MyThread10(d);
		MyThread11 t2 = new MyThread11(d);
		
		t1.start();
		t2.start();
		
	}
}

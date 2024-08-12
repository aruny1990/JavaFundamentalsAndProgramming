package JavaConcepts.MultiThreadingConcepts;
class Display4{
	public void wish(String name) {
		;;;;;;//1 lakh lines of code
		synchronized(Display4.class) {
			for(int i=0;i<10;i++) {
				System.out.print("Good Morning:");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					
				}
				System.out.println(name);
			}
		}
		;;;;;;//1 lakh lines of code
	}
}

class MyThread13 extends Thread{
	Display4 d;
	String name;
	MyThread13(Display4 d, String name){
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
}

public class SynchronizedDemoWithTwoObjects {
	public static void main(String[] args) {
		Display4 d1 = new Display4();
		Display4 d2 = new Display4();
		MyThread13 t1 = new MyThread13(d1,"Dhoni");
		MyThread13 t2 = new MyThread13(d2,"Yuvraj");
		t1.start();
		t2.start();
		
	}
}

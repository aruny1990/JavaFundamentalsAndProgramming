package JavaConcepts.MultiThreadingConcepts;
class Display3{
	public void wish(String name) {
		;;;;;;//1 lakh lines of code
		synchronized(this) {
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

class MyThread12 extends Thread{
	Display3 d;
	String name;
	MyThread12(Display3 d, String name){
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
}



public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		Display3 d = new Display3();
		MyThread12 t1 = new MyThread12(d,"Dhoni");
		MyThread12 t2 = new MyThread12(d,"Yuvraj");
		t1.start();
		t2.start();
		
	}
}

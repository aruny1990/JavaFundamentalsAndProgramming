package JavaConcepts.MultiThreadingConcepts;

class MyThread2 extends Thread{
	public void run() {
		System.out.println("This run method executed by"+Thread.currentThread().getName());
	}
}
public class ThreadNames {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	MyThread2 t = new MyThread2();
	t.start();
	
	System.out.println("This line executed by"+Thread.currentThread().getName());
	
	System.out.println(t.getName());
	Thread.currentThread().setName("Pawan Kalyan");
	System.out.println(Thread.currentThread().getName());
//	System.out.println(10/0);
//	System.out.println("main method");
//	t.start();
}
}

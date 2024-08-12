package JavaConcepts.MultiThreadingConcepts;
class MyThread3 extends Thread{
	
}
public class ThreadPriority {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getPriority());
	
	//Thread.currentThread().setPriority(15); //IllegalArgumentException
	Thread.currentThread().setPriority(7);
	MyThread3 t = new MyThread3();
	System.out.println(t.currentThread().getPriority());
	
}
}

//MyThread - Parent class - Thread but
//Main Thread is priority thread for MyThread
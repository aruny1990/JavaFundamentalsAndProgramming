package JavaConcepts.MultiThreadingConcepts;
class MyThread4 extends Thread{
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("child Thread");
		}
	}
}
public class ThreadPriority2 {
public static void main(String[] args) {
	MyThread4 t = new MyThread4();
	t.setPriority(10);
	t.start();
	for(int i=0;i<10;i++){
		System.out.println("Main Thread");
	}
	
	
}
}

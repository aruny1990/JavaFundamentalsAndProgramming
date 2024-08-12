package JavaConcepts.MultiThreadingConcepts;
class Mythread6 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreadingJoinDemo {

}

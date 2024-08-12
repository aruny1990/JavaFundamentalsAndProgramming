package JavaConcepts.MultiThreadingConcepts;
class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) { //Job of thread
			System.out.println("Child Thread");//Executed by Child Thread
		}
	}
	
}
public class MultiThreadingUsingRunnableInterface {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		//Thread.sleep(1000);
		for(int i=0;i<10;i++) { //Job of thread
			System.out.println("Main Thread");//Executed by Main Thread
		}
	}

}

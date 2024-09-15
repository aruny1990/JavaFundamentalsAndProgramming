package Codewars;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MakeMeShow {

	public static void makeMeSlow() throws InterruptedException {
		// this function is too fast!
		// long startTime = System.currentTimeMillis(); // Record the start time

	        try {
	            // Delay for 7 seconds
	            Thread.sleep(7000);
	        } catch (InterruptedException e) {
	            // Handle the interruption
	            System.out.println("Thread was interrupted");
	            Thread.currentThread().interrupt(); // Restore the interrupted status
	        }

	       


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	public void ActualTest() throws InterruptedException {
		long time = System.currentTimeMillis();
		MakeMeShow.makeMeSlow();
		long timeTaken = System.currentTimeMillis() - time;
		assertTrue("Time taken was " + timeTaken / 1000 + " seconds: Must take at least 7 seconds!", timeTaken >= 7000);
	}

}

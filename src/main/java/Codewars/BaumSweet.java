package Codewars;

import java.util.Iterator;

public class BaumSweet implements Iterator<Integer> {

	  private long current = 0;
	  
	  @Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			return baumSweet(current++);
		}


	    // Override hasNext to always return true (infinite sequence)
	    
	    // Method to determine Baum-Sweet value for a given `n`
	    public int baumSweet(long n) {
	        if (n == 0) return 1;  // Special case for 0, it's considered the empty string
	        
	        String binary = Long.toBinaryString(n);
	        String[] blocksOfZeros = binary.split("1");

	        // Check if any block of consecutive 0s has odd length
	        for (String block : blocksOfZeros) {
	            if (block.length() % 2 != 0) {
	                return 0;  // Found an odd-length block, return 0
	            }
	        }
	        return 1;  // No odd-length blocks, return 1
	    }

	    // Main method to test the iterator
	    public static void main(String[] args) {
	    	BaumSweet iterator = new BaumSweet();

	        // Print first 20 values of the Baum-Sweet sequence
	        for (int i = 0; i < 20; i++) {
	            System.out.print(iterator.next() + " ");
	        }
	    }

	

		
	
	

}

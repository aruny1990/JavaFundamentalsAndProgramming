package hackerEarth;

import java.util.Scanner;

public class ProfilePicture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the minimum dimension L
        int L = scanner.nextInt();

        // Read the number of photos N
        int N = scanner.nextInt();

        // Loop through each photo
        for (int i = 0; i < N; i++) {
            // Read the width (W) and height (H) of the photo
            int W = scanner.nextInt();
            int H = scanner.nextInt();

            // Check conditions and print the appropriate response
            if (W < L || H < L) {
                System.out.println("UPLOAD ANOTHER");
            } else if (W == H) {
                System.out.println("ACCEPTED");
            } else {
                System.out.println("CROP IT");
            }
        }

        // Close the scanner
        scanner.close();
	}

}

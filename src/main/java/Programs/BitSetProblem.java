package Programs;

import java.util.BitSet;
import java.util.Scanner;

public class BitSetProblem {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Size of BitSets
        int m = sc.nextInt(); // Number of operations

        BitSet A = new BitSet(n);
        BitSet B = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String operation = sc.next();
            int index1 = sc.nextInt();
            int index2 = sc.nextInt();

            switch (operation) {
                case "AND":
                    if (index1 == 1) {
                        A.and(B);
                    } else {
                        B.and(A);
                    }
                    break;
                case "OR":
                    if (index1 == 1) {
                        A.or(B);
                    } else {
                        B.or(A);
                    }
                    break;
                case "XOR":
                    if (index1 == 1) {
                        A.xor(B);
                    } else {
                        B.xor(A);
                    }
                    break;
                case "FLIP":
                    if (index1 == 1) {
                        A.flip(index2);
                    } else {
                        B.flip(index2);
                    }
                    break;
                case "SET":
                    if (index1 == 1) {
                        A.set(index2);
                    } else {
                        B.set(index2);
                    }
                    break;
            }
            System.out.println(A.cardinality() + " " + B.cardinality());
        }

        sc.close();
    }
}

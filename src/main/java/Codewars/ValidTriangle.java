package Codewars;

public class ValidTriangle {
public static void main(String[] args) {
	System.out.println(isValidTriangle(1,2,2));
}

public static boolean isValidTriangle(int a, int b, int c) {
	 // Check if any side is less than or equal to 0
    if (a <= 0 || b <= 0 || c <= 0) {
        return false;
    }

    // Check the triangle inequality theorem
    if (a + b > c && a + c > b && b + c > a) {
        return true;
    }

    return false;
}
}

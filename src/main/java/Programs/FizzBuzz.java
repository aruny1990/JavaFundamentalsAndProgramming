package Programs;

public class FizzBuzz {

	public static void main(String[] args) {
		for(int i=0;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz and i = "+i);
			}else if(i%3==0) {
				System.out.println("Fizz and i  = "+i);
			}else if(i%5==0) {
				System.out.println("Buzz and i = "+i);
			}else {
				System.out.println("i is = "+i);
			}
		}
	}
}

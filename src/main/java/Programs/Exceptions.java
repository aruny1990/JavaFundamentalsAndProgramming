package Programs;

public class Exceptions {
public static void main(String[] args) {
	int a = 10/0;
	try {
		System.out.println("In try block");
	}catch(Exception e) {
		System.out.println("In catch block");
	}finally {
		System.out.println("In finally block");
	}
}
}

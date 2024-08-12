package Programs;

class CustomeException extends Exception{
	public CustomeException(String message) {
        super(message);
    }
}
public class CreatingCustomException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int a=10, b=20;
		 if (a<b) {
	            throw new CustomeException("Custom checked exception occurred");
	        }
	}

}

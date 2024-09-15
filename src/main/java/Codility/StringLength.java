package Codility;

public class StringLength {

	public static void main(String[] args) {
		String name = "Arun";
		System.out.println(stringLeng(name));
	}

	private static int stringLength(String name) {
		// TODO Auto-generated method stub
		int length=0;
		int i=0;
		//StringBuilder sb = new StringBuilder(name);
		while(name!= "") {
			System.out.println(name.substring(0,1));
			name = name.replace(name.substring(0,1),"");
			length++;
			i++;
		}
		return length;
	}
	
	private static int stringLeng(String name) {
		// TODO Auto-generated method stub
		int length=0;
		int i=0;
		//StringBuilder sb = new StringBuilder(name);
		while(true) {
			try {
			name = name.substring(1);
			length++;
			}catch(StringIndexOutOfBoundsException e) {
				return length;
			}
		}
		
	}
}

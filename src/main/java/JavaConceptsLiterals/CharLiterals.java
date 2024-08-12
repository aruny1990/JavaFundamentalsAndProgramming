package JavaConceptsLiterals;

public class CharLiterals {

	public static void main(String[] args) {
		char ch = 'a'; // valid
		//char ch1 = a; //invalid
		//char ch2 = "a"; //invalid
		//char ch3 = 'ab'; //invalid
		char ch4 = 97;
		//System.out.println(ch4);
		char ch5 = 0XFace;
		//System.out.println(ch5); //valid
		char ch6 = 65535;//valid
		//System.out.println(ch6);
		//char ch7 = 65536; //invalid cannot convert from int to char
		//System.out.println(ch7);
		
		char ch8= 197;
		//System.out.println(ch8);
		char ch9=0;
		System.out.println(ch9);
		char cht = '\u0061';
		System.out.println(cht);
		char chi = '\u0062';
		System.out.println(chi);
		char cha = '\n';
		System.out.println(cha);
		char chd = '\t';
		System.out.println(chd);
		//char chs = '\m'; //invalid CE: IllegalEscape characterLiteral
		//System.out.println(chs);
		
		System.out.println("This is \' symbol");
		System.out.println("This is \" symbol");
		System.out.println("This is \f symbol");
		System.out.println("This is \\ symbol");
		System.out.println("This is \r symbol");
	}
}

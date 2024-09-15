package Codility;

public class ReverseString {
	public static void main(String[] args) {
        String input = "My name is Arun";
        String output = reverseWord(input);
        System.out.println(output);
    }

    public static String reverseWord(String word) {
        int len = 0;
        word = word + " "; //My name is Arun 
        StringBuilder sb = new StringBuilder(word);
        //StringBuilder sb1 = new StringBuilder(word);
        sb = sb.reverse(); // nura si enam yM 
        String rev = sb.toString().trim().replaceAll(" ", ""); //nurasienamyM 
        StringBuilder revSb = new StringBuilder();
        int flag =0;
        for(int i=0;i<word.length();i++) {
        	if(word.charAt(i) != ' ') {
        		len++; //2..
        	}else {
        		for(char ch: rev.toCharArray()) {
        			if(flag!=len) { //0..1..2
        			revSb.append(ch); //nu
        			int index = rev.indexOf(ch);
        			rev = rev.substring(0,index)+rev.substring(index+1,rev.length());
        			flag++;//1..2
        			}else {
        				revSb.append(" ");   //nu rAsi em anyM
        				len=0;
        				flag=0;
        				break;
        			}
        		}
        	}
        	
      
        }
    
    
        return revSb.toString();
    }

}

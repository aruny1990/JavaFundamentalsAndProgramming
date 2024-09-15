package Codewars;

public class DisemVowels {

	public static String disemvowel(String str) {
        // Code away...
      StringBuilder sb = new StringBuilder();
      for(char c: str.toCharArray()){
        if(c=='a' || c=='i' || c=='e' || c=='o' || c=='u' || c=='A' || c=='I' || c=='E' || c=='O' || c=='U'){
          continue;
        }else{
          sb.append(c);
        }
      }
      
      return sb.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(disemvowel("This website is for losers LOL!"));
	}
}

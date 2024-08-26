package Codility;

import java.util.Scanner;

/*There is a road consisting of N segments, numbered fro m0 to N-1, represented by a String S, segment S[K] of the road my contain a
pathole, denoted by a single uppercase "x" character or may be a good segment without any pathhole denoted 
by single dot ".".

For eg string ".X..X" means that there are two patholes in total in the road one is located in segment s[1]
and one in segment S[4}. ALl other segment are good.

The road fixing machines can patch over these consecutive segments at once with asphalt and repair all the patholes
located with each of these segment. Good or already repairedremain good after patching them.

Your task is to compute the minimum order of patches required t orepair all patholes in the road.

Write a function

class solution{
public int solution(String s);}

that, given a string s of length N returns the minimum number of patches required to repair all patholes.

Example
1. Given S = ".X..X" your function should return 2. The road fixing machine could patch. for eg segment 0
-2 and 2-4
2. Given S = "X.XXXXX.X." your function should return 3. The road fixing machine could patch. For eg 0-2,3-5,6-8.
3. Given S= "XX.XXX.." your function should return 2. The road fixing machine could patch for eg 0-2 and 3-5
4. Given S = "XXXX" your function should return 2. The road fixing machine could patch, for eg segment 0-2 and 1-3.*/
public class CountMinNumberOfPatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		System.out.println(solution(S));

	}
	
	public static int solution(String S) {
		int patches=0;
		int i=0;
		int n = S.length();
		
		while(i<n) {
			if(S.charAt(i)=='X') {
				patches++;
				i+=3;//updates the index by nicrementing
			}else {
				i++;
			}
		}
		return patches;
	}

}

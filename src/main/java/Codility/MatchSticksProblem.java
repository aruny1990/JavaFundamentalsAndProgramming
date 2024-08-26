package Codility;
/*There are two wooden sticks of length A and B respectively. Each of them can be cut into shorter sticks 
of integer lengths. Our goal is to construct the largest possible square. In Order to do this we want ot cut the 
sticks in such a way that as to achieve four sticks of the smae length (note that there can be some leftover pieces).
What is the longest side of square that we can achieve?

Write a function

class Solution{

public int solution(int A, int B);
}

that the given integers A, B, returns the side length of the largest square that we can achieve. IF it is not possible
to create any square  the function should return 0

Examples:
1. Given A=10, B=21, the function should return 7. We can split the second stick into three sticks of length 
7 and shorten the first stick by 3.
2. Given A=13, B-11, the function should return 5. We can cut out two sticks from each of the given sticks
3. Given A=2,B=1, the function should return 0, it is not possible to make any square form the given sticks.
4. Given A=1,B=8, the function should return 2. We can cut sticks B into four parts.

Write an effecient algorithm with the following assumptions:
A and B are integers within the range [1..1,000,000,000]


*/
public class MatchSticksProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution(13, 11));
	}

	
	public static int solution(int A, int B) {
		int totalLength = A+B;
		int maxPossibleSide = totalLength/4;

		for(int L= maxPossibleSide; L>=1;L--){
				int neededSticks=4;
				int usedFromA = Math.min(A/L,neededSticks);
				neededSticks -= usedFromA;
				
				int usedFromB = Math.min(B/L,neededSticks);
				neededSticks -= usedFromB;
				if(neededSticks==0){
			return L;
		}
		}


		return 0;
	}
}

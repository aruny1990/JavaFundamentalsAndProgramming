package Codility;

import java.awt.image.AbstractMultiResolutionImage;
import java.util.Arrays;

/*
 * A group of friends is going on a holiday together. They come to a metting point(the start of journey) using N  	cars.
There are P{K} people nad S{K} seats in the K-th car for K in range [0..N-1]. Some of the seats in the car may be free, so it is possible for some of the 
friends to change the car they are in. The friends have decided that, in order to be ecological, they will leave some 
cars parked at the meeting point and travel with few cars as possible.

Write a function:

class solution{

public int solution(int[] P,int[] S);}

the given two array P and S , consisting of N integers each, returns	 the minimum number of cars needed to take all of the friends on holiday.

Examples:
1. Given P=[1,4,1] and S=[1,5,1], the function sohlud return 2. A person from car number 0 can travel in carnumber 
1 instead. This way car 0can be left parked at the meeting point.
2. Given P = [4,4,2,4] and S = [5,5,2,5] the function should return 3. one person can travel in car number 0
and the other person form car number 2 can travel in car number 3.
3 Given P = [2,3,4,2] and S= [2,5,,7,2], the function should return 2.Passenger from car number 0 can travel in car number 1
and paseenger from car nuber 3 can travel in car number 2.

Write an effecient algorithm
- N is in integer within the range [1..100,000]
-each element of array P and S is an integer witihn the range [1,9]
- every friend had a seat in the car they came in, that is, P[K]<= S[K} for each K in the range [0..N-1]
*/
public class MinmumNumberOfCarsNeeded {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{2,3,4,2},new int[]{2,5,7,2}));
	}
	
	public static int solution(int[] P , int[] S){

		int totalPeople=0;
		int totalSeats =0;

		for (int p:P){

		totalPeople+=p;
		}


		Arrays.sort(S);

		int carNeeded=0;

		for(int i=S.length-1;i>=0;i--){
			totalSeats +=S[i];
			carNeeded++;
			if(totalSeats>=totalPeople){
				break;
			}
		}
		return carNeeded;
		}
}

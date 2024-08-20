package JavaConceptsClasses;

import JavaConceptsStrictFp.StrictFpDemo;

public strictfp class StrictfpDemo9 {

	public strictfp void calc(float i, float j) {
		System.out.println(i/j);
	}
	public static void main(String[] args) {
		StrictfpDemo9 d = new StrictfpDemo9();
		d.calc(10,3);
	}
	
	//3.3333333
}

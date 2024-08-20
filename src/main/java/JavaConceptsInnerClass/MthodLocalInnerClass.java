package JavaConceptsInnerClass;

class MthodLocalInnerClass {

	public void m1() {
		class InnerSum {
			int sum;
			public void sum(int x, int y) {
				sum = x + y;
				System.out.println(sum);
			}
			
			
	
		}
		InnerSum s = new InnerSum();
		s.sum(10,20);
	}
	
	public static void main(String[] args) {
		MthodLocalInnerClass ms = new MthodLocalInnerClass();
		ms.m1();
	}
	}

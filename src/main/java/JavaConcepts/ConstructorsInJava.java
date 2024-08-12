package JavaConcepts;

public class ConstructorsInJava {
	int x;
	public ConstructorsInJava(){
		
	}
	
	public ConstructorsInJava(int x){
		this.x =x;
	}
	
	 // Copy constructor
    public ConstructorsInJava(ConstructorsInJava other) {
        this.x = other.x;
    }
	
    
    public void display() {
        System.out.println("x: "+x);
    }
    
	public static void main(String[] args) {
		ConstructorsInJava original = new ConstructorsInJava(30);
		ConstructorsInJava copy = new ConstructorsInJava(original); // Using the copy constructor
        
        original.display(); // Output: Name: John, Age: 30
        copy.display();
        
        original = new ConstructorsInJava(40);
		copy = new ConstructorsInJava(original); // Using the copy constructor
		
		 original.display(); // Output: Name: John, Age: 30
	     copy.display();
	}
}

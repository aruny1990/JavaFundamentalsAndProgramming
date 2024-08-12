package JavaConcepts;

public class CopyConstructorInJava {
	private int field1;
    private String field2;

    // Regular constructor
    public CopyConstructorInJava(int field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    // Copy constructor
    public CopyConstructorInJava(CopyConstructorInJava another) {
        this.field1 = another.field1;
        this.field2 = another.field2;
    }

    // Getters and setters
    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }
    
    public static void main(String[] args) {
    	 // Create an original object
    	CopyConstructorInJava original = new CopyConstructorInJava(10, "Hello");

        // Create a copy of the original object
    	CopyConstructorInJava copy = new CopyConstructorInJava(original);

        // Display the copied object's fields
        System.out.println("Field1: " + copy.getField1());
        System.out.println("Field2: " + copy.getField2());
    }
}

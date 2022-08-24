package constructor;

public class createconstructor {
	int x; //creating  class attribute
	int k;
	String name;
	
	// Create a class constructor for the  class
	public createconstructor(){
		
		x = 5;// Set the initial value for the class attribute x
		k=20;
		name="ravi";
	}
	
	public static void main(String[] args) {
		    createconstructor myobj = new createconstructor(); // Create an object of class Main (This will call the constructor)
		    System.out.println(myobj.name+" "+ (myobj.x+myobj.k)); // Print the value of x
		  }
}

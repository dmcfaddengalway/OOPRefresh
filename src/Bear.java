
public class Bear implements Bears {

	//Instance Variables
	String coatType;
	int pawSize;
	boolean claws;

	//Constructor
	public Bear(String coatType, int pawSize, boolean claws) {
		this.coatType = coatType;
		this.pawSize = pawSize;
		this.claws = claws;
	}
	
	//Methods
	
	public void printDetails() {
		System.out.println("This bear has a " + coatType + " coat with a paw size of " + pawSize + ". It is " + claws 
				+ " that his claws are out.");
	}

	public void growl() {
		System.out.println("The bear growls in a hush tone...almost as if it's trying to say something...!");
	}

	public void growlIntensity() {
		System.out.println("It was ear deadfening. High intensity.");
	}

	public void checkHumanScared() {
		System.out.println("They ran way, they must be terrified.");
	}
	
		//Setters
	
		//Getters
}

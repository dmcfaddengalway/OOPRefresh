
public class BlackBear extends Bear {

	//Instance Variables
	boolean standingUp;
	
	//Constructor
	public BlackBear(String coatType, int pawSize, boolean claws, boolean standingUp) {
		super(coatType, pawSize, claws);
		this.standingUp = standingUp;
	}
	
	//Methods
	
	@Override
	public void printDetails() {
		System.out.println("The Black bear has a " + coatType + " and with a paw size of: " + pawSize + " it is "
				+ "not one to mess with. It is " + claws + " that its claws are out. Also it "
				+ "is " + standingUp + " that it is standing up.");
	}
	
		//Setters
	
		//Getters

}

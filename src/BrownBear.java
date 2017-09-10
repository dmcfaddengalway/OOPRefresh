
public class BrownBear extends Bear {

	//Instance Variables
	String growlSound;
	
	//Constructor
	public BrownBear(String coatType, int pawSize, boolean claws, String growlSound) {
		super(coatType, pawSize, claws);
		this.growlSound = growlSound;
	}
	
	//Methods
	@Override
	public void printDetails() {
		System.out.println("The Black bear has a " + coatType + " and with a paw size of: " + pawSize + " it is "
				+ "not one to mess with. It is " + claws + " that its claws are out. Its growling sound is "
				+  growlSound + "that it is standing up.");
	}
	
		//Setters
	
		//Getters

}

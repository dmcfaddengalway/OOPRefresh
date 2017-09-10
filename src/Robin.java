
public class Robin extends Bird {
	
	//Instance Variables
	String beakType;

	//Constructor
	public Robin(String breed, int age, int maxSpeed, String beakType) {
		super(breed, age, maxSpeed);
		this.beakType = beakType;
	}
	
	//Methods
	
	public void printDetails() {
		System.out.println("This bird has a breed of: " + breed + ", is " + age + " years old, and can fly a max "
				+ "of " + maxSpeed + "mph. It also has a beak type of " + beakType + ".");
	}
	
	public void swoopExtraFood() {
		System.out.println("The Robin gracefully swoops down and punches on a large worm...");
	}
	
		//Setters
		public void setBeakType(String newBeakType) {
			this.beakType = newBeakType;
		}
	
		//Getters
		public String getBeakType() {
			return beakType;
		}

}

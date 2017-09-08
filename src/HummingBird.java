
public class HummingBird extends Bird {
	
	//Instance Variables
	int flapsPerMinute = 0;
	
	//Constructors
	public HummingBird(String breed, int age, int maxSpeed, int flaps) {
		super(breed, age, maxSpeed);
		this.flapsPerMinute = flaps;
	}
	
	//Methods
	
	public void printDetails() {
		System.out.println("This bird has a breed of: " + breed + ", is " + age + " years old, and can fly a max "
				+ "of " + maxSpeed + "mph. It can also flap " + flapsPerMinute + " many times per minute.");
	}
	
	public void humVoice() {
		System.out.println("The humming bird rapidly flaps it wings and lets out distinct chirps...");
	}
	
		//Setters
		public void setNewFlaps(int newFlaps) {
			this.flapsPerMinute = newFlaps;
		}
	
		//Getters
		public int getFlaps() {
			return flapsPerMinute;
		}

}

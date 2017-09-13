
public class Bernese extends Dog {

	//Instance Variables
	boolean doggyPaddle;
	
	//Constructor
	public Bernese(String name, int cutenessFactor, String favouriteActivity, boolean doggyPaddle) {
		super(name, cutenessFactor, favouriteActivity);
		this.doggyPaddle = doggyPaddle;
	}
	
	//Methods
	
	@Override
	public void printDetails() {
		System.out.println("A good boy. Very good. This doggo\'s name is " + name + ". His cutness factor "
				+ "is: " + cutenessFactor + " and his favourite activity is: " + favouriteActivity + ". It is " + 				doggyPaddle + " that this doggy doggy paddle's.");
	}
	
	public void swim() {
		System.out.println("The dog jumps in the lake and swims...");
	}
	
		//Setters
		public void setPaddle(boolean newDoggyPaddle) {
			this.doggyPaddle = newDoggyPaddle;
		}
	
		//Getters
		public boolean getDoggyPaddle() {
			return doggyPaddle;
		}

}

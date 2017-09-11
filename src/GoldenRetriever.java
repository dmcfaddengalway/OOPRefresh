
public class GoldenRetriever extends Dog implements Dogs {

	//Instance Variables
	boolean puppyEyes;
	
	//Constructor
	public GoldenRetriever(String name, int cutenessFactor, String favouriteActivity, boolean puppyEyes) {
		super(name, cutenessFactor, favouriteActivity);
		this.puppyEyes = puppyEyes;
	}

	public void woof() {
		System.out.println("Woof! Woof!");
	}

	public int increaseCuteness() {
		return cutenessFactor++;
	}

	public void pawAt() {
		System.out.println("The doggie paws at you, it might be hungry.");
	}

	public void sleep() {
		System.out.println("Your baby " + name + " rests on its comfy bed.");
	}
	
	//Methods
	
	@Override
	public void printDetails() {
		System.out.println("A good boy. Very good. This doggo\'s name is " + name + ". His cutness factor "
				+ "is: " + cutenessFactor + " and his favourtie acitvity is: " + favouriteActivity + ". It is "
						+ puppyEyes + " that his puppy dog eyes are being used on you right now.");
	}
	
	public void fetchBall() {
		System.out.println("The dog runs after the tennis ball!");
	}
	
		//Setters
		public void setPuppyEyes(boolean newPuppyEyes) {
			this.puppyEyes = newPuppyEyes;
		}
	
		//Getters
		public boolean getPuppyEyes() {
			return puppyEyes;
		}

}


public class Dog {

	//Instance Variables
	String name;
	int cutenessFactor;
	String favouriteActivity;
	
	//Constructor
	public Dog(String name, int cutenessFactor, String favouriteActivity) {
		this.name = name;
		this.cutenessFactor = cutenessFactor;
		this.favouriteActivity = favouriteActivity;
	}
	
	//Methods
	
	public void printDetails() {
		System.out.println("A good boy. Very good. This doggo\'s name is " + name + ". His cutness factor "
				+ "is: " + cutenessFactor + " and his favourtie acitvity is: " + favouriteActivity);
	}
	
	public void bark() {
		System.out.println("The dog barks and wags its tail...");
	}
	
		//Setters
		public void setName(String newName) {
			this.name = newName;
		}
		
		public void setCutenessFactor(int newCutnessFactor) {
			this.cutenessFactor = newCutnessFactor;
		}
		
		public void setFavouriteActivity(String newFavouriteActivity) {
			this.favouriteActivity = newFavouriteActivity;
		}
	
		//Getters
		public String getName() {
			return name;
		}
		
		public int getCuteness() {
			return cutenessFactor;
		}
		
		public String getFavouriteActivity() {
			return favouriteActivity;
		}

}

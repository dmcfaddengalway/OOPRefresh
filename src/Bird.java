
public class Bird {
	
	//Instance Variables
	public String breed = "";
	public int age = 0;
	public int maxSpeed = 0;
	
	//Constructor
	public Bird(String breed, int age, int maxSpeed) {
		this.breed = breed;
		this.age = age;
		this.maxSpeed = maxSpeed;
	}
	
	//Methods
	
	public void printDetails() {
		System.out.println("This bird has a breed of: " + breed + ", is " + age + " years old, and can fly a max of " + maxSpeed + " mph.");
	}
	
		//Setters
		public void setBreed(String newBreed) {
			this.breed = newBreed;
		}
		
		public void setAge(int newAge) {
			this.age = newAge;
		}
		
		public void setMaxSpeed(int newMaxSpeed) {
			this.maxSpeed = newMaxSpeed;
		}
	
		//Getters
		public String getBreed() {
			return breed;
		}
		
		public int getAge() {
			return age;
		}
		
		public int getMaxSpeed() {
			return maxSpeed;
		}

}

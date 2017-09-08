
public class AnimalRunner {

	public static void main(String[] args) {
		
		//Bird instances
		Bird oneBird = new Bird("A", 2, 12);
		Bird twoBird = new HummingBird("B", 3, 24, 240);
		HummingBird threeBird = new HummingBird("C", 4, 30, 180);
		Robin fourBird = new Robin("D", 6, 8, "Long");
		
		//Fish Instances
		Fish oneFish = new Fish("Alaska", 6, true);
		
		//Bird Actions
		oneBird.printDetails();
		
		twoBird.printDetails();
		
		threeBird.printDetails();
		threeBird.humVoice();
		
		fourBird.printDetails();
		fourBird.swoopExtraFood();
		
		//-------
		System.out.println();
		//-------
		
		//Fish Actions
		oneFish.printDetails();
	}

}

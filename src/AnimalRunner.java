
public class AnimalRunner {

	public static void main(String[] args) {
		
		//Bird instances
		Bird oneBird = new Bird("A", 2, 12);
		Bird twoBird = new HummingBird("B", 3, 24, 240);
		HummingBird threeBird = new HummingBird("C", 4, 30, 180);
		Robin fourBird = new Robin("D", 6, 8, "Long");
		
		//Fish Instances
		Fish oneFish = new Fish("Alaska", 6, true);
		Fish twoFish = new Trout("Mississippi", 12, false, false);
		Trout threeFish = new Trout("Erie", 10, true, true);
		Salmon fourFish = new Salmon("Colorado", 7, true, 40);
		
		//Bear Instances
		Bear oneBear = new Bear("rough", 12, true);
		Bear twoBear = new BlackBear("thick", 9, true, false);
		BrownBear threeBear = new BrownBear("coarse", 14, false, "Grrrrr!! Rawr!!");
		BlackBear fourBear = new BlackBear("thin", 22, true, true);
		
		//Dog Instances
		Dog oneDog = new Dog("Amber", 100, "tennis ball");
		GoldenRetriever twoDog = new GoldenRetriever("Alpha", 100, "giving kisses", true);
		
		//Bird Actions
		oneBird.printDetails();
		
		twoBird.printDetails();
		
		threeBird.printDetails();
		threeBird.humVoice();
		
		fourBird.printDetails();
		fourBird.swoopExtraFood();
		
		//-------
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		//-------
		
		//Fish Actions
		oneFish.printDetails();
		
		twoFish.printDetails();
		
		threeFish.printDetails();
		threeFish.diveDeep();
		
		fourFish.printDetails();
		fourFish.jumpHigh();
		
		//-------
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		//-------
		
		//Bear Actions
		oneBear.printDetails();
		oneBear.checkHumanScared();
		
		twoBear.printDetails();
		twoBear.growl();
		
		threeBear.printDetails();
		threeBear.growlIntensity();
		
		fourBear.printDetails();
		
		//-------
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		//-------
		
		//Dog Actions
		oneDog.printDetails();
		oneDog.bark();
		
		twoDog.printDetails();
		twoDog.fetchBall();
	}

}

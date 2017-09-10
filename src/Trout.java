
public class Trout extends Fish {

	//Instance Variables
	boolean flairTails;
	
	//Constructor
	public Trout(String region, int gills, boolean whiskers, boolean flairTails) {
		super(region, gills, whiskers);
		this.flairTails = flairTails;
	}
	
	//Methods
	
	public void printDetails() {
		System.out.println("This fish lives in: " + region + " and has " + gills + " gills. This fish having "
				+ "whiskers is: " + whiskers + ". It is " + flairTails + " that its tail flairs.");
	}
	
	public void diveDeep() {
		System.out.println("The Trout dives very deep looking for food...");
	}
	
		//Setters
		public void setTailType(boolean newTailType) {
			this.flairTails = newTailType;
		}
	
		//Getters
		public boolean getTailType() {
			return flairTails;
		}

}

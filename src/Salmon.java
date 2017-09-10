
public class Salmon extends Fish {
	
	//Instance Variables
	int recordJumpHeight;
	
	//Constructor
	public Salmon(String region, int gills, boolean whiskers, int recordJumpHeight) {
		super(region, gills, whiskers);
		this.recordJumpHeight = recordJumpHeight;
	}
	
	//Methods
	
	public void printDetails() {
		System.out.println("This fish lives in: " + region + " and has " + gills + " gills. This fish having "
				+ "whiskers is: " + whiskers + ". It can jump up to " + recordJumpHeight + " feet high.");
	}
	
	public void jumpHigh() {
		System.out.println("The Salmon jumps high over the waterfall...");
	}
	
		//Setters
		public void setJumpHeight(int jumpHeight) {
			this.recordJumpHeight = jumpHeight;
		}
	
		//Getters
		public int getJumpHeight() {
			return recordJumpHeight;
		}

}

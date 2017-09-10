
public class Fish {
	
	//Instance Variables
	String region;
	int gills;
	boolean whiskers;
	
	//Constructor
	public Fish(String region, int gills, boolean whiskers) {
		this.region = region;
		this.gills = gills;
		this.whiskers = whiskers;
	}
	
	//Methods
	
	public void printDetails() {
		System.out.println("This fish lives in: " + region + " and has " + gills + " gills. This fish having "
				+ "whiskers is: " + whiskers + ".");
	}
	
		//Setters
		public void setRegion(String newRegion) {
			this.region = newRegion;
		}
		
		public void setGills(int newGills) {
			this.gills = newGills;
		}
		
		public void setWhiskers(boolean newWhiskers) {
			this.whiskers = newWhiskers;
		}
	
		//Getters
		public String getRegion() {
			return region;
		}
		
		public int getGills() {
			return gills;
		}
		
		public boolean getWhiskers() {
			return whiskers;
		}

}

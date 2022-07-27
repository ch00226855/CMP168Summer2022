package week2day3;

public class ShowDog extends Dog {

	private int numTrophies;
	
	public ShowDog() {
		super();
		super.setName("Show Dog Doe"); 
		// if the name variable is protected instead of private, then we can write:
		// this.name = "Show Dog Doe";
		numTrophies = 0;
	}
	
	public ShowDog(String name) {
		this();
		super.setName(name);
	}
	
	public ShowDog(String name, double wt,double ht, boolean isVac, int age, int numTrophies) {
		super(name, wt, ht, isVac, age);
		this.numTrophies = numTrophies;
	}
	
	public void addTrophy() {
		this.numTrophies++;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nShowDog: numTrophies=" + numTrophies;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ShowDog) {
			ShowDog sObj = (ShowDog) obj;
			if (super.equals(sObj) &&
				this.numTrophies == sObj.numTrophies) {
				return true;
			}
		}
		return false;
	}
	
	
	public int getNumTrophies() {
		return numTrophies;
	}

	public void setNumTrophies(int numTrophies) {
		if (isValid(numTrophies)) {
			this.numTrophies = numTrophies;
		}
	}
	
	private boolean isValid(double x) {
		return (x >= 0);
	}
}

package ie.harmon.yaa.air;

public class Passenger {

	protected String name;
	protected int carryOns;
	protected int checkedIns; 
	
	public Passenger() {
		carryOns = 1;
		checkedIns = 1;
	}
	
	public Passenger(String name) {
		this.name = name;
	}
	
	public Passenger(String name, int carryOns) {
		this(name);
		this.carryOns = carryOns;
	}
	
	public Passenger(String name, int carryOns, int checkedIns) {
		this(name, carryOns);
		this.checkedIns = checkedIns;
	}
	
	public int getCarryOns() {
		return carryOns;
	}
	
	public int getcheckedIns() {
		return checkedIns;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	
}

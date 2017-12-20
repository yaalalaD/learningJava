package ie.harmon.yaa.air;

public class Passenger {

	private String name;
	private int carryOns;
	private int checkedIns; 
	
	public Passenger() {
		carryOns = 1;
		checkedIns = 0;
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

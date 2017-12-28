package ie.harmon.yaa.air;

public class KidPassenger extends Passenger {
	private int age;
	

	public KidPassenger () {
		super();
		
	}
	
	public KidPassenger (int age) {
		this.age = age;
		if (this.age >=5) {
			carryOns = 1;
			checkedIns = 0;
		}
	}
	
	public int getAge() {
		return age;
	}
	
}
	

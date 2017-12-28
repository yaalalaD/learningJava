package ie.harmon.yaa.air;

import java.util.*;

public class Flight {
	protected int flightNum;
	protected String flightCode;
	protected int seats;
	protected int carryOnsAvailable;
	protected int luggageAvailable;	
	
	
	public Flight() {
		seats = 150;
		carryOnsAvailable = seats * 2;
		luggageAvailable = seats * 2;				
	}

	public Flight (int flightNum) {
		this();
		this.flightNum = flightNum;
	}
	
	public Flight (int flightNum, String flightCode) {
		this(flightNum);
		this.flightCode = flightCode;
	}
	
	public Flight (int flightNum, String flightCode, int seats) {
		this(flightNum, flightCode);
		this.seats = seats;
	}
	
		
	public boolean seatAvailable (int howMany) {
		return seats >= howMany ? true : false;
	}
	
	public boolean luggageAvailable (int howMany) {
		return luggageAvailable >= howMany ? true : false;
	}
	
	public boolean carryOnsAvailable (int howMany) {
		return carryOnsAvailable >= howMany ? true : false;
	}
	
	private void handleNoSeat() {
		System.out.println("Sorry, No seats available on this flight");
	}
	
	private void handleNoCarryOns() {
		System.out.println("Sorry, you can only take " + carryOnsAvailable + " bags with you");
	}
	
	private void handleNoLuggageAvailabe() {
		System.out.println("Sorry, only " + luggageAvailable + " are available on this flight");
	}

	
	private void addCarryOns(int num) {
		if (carryOnsAvailable(num) == true) {
			carryOnsAvailable = carryOnsAvailable - num;
		}
		else handleNoCarryOns();
	}
	
	private void addCheckIns(int num) {
		if (luggageAvailable(num) == true) {
			luggageAvailable = luggageAvailable - num;
		}
		else handleNoLuggageAvailabe();
	}	
	
	public void addPassanger(String name, int carryOns, int checkedIns) {
		Passenger pass = new Passenger(name, carryOns, checkedIns);
		addPassanger(pass);
		
	}
	
	public void addPassanger(Passenger pass) {
		addCheckIns(pass.checkedIns);
		addCarryOns(pass.carryOns);
		
		if (pass instanceof KidPassenger && ((KidPassenger)pass).getAge() <= 5) {
			return;
		}
		else {
			if (seatAvailable(1))
				{
					seats = seats-1; 
				}
			else {
				handleNoSeat();
			}	
		}
	}
	
	

}

package ie.harmon.yaa.air;

import java.util.*;

public class Flight {
	private int flightNum;
	private String flightCode;
	private int seats;
	private int carryOnsAvailable;
	private int luggageAvailable;
	
	
	
	public Flight() {
		seats = 150;
		carryOnsAvailable = seats * 2;
		luggageAvailable = seats * 2;
				
	}

	public Flight (int flightNum) {
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
	
	public void addPassanger(String name, int carryOns, int checkedIns) {
		Passenger pass = new Passenger(name, carryOns, checkedIns);
		addPassanger(pass);
		
	}
	
	public void addPassanger(Passenger pass) {
		if (seatAvailable(1))
			{
				seats = seats-1; 
				carryOnsAvailable = carryOnsAvailable - pass.getCarryOns();
				luggageAvailable = luggageAvailable - pass.getcheckedIns();
			}
		else {
			handleNoSeat();
		}	
	
	}
	
	

}

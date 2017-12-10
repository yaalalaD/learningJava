package ie.harmon.yaa.air;

import java.util.*;

public class Flight {
	private int flightNum;
	private String flightCode;
	private int seats = 150;
	private int carryOnsAvailable = seats * 2;
	
	
	public Flight() { }

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
	
	private void handleNoSeat () {
		System.out.println("Sorry, No seats available on this flight");
	}
	
	public void addPassanger(String name, int carryOns, int checkedIns) {
		if (seatAvailable(1)) {
		Passenger pass = new Passenger(name, carryOns, checkedIns);
		seats = seats-1;
		carryOnsAvailable = carryOnsAvailable - pass.getCarryOns();
		}
		else {
			handleNoSeat();
		}	
		
	}
	
	
	
	

}

package ie.harmon.yaa.air;

import java.util.*;

public class Flight {
	private int flightNum;
	private String flightCode;
	private int seats = 150;
	private int carryOns = seats;
	//private int seatPrice;
	
	
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
		return seats > howMany ? true : false;
	}
	
	
	
	

}

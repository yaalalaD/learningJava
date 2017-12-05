package ie.harmon.yaa.air;

import java.util.*;

public class Flight {
	private int flightNum;
	private String flightCode;
	private int seats = 150;
	
	public Flight() { }

	public Flight (int flightNum) {
		this.flightNum = flightNum;
	}
	
	public Flight (int flightNum, String flightCode) {
		this.flightNum = flightNum;
		this.flightCode = flightCode;
	}
	
	public Flight (int flightNum, String flightCode, int seats) {
		this.flightNum = flightNum;
		this.flightCode = flightCode;
		this.seats = seats;
	}
	
	
	
	
	

}

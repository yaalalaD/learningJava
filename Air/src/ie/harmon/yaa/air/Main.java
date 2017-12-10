package ie.harmon.yaa.air;

import java.io.Console;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flight flight = new Flight(123, "aa", 2);
		System.out.println((Boolean.toString(flight.seatAvailable(2))));
		
		flight.addPassanger("jane", 2, 0);
		System.out.println((Boolean.toString(flight.seatAvailable(2))));
		
		flight.addPassanger("david", 2, 0);
		System.out.println((Boolean.toString(flight.seatAvailable(2))));
		
		flight.addPassanger("jimmy", 2, 0);
		

	}

}

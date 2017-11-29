package ie.harmon.test1.ya;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

class Animals {
	
	 private boolean isAlive;
	 private int age;
	 private boolean vaccinated;
	 private String name;
	 private String owner;
	 private String ownerPhone;
	 private int yearOfBirth;
	 private Date dateOfDeath;
	 private Date vaccineDate;
	 
	 public Animals() {
	 }
	 
	 public Animals(String name) {
		 this.name = name;
	 }
 
	 public Animals(String name, int yearOfBirth) {
		 this.yearOfBirth = yearOfBirth;
	 }
	 
	 public Animals(String name, int yearOfBirth, Date vaccineDate) {
		 this.vaccineDate = vaccineDate;
	 }
	 
	 
	 public String getName() {
		 return name;
	 }
	 
	 public String getOwner() {
		 return owner;
	 }
	 
	 public String getPhone() {
		 return ownerPhone;
	 }
	 
	 private int getYearOfBirth(Date dateOfBirth) {
		 int year = dateOfBirth.getYear();
		 return year;
	 }
	 
	 public void setOwner(String name) {
		 this.name = name;
	 };
	 
	 public void setName(String ownerName) {
		 owner = ownerName;
	 }
	 
	 
	 public void setPhone(String phone) {
		 ownerPhone = phone;
	 }
	 
	 public void setYearOfBirth(int year) {
		 if (year >=1999 && year <= 2018) {
			 yearOfBirth = year;
		 }
		 else {
			 System.out.println("Year must be between 1999 and 2018");
		 }
	 }
	 
	 public void setDateOfDeath (int dd, int mm, int yy) {
		 dateOfDeath = new Date();
		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 System.out.println(dateFormat.format(dateOfDeath));
	 }
	 
	 public void setvVaccineDate (int dd, int mm, int yy) {
		 vaccineDate = new Date(dd, mm, yy);
	 }
	 
	 public int calcAge() {
		 int age=2017-yearOfBirth;
		 return age;
	 }
	 
	 
	 public boolean isAlive(boolean dateOfDeath) {
		boolean isAlive = (dateOfDeath) ? false : true;
		return isAlive;
	 }
	 
	 
	 public boolean isVaccinated (boolean vaccineDate) {
			boolean isVaccinated = (vaccineDate) ? true : false;
			return isVaccinated;
		 }
	 
	 
 

}

package com.javaintro;

public class football {
	
	//instance variable
	int jerserynumber;
	String playername;
	
	//Static variable
	static int countryId;
	static String countryname;
	

	public static void main(String[] args) {
		System.out.println("Main method started !");
		System.out.println("India represent team");
		
		countryId = 91;
		countryname = "india";
		
		
		System.out.println(countryId);
		System.out.println(countryname);
		
		football adhi = new football();
		
		adhi.jerserynumber = 16;
		adhi.playername = "Adithya";
		
		
		System.out.println(adhi.jerserynumber);
		System.out.println(adhi.playername);
		
		
		
		System.out.println("Main method Ended !");
		

	}

}

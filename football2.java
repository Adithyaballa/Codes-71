package com.javaintro;

public class football2 {
	
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
		System.out.println("*************************");
		
		System.out.println("countryId: " + countryId);
		System.out.println("Name of the Country: " + countryname);
		
		adhi.jerserynumber = 16;
		adhi.playername = "Adithya";
		
		
		System.out.println("jersery number: "+ adhi.jerserynumber);
		System.out.println("playername: " + adhi.playername);
		
		System.out.println("*************************");
		
		football Seshu = new football();
		
		countryId = 92;
		countryname = "bhutan";
		
		System.out.println("countryId: " + countryId);
		System.out.println("Name of the Country: " + countryname);
		
		Seshu.jerserynumber = 11;
		Seshu.playername = "Naga Shankar";
		
        System.out.println("jersery number: "+ Seshu.jerserynumber);
		System.out.println("playername: " + Seshu.playername);
		
		System.out.println("******************************");
		
		football gopi = new football();
		
		System.out.println("countryId: " + countryId);
		System.out.println("Name of the Country: " + countryname);
		
		gopi.jerserynumber = 14;
		gopi.playername = "Hemanth";
		
        System.out.println("jersery number: "+ gopi.jerserynumber);
		System.out.println("playername: " + gopi.playername);
		
		System.out.println("Main method Ended !");
		

	}

}

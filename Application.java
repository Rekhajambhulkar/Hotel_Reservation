package com.bridgelabz.hotelreservatonservice;

import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) throws ParseException {
	HotelManagementService hotelManagementSystem = new HotelManagementService();
        System.out.println("Welcome to Hotel Reservation System");
        
	while(true) {
        System.out.println("Choose Options " +
                "\n1. Add Hotel" + "10: Exit );
        String userOption = scanner.next();
            switch (userOption) {
                case "1" :
                    hotelManagementservice.addHotel();
                    break;
                case "10" :
                    System.exit(0);
        }
    }
}

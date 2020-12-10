package com.bridgelabz.hotelreservatonservice;

import java.text.ParseException;
import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);
    HotelManagementService hotelManagementSystem = new HotelManagementService();

    public static void main (String[] args) throws ParseException {

        System.out.println("Welcome to Hotel Reservation System");

        Application application = new Application();
        application.provideUserOption();
    }

    public void provideUserOption() throws ParseException {
        while(true) {
        System.out.println("Choose Options " +
                "\n1. Add Hotel" +
                "\n2. Find Cheapest Hotel " );
        String userOption = scanner.next();
            switch (userOption) {
                case "1" :
                    addHotel();
                    break;
                case "2":
                    findCheapestHotel();
		case "3":
			findCheapestHotel1();
			break;
                case "10" :
                    System.exit(0);
            }
        }
    }

    public void addHotel() {
        Hotel hotel = new Hotel();
        System.out.println("Enter Hotel Name");
        String name = scanner.next();
        System.out.println("Enter weekday rate ");
        float rate = scanner.nextFloat();
        System.out.println("Enter weekend rate");
        float weekendRate = scanner.nextFloat();
	System.out.println("Enter Ratings of hotel");
        int ratings = scanner.nextInt();
        hotel.setHotelName(name);
        hotel.setRate(rate);
        hotel.setWeekendRate(weekendRate);
        hotel.setRatings(ratings);
        hotelManagementSystem.hotelList.add(hotel);
        System.out.println(hotelManagementSystem.hotelList);
    }

    public void findCheapestHotel() throws ParseException {

        System.out.println("Enter check-In Date : (dd/mm/yyyy)");
        String checkInDate = scanner.next();
        System.out.println("Enter check-Out Date : (dd/mm/yyyy)");
        String checkOutDate = scanner.next();

        String Day1 = hotelManagementSystem.findDayOfWeek(checkInDate);
        String Day2 = hotelManagementSystem.findDayOfWeek(checkOutDate);

        int days = hotelManagementSystem.findDateDifference(checkInDate, checkOutDate);
        System.out.println("Number of days stying in hotel " + days);

        Hotel cheapestHotel = hotelManagementSystem.findCheapestHotel(days);
        float totalRate = cheapestHotel.getRate() * days;

        Hotel cheapestHote2 = hotelManagementSystem.findCheapestHotel(days);
        float totalWeekendRate = cheapestHotel.getWeekendRate() * 2;

        if (Day1.equalsIgnoreCase("Saturday") | Day1.equalsIgnoreCase("Sunday") | Day2.equalsIgnoreCase("Saturday") | Day2.equalsIgnoreCase("Sunday")) {
            System.out.println("Best hotel availble on weekend  " + cheapestHotel.getName() + " having rate $" + totalWeekendRate);
        } else {
            System.out.println("Cheapest hotel is " + cheapestHote2.getName() + " having rate $" + totalRate);
        }
    }

	public void findCheapestHotel1() throws ParseException {

        	System.out.println("Enter check-In Date : (dd/mm/yyyy)");
        	String checkInDate = scanner.next();
        	System.out.println("Enter check-Out Date : (dd/mm/yyyy)");
        	String checkOutDate = scanner.next();

        	String Day1 = hotelManagementSystem.findDayOfWeek(checkInDate);
        	String Day2 = hotelManagementSystem.findDayOfWeek(checkOutDate);

        	int days = hotelManagementSystem.findDateDifference(checkInDate, checkOutDate);
        	System.out.println("Number of days stying in hotel " + days);

        	Hotel cheapestHotel = hotelManagementSystem.findCheapestHotel(days);
        	float totalRate = cheapestHotel.getRate() * days;
        
        	ArrayList<Hotel> bestRatedlist = new ArrayList<>();
        	for(Hotel hotel : hotelManagementSystem.hotelList) {
        		if(hotel.getRatings() >= 4) {
        			bestRatedlist.add(hotel);
        		}
        	}
        	System.out.println("Best rated hotel is:" +bestRatedlist);
       
        	bestRatedlist.stream();
        	bestRatedlist.sort(Comparator.comparing(Hotel::getRate));
        	bestRatedlist.forEach((Hotel h) -> System.out.println(h.getHotelName() + h.getRate()*days + h.getRatings()));
        
	}
}

package com.bridgelabz.hotelmanagement;

public class HotelManagementService { 
	ArrayList<Hotel> hotelList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public void addHotel() {
        Hotel hotel = new Hotel();
        System.out.println("Enter Hotel Name");
        String name = scanner.next();
        System.out.println("Enter rate ");
        float rate = scanner.nextFloat();
        hotel.setHotelName(name);
        hotel.setRate(rate);
        hotelManagementSystem.hotelList.add(hotel);
        System.out.println(hotelList);
    }
}

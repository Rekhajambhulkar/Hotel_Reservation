package com.bridgelabz.hotelmanagement;

public class Hotel {
	private String HotelName;
	private int rates;
        private float weekendRate;


public Hotel(String hotelName, int rates) {
		this.HotelName = hotelName;
		this.rates = rates;
	}

	public String getHotelName() {
		return HotelName;
	}

	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}

	public int getRates() {
		return rates;
	}

	public void setRates(int rates) {
		this.rates = rates;
	}

 	public float getWeekendRate() {
        	return weekendRate;
    	}

    	public void setWeekendRate(float weekendRate) {
        	this.weekendRate = weekendRate;
    	}

	@Override
	public String toString() {
		return "Hotel [HotelName=" + HotelName + ", rates=" + rates + ", weekendrate = " + weekendRate + "]";
	}

	 @Override
    	public int compareTo(Hotel h) {
        	return (int) (this.rate - h.rate);
    	}
}

package com.bridgelabz.hotelmanagement;

public class Hotel {
	private String HotelName;
	private int rates;

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

	@Override
	public String toString() {
		return "Hotel [HotelName=" + HotelName + ", rates=" + rates + "]";
	}
}

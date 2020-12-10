package com.bridgelabz.hotelreservatonservice;

public class Hotel implements Comparable<Hotel> {
    private String HotelName;
    private float rate;
    private float weekendRate;
    private int ratings;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelname) {
        this.hotelName = hotelName;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(float weekendRate) {
        this.weekendRate = weekendRate;
    }


    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", rate=" + rate +
                ", weekendRate=" + weekendRate + ", ratings =" + rating + '}';
    }


    @Override
    public int compareTo(Hotel h) {
        return (int) (this.rate - h.rate);
    }


}

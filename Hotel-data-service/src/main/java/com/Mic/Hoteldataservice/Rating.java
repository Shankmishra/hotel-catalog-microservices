package com.Mic.Hoteldataservice;

public class Rating {
String Hotelid;
int Rating;
public String getHotelid() {
	return Hotelid;
}
public void setHotelid(String hotelid) {
	Hotelid = hotelid;
}
public int getRating() {
	return Rating;
}
public void setRating(int rating) {
	Rating = rating;
}
public Rating(String hotelid, int rating) {
	Hotelid = hotelid;
	Rating = rating;
}

}

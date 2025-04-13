package com.Mic.Hotelinfoservice;

public class Hotel {
String Hotelid;
String name;
public String getHotelid() {
	return Hotelid;
}
public Hotel(String hotelid, String name) {
	super();
	Hotelid = hotelid;
	this.name = name;
}
public void setHotelid(String hotelid) {
	Hotelid = hotelid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}

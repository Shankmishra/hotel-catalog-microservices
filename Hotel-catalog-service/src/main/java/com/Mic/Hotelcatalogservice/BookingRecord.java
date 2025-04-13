package com.Mic.Hotelcatalogservice;

public class BookingRecord {
String BookingId;
String Userid;
String Hotelid;
int TotalPrice;
String Phoneno;
public String getBookingId() {
	return BookingId;
}
public void setBookingId(String bookingId) {
	BookingId = bookingId;
}
public String getUserid() {
	return Userid;
}
public String getPhoneno() {
	return Phoneno;
}
public void setPhoneno(String phoneno) {
	Phoneno = phoneno;
}

public BookingRecord(String bookingId, String userid, String hotelid, int totalPrice, String phoneno) {
	super();
	BookingId = bookingId;
	Userid = userid;
	Hotelid = hotelid;
	TotalPrice = totalPrice;
	Phoneno = phoneno;
}
public void setUserid(String userid) {
	Userid = userid;
}
public String getHotelid() {
	return Hotelid;
}
public void setHotelid(String hotelid) {
	Hotelid = hotelid;
}
public int getTotalPrice() {
	return TotalPrice;
}
public void setTotalPrice(int totalPrice) {
	TotalPrice = totalPrice;
}
}

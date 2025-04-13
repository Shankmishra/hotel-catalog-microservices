package com.Mic.Hotelcatalogservice;

public class Hotel {
	
	String Hotelname;
	String Hotelid;
	int MaximumRooms;
	int cost;
	public String getHotelname() {
		return Hotelname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Hotel(String hotelname, String hotelid, int maximumRooms,int costs) {
		super();
		Hotelname = hotelname;
		Hotelid = hotelid;
		MaximumRooms = maximumRooms;
		cost=costs;
	}
	public void setHotelname(String hotelname) {
		Hotelname = hotelname;
	}
	public String getHotelid() {
		return Hotelid;
	}
	public void setHotelid(String hotelid) {
		Hotelid = hotelid;
	}
	public int getMaximumRooms() {
		return MaximumRooms;
	}
	public void setMaximumRooms(int maximumRooms) {
		MaximumRooms = maximumRooms;
	}
	
	
}
package com.Mic.Hotelcatalogservice;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import ManageUser.example.User.User;

@EnableHystrix
@Controller
@RequestMapping("/Catalog")
public class HotelCatalogResorce {
	Map<String,Hotel> HotelRecord = new HashMap<String,Hotel>();
	Map<String,BookingRecord> BookingR = new HashMap<String,BookingRecord>();
	
	@Autowired
	private RestTemplate r;
    
	@RequestMapping(value="/Hotels",method = RequestMethod.GET)
	public String Hotels() {
		//ModelAndView model = new ModelAndView("Hotels");
		//model.addObject("HotelRecord",HotelRecord);
		
		  HotelRecord.put("I2",new Hotel("A","I2",20,2000)); HotelRecord.put("I3",new
		  Hotel("B","I3",10,2000)); HotelRecord.put("I4",new Hotel("C","I4",13,2000));
		  HotelRecord.put("I5",new Hotel("D","I5",2,2000));
		return "Hotelp";   
	}
	
	@RequestMapping(value="/Booking",method = RequestMethod.POST)
	@ResponseBody  
	@HystrixCommand(fallbackMethod = "getfallbackBooking")
	public Map<String,BookingRecord> Booking(@ModelAttribute("Hotels") String Hotelname) {
		System.out.print("Entered incide----------------");
		User Cl = r.getForObject("http://User-Service/CurrentLogin", User.class);
		System.out.print("ITSSSSS valueee"+Cl.getMid());
		BookingR.put(Hotelname+Cl.getMid(),new BookingRecord(Hotelname+Cl.getMid(),Cl.getMid(),Hotelname,HotelRecord.get(Hotelname).cost,Cl.getPhoneNumer()));
		System.out.print("Booking doneeeeeeeeeeeeeeeeeee");
		HotelRecord.put(Hotelname,new Hotel(HotelRecord.get(Hotelname).Hotelname,HotelRecord.get(Hotelname).Hotelid,HotelRecord.get(Hotelname).MaximumRooms-1,HotelRecord.get(Hotelname).cost));
		return BookingR;
	}    
	public BookingRecord getfallbackBooking() {
		return new BookingRecord("null","null","null",0,"null");
	}
	
	} 
	  
	/*
	 * @RequestMapping("/{uid}")
	 * 
	 * @HystrixCommand(fallbackMethod = "getfallbackmethod") public Catalogitemlist
	 * getCatalog(@PathVariable("uid") String uid) {
	 * 
	 * 
	 * 
	 * return ratings.stream().map(rating1-> { Hotel h=
	 * r.getForObject("http://localhost:8081/Hotels/"+rating1.getHotelid(),
	 * Hotel.class); return new
	 * CatalogItem(h.getHotelid(),"Test",rating1.getRating())
	 * }).collect(Collectors.toList());
	 * 
	 * //Hotel h=r.getForObject("http://localhost:8081/Hotels/es", Hotel.class);
	 * 
	 * 
	 * ratings.stream().map() RatingP->{ return null;});
	 * 
	 * 
	 * List<CatalogItem> Cataloglist =new ArrayList<CatalogItem>(); Rating ro=
	 * r.getForObject("http://Hotel-data-service/Ratings/"+uid,Rating.class); Hotel
	 * ho= r.getForObject("http://Hotel-info-service/Hotels/"+uid,Hotel.class);
	 * 
	 * 
	 * Cataloglist.add(new CatalogItem(ho.getName(),"Test",ro.getRatingP()));
	 * //return Collections.singletonList(new
	 * CatalogItem(ho.getName(),"Test",ra.RatingP));
	 * 
	 * Catalogitemlist cl =new Catalogitemlist(); cl.setCatalist(Cataloglist);
	 * return cl;
	 * 
	 * } public Catalogitemlist getfallbackmethod(@PathVariable("uid") String uid) {
	 * return (Catalogitemlist) Arrays.asList(new CatalogItem("","",0)); }
	 */

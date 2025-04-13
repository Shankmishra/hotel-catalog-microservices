package com.Mic.Hotelinfoservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hotels")
public class HotelCotroller {
	@RequestMapping("/{HotelId}")
	public Hotel getinfo(@PathVariable("HotelId") String HotelId) {
		return new Hotel(HotelId, "demo");
		
	}
}

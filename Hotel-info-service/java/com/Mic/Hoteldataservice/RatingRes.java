package com.Mic.Hoteldataservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/Ratings")
public class RatingRes {
	

	@RequestMapping("/{Hotelid}")
    public Rating getrating(@PathVariable("Hotelid") String Hotelid) {
		List<Rating> ratings = Arrays.asList(
				new Rating("123",4),
				new Rating("90",3)
		);
		Ratinglist rli = new Ratinglist();
		rli.setRl(ratings);
		return new Rating("123",4);
    	
    }
}

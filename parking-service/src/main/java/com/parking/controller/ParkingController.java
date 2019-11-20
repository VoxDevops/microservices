package com.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/park")
public class ParkingController {

	@GetMapping("/car")
	public String cars() {
		return "Hello";
	}
}

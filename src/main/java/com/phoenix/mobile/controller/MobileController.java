package com.phoenix.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phoenix.mobile.entity.Mobile;
import com.phoenix.mobile.service.MobileService;

@RestController
public class MobileController {

	@Autowired
	private MobileService mobileService;

	// Endpoint to add the Mobile
	@PostMapping("/addMobile")
	public String addMobile(@RequestBody Mobile mobile) {
		String addMobile = mobileService.addMobile(mobile);
		return "Mobile Added Successfully";
	}

	// Endpoint to delete the Mobile
	@DeleteMapping("/deleteMobile/{mobileId}")
	public String deleteMobile(@PathVariable Integer mobileId) {
		mobileService.deleteMobileById(mobileId);
		return "Mobile deleted Successfully";
	}

	// Endpoint to get All the Mobile
	@GetMapping("/getMobile")
	public List<Mobile> getAllMobile() {
		List<Mobile> allMobile = mobileService.getAllMobile();
		return allMobile;
	}

	// Endpoint to get Mobile By Brand
	@GetMapping("/getByBrand/{brand}")
	public List<Mobile> getMobileByBrand(@PathVariable String brand) {
		List<Mobile> mobileByBrand = mobileService.getMobileByBrand(brand);
		return mobileByBrand;
	}

	// Endpoint to get Mobile By Model
	@GetMapping("/getByModel/{model}")
	public List<Mobile> getMobileByModel(@PathVariable String model) {
		List<Mobile> mobileByModel = mobileService.getMobileByModel(model);
		return mobileByModel;
	}

	// Endpoint to get Mobile By Colour
	@GetMapping("/getByColour/{colour}")
	public List<Mobile> getMobileByColour(@PathVariable String colour) {
		List<Mobile> mobileByColour = mobileService.getMobileByColour(colour);
		return mobileByColour;
	}

	// Endpoint to get Mobile in ascending order By user input
	@GetMapping("/ascending/{field}")
	public List<Mobile> getMobileByAscending(@PathVariable String field) {
		List<Mobile> ascendingMobile = mobileService.getAllMobileWithAscendingOrder(field);
		return ascendingMobile;
	}

	// Endpoint to get Mobile in descending order By user input
	@GetMapping("/descending/{field}")
	public List<Mobile> getMobileByDescending(@PathVariable String field) {
		List<Mobile> descendingMobile = mobileService.getAllMobileWithDescendingOrder(field);
		return descendingMobile;
	}

}

package com.phoenix.mobile.service;

import java.util.List;

import com.phoenix.mobile.entity.Mobile;

public interface MobileService {

	public String addMobile(Mobile mobile);

	public String deleteMobileById(Integer mobileId);

	public List<Mobile> getAllMobile();

	public List<Mobile> getMobileByBrand(String brand);

	public List<Mobile> getMobileByModel(String model);

	public List<Mobile> getMobileByColour(String colour);
	
	public List<Mobile> getAllMobileWithAscendingOrder(String field);
	
	public List<Mobile> getAllMobileWithDescendingOrder(String field);

}

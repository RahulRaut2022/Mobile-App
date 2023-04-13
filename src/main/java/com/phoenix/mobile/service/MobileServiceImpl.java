package com.phoenix.mobile.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.phoenix.mobile.entity.Mobile;
import com.phoenix.mobile.repository.MobileRepository;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	private MobileRepository mobileRepo;

	@Override
	public String addMobile(Mobile mobile) {
		Mobile mobileAdded = mobileRepo.save(mobile);
		return "Mobile Added SuccessFully";
	}

	@Override
	public String deleteMobileById(Integer mobileId) {

		Optional<Mobile> findById = mobileRepo.findById(mobileId);
		if (findById.isPresent()) {
			Mobile mobile = findById.get();
			mobileRepo.delete(mobile);
			return "Mobile deleted Sucessfully";
		} else {
			return "Mobile not found";
		}

	}

	@Override
	public List<Mobile> getAllMobile() {
		return mobileRepo.findAll();
	}

	@Override
	public List<Mobile> getMobileByBrand(String brand) {
		return mobileRepo.findByBrand(brand);
	}

	@Override
	public List<Mobile> getMobileByModel(String model) {
		return mobileRepo.findByModel(model);
	}

	@Override
	public List<Mobile> getMobileByColour(String colour) {
		return mobileRepo.findByColour(colour);
	}

	@Override
	public List<Mobile> getAllMobileWithAscendingOrder(String field) {
		return mobileRepo.findAll(Sort.by(Sort.Direction.ASC, field));
	}

	@Override
	public List<Mobile> getAllMobileWithDescendingOrder(String field) {
		return mobileRepo.findAll(Sort.by(Sort.Direction.DESC, field));
	}

}

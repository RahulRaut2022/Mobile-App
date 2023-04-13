package com.phoenix.mobile.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phoenix.mobile.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Serializable> {

	@Query(value = "From Mobile where brand =:brand")
	public List<Mobile> findByBrand(String brand);

	@Query(value = "From Mobile where model =:model")
	public List<Mobile> findByModel(String model);

	@Query(value = "From Mobile where colour =:colour")
	public List<Mobile> findByColour(String colour);

}

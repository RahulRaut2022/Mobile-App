package com.phoenix.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "mobile_app")
public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mobileId;
	@Column(name = "Brand")
	private String brand;
	@Column(name = "Model")
	private String model;
	@Column(name = "Colour")
	private String colour;
	@Column(name = "Price")
	private long price;

}

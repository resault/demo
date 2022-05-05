package com.example.demo.entity;

import com.example.demo.dto.AddressDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor
public class Address {

	private String city;
	private String street;
	private String zipcode;

	public void update(AddressDto addressDto) {
		this.city = addressDto.getCity();
		this.street = addressDto.getStreet();
		this.zipcode = addressDto.getZipcode();
	}
}

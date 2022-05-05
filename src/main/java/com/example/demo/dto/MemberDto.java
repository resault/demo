package com.example.demo.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
public class MemberDto {

	private String name;

	private AddressDto addressDto = new AddressDto();

	public MemberDto(String name) {
		this.name = name;
	}
}

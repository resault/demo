package com.example.demo.entity;

import com.example.demo.dto.MemberDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Member {

	@Id @GeneratedValue
	private Long id;

	@Column(unique = true)
	private String name;

	@Embedded
	private Address address = new Address();

	@OneToMany(mappedBy = "member")
	private List<Ordr> orders = new ArrayList<>();

	public Member(MemberDto memberDto) {
		this.update(memberDto);

	}

	private void update(final MemberDto memberDto) {
		this.name = memberDto.getName();
		this.address.update(memberDto.getAddressDto());
	}
}

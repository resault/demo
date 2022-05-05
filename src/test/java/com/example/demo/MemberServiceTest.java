package com.example.demo;

import com.example.demo.dto.MemberDto;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class MemberServiceTest {

	@Autowired
	MemberService service;

	@Test
	void 회원가입() {
		// Given
		MemberDto memberDto = new MemberDto("Test1");

		// When
		Long savedId = service.join(memberDto);

		// Then
		assertThat(memberDto.getName()).isEqualTo(service.findMember(savedId).getName());
	}

	@Test
	void 중복회원() {
		MemberDto memberDto1 = new MemberDto("Test2");
		MemberDto memberDto2 = new MemberDto("Test2");

		service.join(memberDto1);
		Exception e = assertThrows(IllegalStateException.class,() -> service.join(memberDto2));

		assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

	}
}

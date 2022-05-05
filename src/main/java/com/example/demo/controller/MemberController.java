package com.example.demo.controller;

import com.example.demo.dto.MemberDto;
import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

	final MemberService service;

	@GetMapping("/members/new")
	public String joinForm() {
		return "members/joinMembersForm";
	}

	@PostMapping("/members/new")
	public String join(MemberDto memberDto) {
		//todo AddressDto는 왜 매핑 안되는지 확인
		service.join(memberDto);
		return "redirect:/";
	}

}

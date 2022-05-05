package com.example.demo.service;

import com.example.demo.dto.MemberDto;
import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

	final MemberRepository repository;

	/**
	 * 회원가입
	 */
	public Long join(MemberDto memberDto) throws IllegalStateException{
		validateDuplicatieMember(memberDto);// 중복 검증
		Member member = repository.save(new Member(memberDto));
		return member.getId();
	}

	private void validateDuplicatieMember(MemberDto memberDto) throws IllegalStateException{
		List<Member> memberList = repository.findByName(memberDto.getName());

		if(memberList != null && !memberList.isEmpty())
			throw new IllegalStateException("이미 존재하는 회원입니다.");
	}


	/**
	 * 전체회원 조회
	 */
	public List<Member> findMember(){
		return repository.findAll();
	}

	/**
	 * ID로 회원 조회
	 */
	public Member findMember(Long id) {
		return repository.findById(id).get();	//todo Optional로 변경
	}
}

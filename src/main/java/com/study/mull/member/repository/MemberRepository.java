package com.study.mull.member.repository;

import com.study.mull.member.dto.MemberDto;
import com.study.mull.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByEmail(String email);

    Optional<MemberDto> save(MemberDto dto);
}

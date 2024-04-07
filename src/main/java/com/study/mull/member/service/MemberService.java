package com.study.mull.member.service;

import com.study.mull.member.dto.MemberDto;
import com.study.mull.member.entity.Member;
import com.study.mull.member.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository repository;

    public Member save() {

        /**
         * findBy로 계정 없을 경우만 저장
         */

        return null;
    }

}

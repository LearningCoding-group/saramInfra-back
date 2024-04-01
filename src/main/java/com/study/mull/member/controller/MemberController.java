package com.study.mull.member.controller;

import com.study.mull.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MemberController {


    @GetMapping("/member")
    public Member login() {


        return null;
    }

}

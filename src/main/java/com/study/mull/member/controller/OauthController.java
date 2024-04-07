package com.study.mull.member.controller;

import com.study.mull.member.oauth.OauthService;
import com.study.mull.member.oauth.OauthType;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/oauth")
@RestController
public class OauthController {

    private final OauthService service;


    @SneakyThrows
    @GetMapping("/{oauthType}")
    ResponseEntity<Void> redirectedAuthCodeRequestUrl(
            @PathVariable OauthType oauthType,
            HttpServletResponse response
            ) {
        String redirect = service.getAuthCodeRequestUrl(oauthType);
        response.sendRedirect(redirect);
        return ResponseEntity.ok().build();
    }

}

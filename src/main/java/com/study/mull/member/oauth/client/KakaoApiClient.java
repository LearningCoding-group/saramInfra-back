package com.study.mull.member.oauth.client;

import static org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE;

import com.study.mull.member.dto.KakaoToken;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.PostExchange;

public interface KakaoApiClient {

    @PostExchange(url = "https://kauth.kakao.com/oauth/token", contentType = APPLICATION_FORM_URLENCODED_VALUE)
    KakaoToken fetchToken(
            @RequestParam MultiValueMap<String, String> multiValueMap
            );
}

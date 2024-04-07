package com.study.mull.member.oauth.auth;

import com.study.mull.config.KakaoOauthConfig;
import com.study.mull.member.oauth.AuthCodeRequestUrlProvider;
import com.study.mull.member.oauth.OauthType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@RequiredArgsConstructor
public class KakaoAuthCodeRequestUrlProvider implements AuthCodeRequestUrlProvider {

    private final KakaoOauthConfig kakaoOauthConfig;

    @Override
    public OauthType sup() {
        return OauthType.KAKAO;
    }

    @Override
    public String provide() {
        return UriComponentsBuilder
                .fromUriString("https://kauth.kakao.com/oauth/authorize")
                .queryParam("response_type", "code")
                .queryParam("client_id", kakaoOauthConfig.clientId())
                .queryParam("redirect_uri", kakaoOauthConfig.redirectedUri())
                .queryParam("scope", String.join(",", kakaoOauthConfig.scope()))
                .toUriString()
                ;
    }
}

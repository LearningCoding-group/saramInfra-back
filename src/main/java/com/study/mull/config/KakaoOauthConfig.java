package com.study.mull.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "oauth.kakao")
public record KakaoOauthConfig (
        String redirectedUri,
        String clientId,
        String clientSecret,
        String[] scope
) {

}


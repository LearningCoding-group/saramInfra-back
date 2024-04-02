package com.study.mull.member.oauth.client;

import com.study.mull.config.KakaoOauthConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KakaoMemberClient implements OauthMemberClient{

    private final KakaoApiClient kakaoApiClient;
    private final KakaoOauthConfig config;



}

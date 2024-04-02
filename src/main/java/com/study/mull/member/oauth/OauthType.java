package com.study.mull.member.oauth;

import java.util.Locale;

// 네이버나 구글도 쓸 경우
public enum OauthType {

    KAKAO,
    ;

    public static OauthType from(String type) {
        return OauthType.valueOf(type.toUpperCase(Locale.ENGLISH));
    }
}

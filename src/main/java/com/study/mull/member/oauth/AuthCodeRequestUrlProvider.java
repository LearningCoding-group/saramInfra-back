package com.study.mull.member.oauth;

// Code 발급할 URL 제공
public interface AuthCodeRequestUrlProvider {

    OauthType sup();
    String provide();
}

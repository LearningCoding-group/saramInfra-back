package com.study.mull.member.oauth;

import com.study.mull.member.oauth.auth.AuthCodeRequestUrlProviderComposite;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OauthService {

    private final AuthCodeRequestUrlProviderComposite authCodeRequestUrlProviderComposite;

    public String getAuthCodeRequestUrl(OauthType oauthType) {
        return authCodeRequestUrlProviderComposite.provide(oauthType);
    }
}

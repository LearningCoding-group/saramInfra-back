package com.study.mull.member.oauth.auth;

import com.study.mull.exception.ApplicationException;
import com.study.mull.exception.ErrorCode;
import com.study.mull.member.oauth.AuthCodeRequestUrlProvider;
import com.study.mull.member.oauth.OauthType;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;


// OauthType의 종류에 따라, 해당하는 AuthCodeRequestUrlProvider을 사용해 URL을 생성할 수 있도록 함
@Component
public class AuthCodeRequestUrlProviderComposite {

    private final Map<OauthType, AuthCodeRequestUrlProvider> map;

    public AuthCodeRequestUrlProviderComposite(Set<AuthCodeRequestUrlProvider> providers) {
        map = providers.stream()
                .collect(Collectors.toMap(
                        AuthCodeRequestUrlProvider::sup,
                        Function.identity()
                ));
    }

    public String provide(OauthType oauthType) {
        return getProvider(oauthType).provide();
    }

    private AuthCodeRequestUrlProvider getProvider(OauthType oauthType) {
        return Optional.ofNullable(map.get(oauthType))
                .orElseThrow(() -> new ApplicationException(ErrorCode.NOT_SUPPORT));
    }
}

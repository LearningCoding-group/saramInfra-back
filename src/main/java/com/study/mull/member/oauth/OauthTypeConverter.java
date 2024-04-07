package com.study.mull.member.oauth;

import org.springframework.core.convert.converter.Converter;

public class OauthTypeConverter implements Converter<String, OauthType> {


    @Override
    public OauthType convert(String source) {
        return OauthType.from(source);
    }
}

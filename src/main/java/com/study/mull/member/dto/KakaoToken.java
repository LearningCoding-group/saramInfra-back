package com.study.mull.member.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(SnakeCaseStrategy.class)
public record KakaoToken(
    String tokenType,
    String accessToken,
    String userToken,
    Long expires,
    String refreshToken,
    Long refreshTokenExpires,
    String scope
) {
}

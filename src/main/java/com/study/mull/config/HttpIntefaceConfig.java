package com.study.mull.config;

import com.study.mull.member.oauth.client.KakaoApiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class HttpIntefaceConfig {

    @Bean
    public KakaoApiClient kakaoApiClient() {
        return createHttpInterface(KakaoApiClient.class);
    }

    private <T> T createHttpInterface(Class<T> tClass) {
        WebClient webClient = WebClient.create();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(webClient)).build();

        return factory.createClient(tClass);
    }
}


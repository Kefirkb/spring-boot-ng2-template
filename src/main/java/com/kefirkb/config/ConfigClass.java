package com.kefirkb.config;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.context.annotation.ScopedProxyMode.TARGET_CLASS;

@Configuration
public class ConfigClass {

    @Bean
    @Scope(proxyMode = TARGET_CLASS, value = "prototype")
    ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }
}

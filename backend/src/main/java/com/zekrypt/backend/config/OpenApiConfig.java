package com.zekrypt.backend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(
                        new Info()
                                .title("Zekrypt API")
                                .version("v1")
                                .description(
                                        "Zero Knowledge Encrypted Cloud Storage API"
                                )
                );
    }
}
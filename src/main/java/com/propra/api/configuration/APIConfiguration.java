package com.propra.api.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIConfiguration {

    @Bean
    public OpenAPI setupAPI() {
        return new OpenAPI()
                .info(new Info()
                    .title("My first Spring API")
                    .version("1.0 test")
                    .description("This is a description"));
    }
}

package io.project.sp;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("publicapi")
                .packagesToScan("io.project")
                .pathsToMatch("/api/**")
                .build();
    }

}

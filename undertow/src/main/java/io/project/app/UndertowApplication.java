package io.project.app;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("io.project.app")
@EnableScheduling
public class UndertowApplication {

    public static void main(String[] args) {
        final SpringApplication application = new SpringApplication(UndertowApplication.class);
        application.setBannerMode(Banner.Mode.CONSOLE);
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

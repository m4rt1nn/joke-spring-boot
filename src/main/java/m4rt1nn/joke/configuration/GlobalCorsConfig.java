package m4rt1nn.joke.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GlobalCorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Apply to all endpoints
                .allowedOriginPatterns("*") // Allow specific origins
                .allowedMethods("*") // Allow specific HTTP methods
                .allowedHeaders("*") // Allow specific headers
                .allowCredentials(true); // Allow credentials (cookies, authorization headers)
    }
}

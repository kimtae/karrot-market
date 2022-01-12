package site.karrot.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.karrot.server.service.ProductService;

@Configuration
public class BeanConfig {

    @Bean
    public ProductService scanProductService() {
        return new ProductService();
    }
}

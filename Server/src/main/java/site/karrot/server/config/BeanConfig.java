package site.karrot.server.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.karrot.server.repository.ProductCategoryRepository;
import site.karrot.server.repository.ProductRepository;
import site.karrot.server.service.ProductService;

@Configuration
public class BeanConfig {

    private final ProductRepository productRepository;

    @Autowired
    public BeanConfig(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //프로덕트 서비스 빈 등록
    @Bean
    public ProductService scanProductService() {
        return new ProductService(productRepository);
    }

}

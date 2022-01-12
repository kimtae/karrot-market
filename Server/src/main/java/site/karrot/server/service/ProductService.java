package site.karrot.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import site.karrot.server.dto.ProductDto;
import site.karrot.server.entity.Product;
import site.karrot.server.entity.ProductCategory;
import site.karrot.server.repository.ProductRepository;

public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product postingProduct(ProductDto.Request request) {

        Product product = new Product(request);

        return productRepository.save(product);
    }

}

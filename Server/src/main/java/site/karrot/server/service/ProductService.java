package site.karrot.server.service;

import site.karrot.server.dto.ProductDto;
import site.karrot.server.entity.Product;
import site.karrot.server.entity.ProductCategory;

public class ProductService {

    public Product postingProduct(ProductDto.Request request, String category) {

        Product product = new Product(request);

        return productRepository.save(product);
    }

}

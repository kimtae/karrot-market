package site.karrot.server.service;

import site.karrot.server.dto.ProductDto;
import site.karrot.server.entity.Product;
import site.karrot.server.entity.ProductCategory;

public class ProductService {

    public void postingProduct(ProductDto.Request request, String category) {

        Product product = new Product(request);

        productRepository.save(product);
    }

}

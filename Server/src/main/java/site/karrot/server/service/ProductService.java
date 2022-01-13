package site.karrot.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import site.karrot.server.dto.ProductDto;
import site.karrot.server.entity.Product;
import site.karrot.server.entity.ProductCategory;
import site.karrot.server.repository.ProductCategoryRepository;
import site.karrot.server.repository.ProductRepository;

import java.util.List;

public class ProductService {

    private final ProductRepository productRepository;
    private final ProductCategoryRepository productCategoryRepository;

    @Autowired
    public ProductService(ProductRepository productRepository, ProductCategoryRepository productCategoryRepository) {
        this.productRepository = productRepository;
        this.productCategoryRepository = productCategoryRepository;
    }

    public Product postingProduct(ProductDto.Request request) {

        ProductCategory productCategory = productCategoryRepository
                .findByProductCategory(request.getProductCategory())
                .orElseThrow(
                        () -> new NullPointerException("존재하지 않는 카테고리입니다.")
                );

        Product product = new Product(request, productCategory);

        return productRepository.save(product);
    }

    public void getProductList() {
        List<Product> productList = productRepository.findAll();
        //TODO 스트림 함수 사용한 리스폰스 DTO
    }

    @Transactional
    public Product getProduct(Long idx) {
        Product product =  productRepository.findById(idx).orElseThrow(
                () -> new NullPointerException("존재하지 않는 글입니다.")
                //TODO IDX
        );
        product.updateHitCount();
        return product;
    }

    public void updateProduct(Long idx, ProductDto.Request request) {
        Product product = productRepository.findById(idx).orElseThrow(
                () -> new NullPointerException("존재하지 않는 글입니다.")
        );
        //TODO IDX
        product.updateProduct(request);
    }
}

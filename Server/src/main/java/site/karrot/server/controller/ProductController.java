package site.karrot.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import site.karrot.server.dto.ProductDto;
import site.karrot.server.entity.Product;
import site.karrot.server.service.ProductService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public void getProductList() {
        productService.getProductList();
    }

    @PostMapping("/product")
    public Product postingProduct(@Valid @RequestBody ProductDto.Request requestDto) {
        return productService.postingProduct(requestDto);
    }

    @GetMapping("/product/{idx}")
    public Product getProduct(@PathVariable Long idx) {
        return productService.getProduct(idx);
    }

    @PatchMapping("/product/{idx}")
    public String updateProduct(@PathVariable Long idx,@Valid @RequestBody ProductDto.Request request) {
        productService.updateProduct(idx, request);
        return "게시글이 수정되었습니다 !";
    }
}

package site.karrot.server.repository;

import org.springframework.data.repository.Repository;
import site.karrot.server.entity.ProductCategory;

import java.util.Optional;

public interface ProductCategoryRepository extends Repository<ProductCategory, Long> {

    Optional<ProductCategory> findByProductCategory(String productCategory);
}

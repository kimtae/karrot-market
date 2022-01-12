package site.karrot.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.karrot.server.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

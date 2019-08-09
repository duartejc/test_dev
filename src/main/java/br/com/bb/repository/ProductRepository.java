package br.com.bb.repository;

import br.com.bb.domain.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

     public List<Product> findByCategoryId(Integer categoryId);
     
}

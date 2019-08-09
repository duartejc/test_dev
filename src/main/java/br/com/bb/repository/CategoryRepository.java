package br.com.bb.repository;

import br.com.bb.domain.Category;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    public List<Category> findByNameContaining(String e);
    
}

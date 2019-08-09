package br.com.bb.controller;


import br.com.bb.domain.Category;
import br.com.bb.repository.CategoryRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jean Duarte
 */
@RestController()
@Api(value = "Categoria", description = "API para manutenção de categorias")
class CategoryController {

    private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);
    
    private final CategoryRepository repository;

    CategoryController(CategoryRepository repository) {
        logger.debug("Instantiating and setting repository: {}", repository);
        this.repository = repository;
    }

    @ApiOperation(value = "Listagem de todas as categorias de produtos")
    @GetMapping("/category/listAll")
    List<Category> all() {
        logger.debug("Listing all categories");
        
        List<Category> categories = repository.findAll();
        
        logger.debug("Found {} categories. Returning", categories.size());
         
        return categories;
    }
    
    @ApiOperation(value = "Retorna a categoria com a maior ocorrência de uma determinada letra em seu nome. ")
    @GetMapping("/category/moreOccurenceOf/{letter}")
    Category all(@PathVariable String letter) {
        logger.debug("Finding categories with letter {}", letter);
        
        List<Category> categories = repository.findByNameContaining(letter);
        
        logger.debug("Sorting by letter occurence");
        
        categories.sort(
            (Category c1, Category c2) -> new Long(c2.getName().chars().filter(ch -> ch == 'e').count())
                    .compareTo(c1.getName().chars().filter(ch -> ch == 'e').count())
        );
        
        return categories.get(0);
        
    }

}

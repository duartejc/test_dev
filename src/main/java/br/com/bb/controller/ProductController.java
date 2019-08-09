package br.com.bb.controller;


import br.com.bb.domain.Product;
import br.com.bb.repository.ProductRepository;
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
@Api(value = "Produto", description = "API para manutenção de produtos")
class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    private final ProductRepository repository;

    ProductController(ProductRepository repository) {
        logger.debug("Instantiating and setting repository: {}", repository);
        this.repository = repository;
    }

    @ApiOperation(value = "Listagem de todos os produtos filtrados por categoria")
    @GetMapping("/product/listByCategory/{categoryId}")
    List<Product> allByCategory(@PathVariable Integer categoryId) {
        logger.debug("Listing all products by category: {}", categoryId);
        List<Product> products = repository.findByCategoryId(categoryId);
        
        logger.debug("Found {} products. Returning", products.size());
        return products;
    }

}

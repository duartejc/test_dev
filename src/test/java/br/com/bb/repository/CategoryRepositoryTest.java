/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.repository;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

import br.com.bb.domain.Category;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Jean Duarte
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void whenFindByNameContaining_thenReturnCategories() {
        
        // given I have two categories: "Brinquedos" and "Medicamentos"
        Category categoryBrinquedos = categoryRepository.findOne(90);
        Category categoryMedicamentos = categoryRepository.findOne(91);
        
        // when I call the findByLetter method passing letter "e" as argument.
        List<Category> categories = categoryRepository.findByNameContaining("e");

        // then it returns categories "Brinquedos" and "Medicamentos".
         assertThat(categories, hasItems(categoryBrinquedos, categoryMedicamentos));
    }

}

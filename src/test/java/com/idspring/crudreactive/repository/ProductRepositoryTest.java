package com.idspring.crudreactive.repository;

import com.idspring.crudreactive.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

/**
 * @author Eko Kurniawan Khannedy
 * @since 27/10/17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RepositoryApplication.class)
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testFindAllByCategoryId() throws Exception {
        productRepository.save(createProductWithCategoryId("1")).block();
        productRepository.save(createProductWithCategoryId("2")).block();
        productRepository.save(createProductWithCategoryId("1")).block();
        productRepository.save(createProductWithCategoryId("2")).block();
        productRepository.save(createProductWithCategoryId("1")).block();

        List<Product> product1 = productRepository.findAllByCategoryId("1").collectList().block();
        assertEquals(3, product1.size());

        List<Product> product2 = productRepository.findAllByCategoryId("2").collectList().block();
        assertEquals(2, product2.size());
    }

    private Product createProductWithCategoryId(String categoryId) {
        return Product.builder()
                .id(UUID.randomUUID().toString())
                .name("Dummy")
                .categoryId(categoryId)
                .build();
    }
}
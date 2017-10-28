package com.idspring.crudreactive.repository;

import com.idspring.crudreactive.entity.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

/**
 * @author Eko Kurniawan Khannedy
 * @since 24/10/17
 */
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

    Flux<Product> findAllByCategoryId(String categoryId);

}

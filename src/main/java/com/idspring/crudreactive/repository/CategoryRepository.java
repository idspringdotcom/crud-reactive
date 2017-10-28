package com.idspring.crudreactive.repository;

import com.idspring.crudreactive.entity.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author Eko Kurniawan Khannedy
 * @since 24/10/17
 */
public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {

}

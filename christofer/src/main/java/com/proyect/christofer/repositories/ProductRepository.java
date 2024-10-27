package com.proyect.christofer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.proyect.christofer.entities.Product;

@RepositoryRestResource(path = "producto")
public interface ProductRepository extends CrudRepository<Product, Long> {
}

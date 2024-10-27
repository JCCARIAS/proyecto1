package com.proyect.christofer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.proyect.christofer.entities.ShoppingCart;

@RepositoryRestResource(path = "shopping-carts")
public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}

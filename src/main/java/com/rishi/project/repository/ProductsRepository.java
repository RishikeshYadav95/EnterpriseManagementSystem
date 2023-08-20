package com.rishi.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rishi.project.model.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {

}

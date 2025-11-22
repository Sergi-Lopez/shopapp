package com.shop.shopapp.repository;

import com.shop.shopapp.model.Category;
import com.shop.shopapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Product, Long> {
    List<Category> findByName(String name);
}

package com.project.shop.model.da;

import com.project.shop.model.entity.dataModel.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDa extends JpaRepository<Product,Integer> {
}

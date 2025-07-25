package com.project.shop.model.da;

import com.project.shop.model.entity.dataModel.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDa extends JpaRepository<Category,Integer> {
}

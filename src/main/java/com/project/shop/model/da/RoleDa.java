package com.project.shop.model.da;

import com.project.shop.model.entity.dataModel.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDa extends JpaRepository<Role,Integer> {
}

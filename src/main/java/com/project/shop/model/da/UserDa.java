package com.project.shop.model.da;

import com.project.shop.model.entity.dataModel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDa extends JpaRepository<User,Integer> {

}

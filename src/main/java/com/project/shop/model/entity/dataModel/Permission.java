package com.project.shop.model.entity.dataModel;


import com.project.shop.model.entity.embeded.Creation;
import com.project.shop.model.entity.embeded.Title;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "permissions")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Embedded
    private Title title;
    @Embedded
    private Creation creation;
    @ManyToMany(mappedBy = "permissions")
    private List<Role> roles;
}

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
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Embedded
    private Title title;
    @Embedded
    private Creation creation;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "permission_role",
               joinColumns = @JoinColumn(name = "role_id"),
               inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private List<Permission> permissions;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}

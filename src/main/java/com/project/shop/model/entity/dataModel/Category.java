package com.project.shop.model.entity.dataModel;

import com.project.shop.model.entity.embeded.CreationDelete;
import com.project.shop.model.entity.enums.IsActive;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category category;

    @OneToMany(mappedBy = "category", cascade = CascadeType.PERSIST)
    private List<Category> categories;

    private String name;
    private Boolean hasChild;
    private Integer depth;
    @Enumerated(EnumType.STRING)
    private IsActive isActive;
    @Embedded
    private CreationDelete creationDelete;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
    @OneToMany(mappedBy = "category")
    private List<Attribute> attributes;
}

package com.project.shop.model.entity.dataModel;

import com.project.shop.model.entity.embeded.CreationDelete;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "attributes")
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @Embedded
    private CreationDelete creationDelete;

    @OneToMany(mappedBy = "attribute")
    private List<AttrValue> attrValue;
}

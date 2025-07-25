package com.project.shop.model.entity.dataModel;

import com.project.shop.model.entity.embeded.CreationDelete;
import com.project.shop.model.entity.enums.IsActive;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String family;
    private String ncode;
    private String username;
    private String phoneNumber;
    private String email;
    private String pass;
    @Enumerated(EnumType.STRING)
    private IsActive isActive;
    private Timestamp lastLogin;
    @Embedded
    private CreationDelete creationDelete;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private Set<Address> address;
    @ManyToMany
    @JoinTable(name = "role_user",joinColumns = @JoinColumn(name = "user_id")
            ,inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;

    @OneToMany
    private List<Order> orders;

}

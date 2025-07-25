package com.project.shop.model.entity.embeded;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Creation {
    @Transient
    private Timestamp created_at;
    private Timestamp updated_at;
}

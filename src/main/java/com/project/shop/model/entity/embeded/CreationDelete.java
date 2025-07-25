package com.project.shop.model.entity.embeded;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
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
public class CreationDelete {
    @Embedded
    private Creation creation;
    private Timestamp deleted_at;
}

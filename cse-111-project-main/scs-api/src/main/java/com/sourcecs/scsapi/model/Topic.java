package com.sourcecs.scsapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@SuperBuilder
public class Topic {

    @Id
    private long id;

    private String name;

}

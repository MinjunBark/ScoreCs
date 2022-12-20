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
public class Question {

    @Id
    private long id;

    private String text;
    private String difficulty;
    private int respondTime;
}

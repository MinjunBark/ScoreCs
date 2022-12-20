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
public class Answer {

    @Id
    private int id;

    private String text;
    private boolean isAnswer;

}

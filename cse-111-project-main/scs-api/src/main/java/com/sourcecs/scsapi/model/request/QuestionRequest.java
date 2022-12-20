package com.sourcecs.scsapi.model.request;


import lombok.Data;

@Data


public class QuestionRequest {

    private int id;

    private String text;
    private String difficulty;
    private int respondTime;
}

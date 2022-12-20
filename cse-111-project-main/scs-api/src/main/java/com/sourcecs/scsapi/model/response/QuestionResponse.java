package com.sourcecs.scsapi.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class QuestionResponse extends BaseResponse {

    private long id;
    private String ign;
    private String text;
    private String difficulty;

    private long wins;
    private long loses;

}

package com.sourcecs.scsapi.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class TopicResponse extends BaseResponse {

    private long id;
    private String name;

}

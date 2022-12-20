package com.sourcecs.scsapi.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class UserResponse extends BaseResponse {

    private long id;
    private String email;
    private String ign;
    private long wins;
    private long loses;
    private long collegeId;

}

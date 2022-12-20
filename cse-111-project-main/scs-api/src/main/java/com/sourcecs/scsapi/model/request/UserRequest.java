package com.sourcecs.scsapi.model.request;

import lombok.Data;

@Data
public class UserRequest {

    private String email;
    private String ign;
    private String password;
    private long collegeId;


}

package com.sourcecs.scsapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private long id;

    private String email;
    private String ign;
    private String password;
    private long wins;
    private long loses;

}

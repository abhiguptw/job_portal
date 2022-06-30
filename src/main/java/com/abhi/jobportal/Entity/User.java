package com.abhi.jobportal.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table("abhi")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String password;
}

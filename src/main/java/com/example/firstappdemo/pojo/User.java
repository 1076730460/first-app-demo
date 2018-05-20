package com.example.firstappdemo.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="USER")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private Integer RoleId;
}

package com.example.firstappdemo.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="ROLE")
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String rolename;
}

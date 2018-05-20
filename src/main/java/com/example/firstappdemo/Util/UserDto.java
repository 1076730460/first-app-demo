package com.example.firstappdemo.Util;

import lombok.Data;

@Data
public class UserDto {
 private Integer id;
 private String rolename;

 public UserDto(Integer id, String rolename) {
  this.id = id;
  this.rolename = rolename;
 }
}

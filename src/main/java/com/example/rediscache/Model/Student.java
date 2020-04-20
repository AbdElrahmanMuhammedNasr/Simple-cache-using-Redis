package com.example.rediscache.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Student implements Serializable {
    int id;
    String fname;
    String lname;
    String dept;
}

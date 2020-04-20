package com.example.rediscache.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table
public class Student implements Serializable {
    @Id
    @GeneratedValue
    private  Long id;
    @Column
    private String fname;
    @Column
    private String lname;
    @Column
    private String dept;
}

package com.example.rediscache.Service;

import com.example.rediscache.Model.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ServiceClass {

    List<Student> list = Arrays.asList(
            new Student(1,"abdo","nasr","cs"),
            new Student(2,"mohamed","ali","it"),
            new Student(3,"hameed","tamer","it"),
            new Student(4,"badawy","hassan","or")
    );
    @Cacheable(value = "student", key = "#id", condition = "#id>2")
    public Student getStudent(int id) throws Exception {
        Thread.sleep(3000);
        return list.stream().filter(e->e.getId() == id).findFirst().get();
    }
}

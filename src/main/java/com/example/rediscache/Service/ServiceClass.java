package com.example.rediscache.Service;

import com.example.rediscache.Model.Student;
import com.example.rediscache.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ServiceClass {

    @Autowired
    private StudentRepo studentRepo;

    @Cacheable(value = "student", key = "#id", condition = "#id>2")
    public Student getStudent(Long id) throws Exception {
        Thread.sleep(3000);
        return  studentRepo.findById(id).get();
    }
}

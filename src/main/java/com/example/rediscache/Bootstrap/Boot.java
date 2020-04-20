package com.example.rediscache.Bootstrap;

import com.example.rediscache.Model.Student;
import com.example.rediscache.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Boot implements CommandLineRunner {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student();
        student1.setFname("abdo");
        student1.setLname("nasr");
        student1.setDept("cs");
        studentRepo.save(student1);

        Student student2 = new Student();
        student2.setFname("ibraheem");
        student2.setLname("nasr");
        student2.setDept("or");
        studentRepo.save(student2);


        Student student3 = new Student();
        student3.setFname("abdo");
        student3.setLname("ibraheem");
        student3.setDept("it");
        studentRepo.save(student3);


        Student student4 = new Student();
        student4.setFname("ahmed");
        student4.setLname("ali");
        student4.setDept("cs");
        studentRepo.save(student4);


        Student student5 = new Student();
        student5.setFname("tamer");
        student5.setLname("nasr");
        student5.setDept("it");
        studentRepo.save(student5);

    }
}

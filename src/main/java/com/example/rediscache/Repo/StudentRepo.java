package com.example.rediscache.Repo;

import com.example.rediscache.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo  extends JpaRepository<Student, Long> {
}

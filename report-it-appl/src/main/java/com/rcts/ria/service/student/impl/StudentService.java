package com.rcts.ria.service.student.impl;

import com.rcts.ria.domain.student.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudent();
    Optional<Student> getStudentById(Long id);
}

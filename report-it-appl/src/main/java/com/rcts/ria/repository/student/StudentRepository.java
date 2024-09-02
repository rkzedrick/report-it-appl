package com.rcts.ria.repository.student;

import com.rcts.ria.domain.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Long> {
    boolean existsByStudentNumberAndEmail(String studentNumber, String email);

    Student findByStudentNumber(String studentNumber);

}

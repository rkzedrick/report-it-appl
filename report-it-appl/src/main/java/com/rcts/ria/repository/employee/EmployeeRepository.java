package com.rcts.ria.repository.employee;

import com.rcts.ria.domain.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, String> {
    boolean existsByEmployeeNumberAndEmail(String employeeNumber, String email);

    Employee findByEmployeeNumber(String employeeNumber);

}

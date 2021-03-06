package com.warehouse_accounting.repositories;

import com.warehouse_accounting.models.Employee;
import com.warehouse_accounting.models.Role;
import com.warehouse_accounting.models.dto.EmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT new com.warehouse_accounting.models.dto.EmployeeDto(" +
            "e.id, " +
            "e.lastName, " +
            "e.firstName, " +
            "e.middleName, " +
            "e.sortNumber, " +
            "e.phone, " +
            "e.inn, " +
            "e.description, " +
            "e.email, " +
            "e.password, " +
            "e.department.id, " +
            "e.position.id, " +
            "e.image.id" +
            ") FROM Employee e")
    List<EmployeeDto> getAll();

    @Query("SELECT new com.warehouse_accounting.models.dto.EmployeeDto(" +
            "e.id, " +
            "e.lastName, " +
            "e.firstName, " +
            "e.middleName, " +
            "e.sortNumber, " +
            "e.phone, " +
            "e.inn, " +
            "e.description, " +
            "e.email, " +
            "e.password, " +
            "e.department.id, " +
            "e.position.id, " +
            "e.image.id" +
            ") FROM Employee e where e.id=:id")
    EmployeeDto getById(@Param("id") Long id);

}

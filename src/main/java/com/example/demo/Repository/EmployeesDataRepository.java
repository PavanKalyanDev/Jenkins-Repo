package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.EmployeesData;

public interface EmployeesDataRepository extends JpaRepository<EmployeesData, Long> {

}

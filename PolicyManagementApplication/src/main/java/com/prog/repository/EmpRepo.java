package com.prog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prog.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
	
	
	List<Employee> findByPatientNameContainingIgnoreCase(String name);

}

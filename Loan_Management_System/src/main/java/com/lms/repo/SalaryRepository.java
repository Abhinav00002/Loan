package com.lms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.model.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Integer> {

}
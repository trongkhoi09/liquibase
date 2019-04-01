package com.spring.liquibasedemo.repository;

import com.spring.liquibasedemo.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
    @Override
    List<Company> findAll();
}

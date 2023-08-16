package com.Inheritance.Mapping.Repository;

import com.Inheritance.Mapping.Entity.ContractEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractEmployeeRepo extends JpaRepository<ContractEmployee, Integer> {
}

package com.Inheritance.Mapping.Repository;

import com.Inheritance.Mapping.Entity.RegularEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegularEmployeeRepo extends JpaRepository<RegularEmployee, Integer> {
}

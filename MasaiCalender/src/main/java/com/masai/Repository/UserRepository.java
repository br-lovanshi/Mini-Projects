package com.masai.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	List<User>findByUsername(String username);
}

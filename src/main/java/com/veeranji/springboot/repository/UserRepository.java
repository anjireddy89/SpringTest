package com.veeranji.springboot.repository;

import java.io.Console;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.veeranji.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query("from User u where u.firstName like %:firstName% ")
	List<User> findByFirstName(@Param("firstName") String firstName);

	@Query("from User u where  u.email like %:email% ")
	List<User> validateUser(@Param("email") String email);

}

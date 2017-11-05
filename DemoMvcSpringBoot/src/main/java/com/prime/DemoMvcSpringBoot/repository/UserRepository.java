package com.prime.DemoMvcSpringBoot.repository;

import org.springframework.data.repository.CrudRepository;

import com.prime.DemoMvcSpringBoot.modelo.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String name);
}

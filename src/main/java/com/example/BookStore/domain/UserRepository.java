package com.example.BookStore.domain;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Usero, Long> {
	Usero findByUsername(String username);
}
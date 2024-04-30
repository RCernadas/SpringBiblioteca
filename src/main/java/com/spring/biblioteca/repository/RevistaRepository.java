package com.spring.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.biblioteca.model.Revista;

public interface RevistaRepository extends JpaRepository<Revista, String> {

}

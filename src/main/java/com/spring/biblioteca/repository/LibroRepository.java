package com.spring.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.biblioteca.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, String> {

}

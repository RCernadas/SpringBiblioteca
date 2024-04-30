package com.spring.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.biblioteca.model.Documento;
import com.spring.biblioteca.model.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {
	
	List<Prestamo> devolverDocumentoPrestamo(Documento documento, String dni);
}

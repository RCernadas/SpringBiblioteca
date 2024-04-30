package com.spring.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.biblioteca.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, String>{

	List<Documento> seleccionarDocumento(String idDoC);
	
	List<Documento> prestarDocumento(String dni, Documento documento);
	
	List<Documento> buscarUnDocumento(String cadenaBusqueda);
}

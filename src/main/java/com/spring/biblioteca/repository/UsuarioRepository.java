package com.spring.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.biblioteca.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	List<Usuario> borrarUsuario(String dni);
	List<Usuario> obtenerUsuario(String dni);
	List<Usuario> insertarUsuario(Usuario usuario);
	
}

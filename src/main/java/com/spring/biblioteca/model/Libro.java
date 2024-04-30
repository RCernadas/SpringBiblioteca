package com.spring.biblioteca.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="libro")
public final class Libro extends Documento {
	
	@Column(name="anho_publicacion")
	private LocalDate anhoPublicacion;
	
	@Column(name="autor")
	private String autor;

	public Libro(String idDocumento, String titulo, boolean isDisponible, LocalDate anhoPublicacion,
			String autor) {
		super(idDocumento, titulo, isDisponible);
		this.anhoPublicacion = anhoPublicacion;
		this.autor = autor;
	}

	public LocalDate getAnhoPublicacion() {
		return anhoPublicacion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAnhoPublicacion(LocalDate anhoPublicacion) {
		this.anhoPublicacion = anhoPublicacion;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}

package com.spring.biblioteca.model;

import com.spring.biblioteca.service.DocumentoService;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="documento")
public abstract class Documento {
	
	@Id
	@Column(name = "id_documento")
	private String idDocumento;
	
	@Column(name = "id_titulo")
	private String titulo;
	
	@Column(name = "is_disponible")
	private boolean isDisponible;
	
	@Column(name = "total_ejemplares")
	private int totalEjemplares;
	
	
	
	public Documento(String idDocumento, String titulo, boolean isDisponible) {
		super();
		this.idDocumento = idDocumento;
		this.titulo = titulo;
		this.isDisponible = isDisponible;
		this.totalEjemplares = DocumentoService.calcularTotalEjemplares();
	}

	public Documento() {
		super();
	}
	
	public String getIdDocumento() {
		return idDocumento;
	}

	public String getTitulo() {
		return titulo;
	}

	public boolean isDisponible() {
		return isDisponible;
	}

	public int getTotalEjemplares() {
		return totalEjemplares;
	}

	public void setIdDocumento(String idDocumento) {
		this.idDocumento = idDocumento;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDisponible(boolean isDisponible) {
		this.isDisponible = isDisponible;
	}

	public void setTotalEjemplares(int totalEjemplares) {
		this.totalEjemplares = totalEjemplares;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Documento [idDocumento=");
		builder.append(idDocumento);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", isDisponible=");
		builder.append(isDisponible);
		builder.append(", totalEjemplares=");
		builder.append(totalEjemplares);
		builder.append("]");
		return builder.toString();
	}
	
}

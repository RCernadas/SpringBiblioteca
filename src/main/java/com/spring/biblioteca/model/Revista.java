package com.spring.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="revista")
public final class Revista extends Documento{

	@Column(name="numero_Revista")
	private int numeroRevista;

	public Revista(String idDocumento, String titulo, boolean isDisponible, int numeroRevista) {
		super(idDocumento, titulo, isDisponible);
		this.numeroRevista = numeroRevista;
	}
	public int calcularTotalEjemplares() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getNumeroRevista() {
		return numeroRevista;
	}

	public void setNumeroRevista(int numeroRevista) {
		this.numeroRevista = numeroRevista;
	}
}

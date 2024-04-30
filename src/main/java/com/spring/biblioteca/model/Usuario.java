package com.spring.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public final class Usuario {
	private static final int SOCIO_NUM_DOCUMENTOS_EN_PRESTAMO = 20;
	private static final int NO_SOCIO_DOCUMENTOS_EN_PRESTAMO = 2;
	
	@Id
	@Column(name="id_usuario")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUsuario;
	
	@Column(name="dni")
	private String dni;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="tipo")
	private TipoUsuario tipo;
	
	private int numDocumentosEnPrestamo;

	public Usuario() {
	}

	public Usuario(String dni, String nombre, TipoUsuario tipo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.tipo = tipo;
		numDocumentosEnPrestamo = 0;
	}
	
	public int getNumDocumentosEnPrestamo() {
		return numDocumentosEnPrestamo;
	}

	public void setNumDocumentosEnPrestamo(int numDocumentosEnPrestamo) {
		this.numDocumentosEnPrestamo = numDocumentosEnPrestamo;
	}

	public boolean superaNumeroMaxDeDocumentosEnPrestamo() {
		boolean ret = false;
		if (getTipo().equals(TipoUsuario.SOCIO)) {
			if (getNumDocumentosEnPrestamo() >= 20) {
				ret = true;
			}
		}
		if (getTipo().equals(TipoUsuario.USUARIO_OCASIONAL)) {
			if (getNumDocumentosEnPrestamo() >= 2) {
				ret = true;
			}
		}
		return ret;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [idUsuario=");
		builder.append(idUsuario);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", tipo=");
		builder.append(tipo.getTipoUsuarioString());
		builder.append("]");
		return builder.toString();
	}
	
	public enum TipoUsuario {

		SOCIO ("Socio"),
		USUARIO_OCASIONAL ("Usuario Ocasional");

		private String tipoUsuarioString;
		
		private TipoUsuario(String string) {
			this.tipoUsuarioString = string;
		}
		public String getTipoUsuarioString() {
			return tipoUsuarioString;
		}
	}
	
}

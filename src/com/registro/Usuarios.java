package com.registro;

import java.io.Serializable;
import java.util.Date;

public class Usuarios implements Serializable {

	private Long userId;
	private String nombreCompleto;
	private String direccion;
	private String telefono;
	private String correoElectronico;
	private Date fechaRegistro;
	private Long estado;

	public Usuarios() {

	}

	public Usuarios(Long userId, String nombreCompleto, String direccion, String telefono, String correoElectronico,
			Date fechaRegistro, Long estado) {
		super();
		this.userId = userId;
		this.nombreCompleto = nombreCompleto;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
		this.fechaRegistro = fechaRegistro;
		this.estado = estado;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Long getEstado() {
		return estado;
	}

	public void setEstado(Long estado) {
		this.estado = estado;
	}

}

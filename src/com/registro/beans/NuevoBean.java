/**
 * 
 */
package com.registro.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.registro.Usuarios;
import com.registro.delegador.Delegador;
import com.registro.delegador.DelegadorImp;

/**
 * @author dagho
 *
 */
public class NuevoBean implements Serializable {

	private Long userId;
	private String nombreCompleto;
	private String direccion;
	private String telefono;
	private String correoElectronico;
	private String correoElectronico2;
	private String login;
	private String password;
	private boolean bEstado;
	private Long estado;
	private Delegador delegador;
	
	public NuevoBean() {
		super();
		delegador = new DelegadorImp();
	}
	
	public String guardar() {
		String rpt = "";
		
		boolean resp = delegador.guardar(nombreCompleto, direccion, telefono, correoElectronico, estado);
		
		if(resp) {
			rpt = "Ir a Lista";
		}
		
		return rpt;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isbEstado() {
		return bEstado;
	}

	public void setbEstado(boolean bEstado) {
		this.bEstado = bEstado;
	}

	public Long getEstado() {
		return estado;
	}

	public void setEstado(Long estado) {
		this.estado = estado;
	}

	public Delegador getDelegador() {
		return delegador;
	}

	public void setDelegador(Delegador delegador) {
		this.delegador = delegador;
	}

	public String getCorreoElectronico2() {
		return correoElectronico2;
	}

	public void setCorreoElectronico2(String correoElectronico2) {
		this.correoElectronico2 = correoElectronico2;
	}

}

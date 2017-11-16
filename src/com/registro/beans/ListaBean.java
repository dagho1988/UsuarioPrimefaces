/**
 * 
 */
package com.registro.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.registro.Usuarios;
import com.registro.delegador.Delegador;
import com.registro.delegador.DelegadorImp;

/**
 * @author dagho
 *
 */
public class ListaBean implements Serializable {

	List<Usuarios> lista = null;
	Delegador delegador = null;

	public ListaBean() {
		super();
		delegador = new DelegadorImp();
	}

	public List<Usuarios> getLista() {
		if(lista == null) {
			lista = delegador.getUsuarios();
		}
		return lista;
	}

	public void setLista(List<Usuarios> lista) {
		this.lista = lista;
	}

	public Delegador getDelegador() {
		return delegador;
	}

	public void setDelegador(Delegador delegador) {
		this.delegador = delegador;
	}

}

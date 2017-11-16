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
public class MenuBean implements Serializable {

	List<String> lista = null;

	public MenuBean() {
		super();
	}

	public String onClick(String nombrePrograma) {
		return nombrePrograma.trim();
	}
	
	public List<String> getLista() {
		if(lista == null) {
			lista = new ArrayList<String>();
			lista.add("Lista de Usuarios");
			lista.add("Nuevo Usuario");
		}
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

}

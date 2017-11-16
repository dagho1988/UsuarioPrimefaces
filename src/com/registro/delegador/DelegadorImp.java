package com.registro.delegador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.registro.Usuarios;

public class DelegadorImp implements Delegador {

	public boolean guardar(String nombreCompleto, String direccion, String telefono, String correoElectronico,
			Long estado) {
		return true;
	}
	
	public List<Usuarios> getUsuarios() {

		List<Usuarios> lista = new ArrayList<Usuarios>();
		
		Usuarios user1 = new Usuarios();
		user1.setNombreCompleto("Alex Hoyos");
		lista.add(user1);

		Usuarios user2 = new Usuarios();
		user2.setNombreCompleto("Diego Giraldo");
		lista.add(user2);
		
		return lista;
	}

}

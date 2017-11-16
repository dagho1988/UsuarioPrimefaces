package com.registro.delegador;

import java.util.List;
import com.registro.Usuarios;

public interface Delegador {

	public boolean guardar(String nombreCompleto, String direccion, String telefono, String correoElectronico,
			Long estado);

	public List<Usuarios> getUsuarios();
	
}

package com.ecodeup.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.ecodeup.model.Cliente;

@ManagedBean (name="clienteBean")
@RequestScoped
public class ClienteBean {
	
	public List<Cliente> obtenerClientes(){
		List<Cliente> listaClientes= new ArrayList<>();
		Cliente c1= new Cliente();
		c1.setId(1L);
		c1.setNombres("JUAN");
		c1.setApellidos("MORENO");
		c1.setDireccion("BOGOTA");
		
		
		Cliente c2= new Cliente();
		c2.setId(2L);
		c2.setNombres("PABLO");
		c2.setApellidos("DUEÑAS");
		c2.setDireccion("BOGOTA");
		listaClientes.add(c1);
		listaClientes.add(c2);
		
		return listaClientes;
	}
}

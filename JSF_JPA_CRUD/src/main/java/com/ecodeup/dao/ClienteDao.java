package com.ecodeup.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecodeup.model.Cliente;
import com.ecodeup.model.JPAUtil;

public class ClienteDao {
	EntityManager entity=JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//guardar cliente
	public void guardar(Cliente cliente) {
		entity.getTransaction().begin();
		entity.persist(cliente);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	//editar cliente
	public void editar(Cliente cliente) {
		entity.getTransaction().begin();
		entity.merge(cliente);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	//buscar cliente
	public Cliente buscar(int id) {
		Cliente c = new Cliente();
		c=entity.find(Cliente.class,id);
		JPAUtil.shutdown();
		return c;
	}
	
	//obtener todos los clientes
	public List<Cliente> obtenerClientes(){
		List<Cliente> ListaClientes= new ArrayList<Cliente>();
		Query q=entity.createQuery("SELECT c FROM CLIENTE c");
		ListaClientes=q.getResultList();
		return ListaClientes;
	}

}

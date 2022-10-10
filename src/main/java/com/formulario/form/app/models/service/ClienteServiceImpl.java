package com.formulario.form.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formulario.form.app.models.dao.IClienteDao;
import com.formulario.form.app.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

	
	//agrego o inyecto el ClienteDao 
	
	@Autowired
	private IClienteDao clienteDao;
		
	
	
	
	//Sobre escribo los metodos:
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return  (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteDao.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findOne(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
		
	}

	
	
	
	
	
	
	
}

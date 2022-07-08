package com.sistema.model;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteDAO {
	
	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jbdc;
	
	@PostConstruct
	private void initialize() {
		jbdc = new JdbcTemplate(dataSource);
	}
	
	public void inserirCliente(RegisterCliente cliente) {
		String sql = "INSERT INTO cliente (nome, email, senha)" + " VALUES (?,?,?)";
		
		Object[] obj = new Object[3];
		obj[0] = cliente.getNome();
		obj[1] = cliente.getEmail();
		obj[2] = cliente.getSenha();
		jbdc.update(sql, obj);
	}
	
	public Map<String, Object> getCliente(int id){
		String sql = "SELECT * FROM cliente WHERE cliente.id = ?";
		Object[] obj = new Object[1];
		obj[0] = id;
		return jbdc.queryForMap(sql,obj);
	}
}

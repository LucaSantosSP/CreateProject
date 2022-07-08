package com.sistema.model;

public class RegisterCliente {
	private int id;
	private String nome;
	private String email;
	private String dtNasc;
	private String senha;
	
	public RegisterCliente(){
		
	}
	
	RegisterCliente(int id, String nome, String email, String dtNasc, String senha){
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dtNasc = dtNasc;
		this.senha = senha;
	}
	
	//-------------------------------Métodos Get e Set------------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}

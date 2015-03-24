package edu.upc.eetac.dsa.rlorenzo.libros.api.model;

import java.util.List;

public class User {
	private int iduser;
	private String rol;
	private String password;
	private String email;
	private String username;
	private String name;
	private List<Resena> resenas;
	private boolean loginSuccessful;
	
	

	public boolean isLoginSuccessful() {
		return loginSuccessful;
	}

	public void setLoginSuccessful(boolean loginSuccessful) {
		this.loginSuccessful = loginSuccessful;
	}

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public List<Resena> getResenas() {
		return resenas;
	}

	public void setResenas(List<Resena> resenas) {
		this.resenas = resenas;
	}

	@Override
	public String toString() {
		return "User [iduser=" + iduser + ", rol=" + rol + ", password="
				+ password + ", email=" + email + ", username=" + username
				+ ", name=" + name + ", resenas=" + resenas + "]";
	}

	
	
	
	

}

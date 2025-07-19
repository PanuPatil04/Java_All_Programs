package com.dkte;

public class User {
	private int id;
	private String name;
	private String email;
	private String pass;
	private String addr;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String email, String pass, String addr) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.addr = addr;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", pass=" + pass + ", addr=" + addr + "]";
	}

	
	

}

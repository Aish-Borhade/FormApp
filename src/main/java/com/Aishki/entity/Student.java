package com.Aishki.entity;

public class Student {

	private String username;
	private String password;
	private Integer mob;
	private String email;
	private String address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getMob() {
		return mob;
	}
	public void setMob(Integer mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", password=" + password + ", mob=" + mob + ", email=" + email
				+ ", address=" + address + "]";
	}
	
	
	
	
}

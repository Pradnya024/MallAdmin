package com.pradnya.Admin.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Malladmin")
public class MallAdmin {
	@Id
	int id;
	String name;
	String password;
	String mall;
	String phone;
	public MallAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MallAdmin(int id, String name, String password, String mall, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.password =password;
		this.mall = mall;
		this.phone = phone;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMall() {
		return mall;
	}
	public void setMall(String mall) {
		this.mall = mall;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}	
}


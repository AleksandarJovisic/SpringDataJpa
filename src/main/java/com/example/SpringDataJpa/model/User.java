package com.example.SpringDataJpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table", catalog = "user_database")
public class User {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "username")
	private String username;

	private String password;

	public User(String username, String password) {
		super();
		this.setUsername(username);
		this.setPassword(password);

	}

	public User() {

	}

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}


package nLayered.entities.concretes;

import nLayered.entities.abstracts.Entity;

public class User implements Entity{

	private int id;
	private String name;
	private String lastName;
	private String password;
	private String eMail;
	public User(int id, String name, String lastName, String password, String eMail) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.password = password;
		this.eMail = eMail;
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
}

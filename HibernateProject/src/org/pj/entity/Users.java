package org.pj.entity;

import javax.persistence.*;

@Entity
@Table(name ="users")

public class Users {
	@Id
	@Column(name ="user_id")
	int userid;
	@Column(name ="name")
	String name;
	@Column(name="lastname")
	String lastname;
	
	public Users(String name, String lastname) {
		
		this.name = name;
		this.lastname = lastname;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}

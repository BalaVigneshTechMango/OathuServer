package com.oauth.authorizationserver.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "roles")
public class RoleEntity implements GrantedAuthority {

	@Id
	private int id;
	private String name;
	
	@ManyToMany(mappedBy = "roleEntities")
	private Set<UserEntity>userEntities;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<UserEntity> getUserEntities() {
		return userEntities;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserEntities(Set<UserEntity> userEntities) {
		this.userEntities = userEntities;
	}

	@Override
	public String getAuthority() {
		return name;
	}
	
	
	
}

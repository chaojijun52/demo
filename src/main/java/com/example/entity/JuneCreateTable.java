package com.example.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="june_create_table")
public class JuneCreateTable implements java.io.Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Integer id;
private String name;
private Set<Hobbies> hobbies=new HashSet<Hobbies>(0);

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@OneToMany(fetch=FetchType.LAZY, mappedBy="juneCreateTable")
//@ElementCollection(targetClass=JuneCreateTable.class)
public Set<Hobbies> getHobbies() {
	return hobbies;
}
public void setHobbies(Set<Hobbies> hobbies) {
	this.hobbies = hobbies;
}

}

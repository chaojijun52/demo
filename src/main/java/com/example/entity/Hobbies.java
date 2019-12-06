package com.example.entity;

import javax.persistence.*;


@Entity
@Table(name="hobbies")
public class Hobbies implements java.io.Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Integer id;
//private Integer pid;
private String hobby;
private Integer years;
private JuneCreateTable juneCreateTable;

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
//public Integer getPid() {
//	return pid;
//}
//public void setPid(Integer pid) {
//	this.pid = pid;
//}
public String getHobby() {
	return hobby;
}
public void setHobby(String hobby) {
	this.hobby = hobby;
}
public Integer getYears() {
	return years;
}
public void setYears(Integer years) {
	this.years = years;
}

@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="pid", nullable=false)
public JuneCreateTable getJuneCreateTable() {
	return juneCreateTable;
}
public void setJuneCreateTable(JuneCreateTable juneCreateTable) {
	this.juneCreateTable = juneCreateTable;
}

}

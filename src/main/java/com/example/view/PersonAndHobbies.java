package com.example.view;

public class PersonAndHobbies implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String hobby;
	private Integer years;

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
	
	public PersonAndHobbies(Integer id, String name, String hobby, Integer years) {
		this.id=id;
		this.name=name;
		this.hobby=hobby;
		this.years=years;
	}
	
	public PersonAndHobbies() {
		
	}

}

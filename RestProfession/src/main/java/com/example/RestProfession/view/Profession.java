package com.example.RestProfession.view;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Profession {
	@Id
	@GeneratedValue
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private String role;
	@Column
	private int age;
	public Profession() 
	{
		super();
	}
	public Profession(Integer id,String name,String role,int age)
	{
		super();
		this.id=id;
		this.name=name;
		this.role=role;
		this.age=age;
	}
	public int getId() {
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Profession [id=" + id + ", name=" + name + ", role=" + role + ", age=" + age + "]";
	}
		
}

package com.Project.Cavs;

import org.hibernate.annotations.*;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
public class Cavalier {
  private String id;
	private String fname;
	private String lname;
	private int age;
	private int height;
	private String position;
	private String college;
	private int ppg;
	private int salary;


	public Cavalier() {};

	public Cavalier(String fname, String lname, int age, int height, String position, String college, int ppg,
			int salary) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.height = height;
		this.position = position;
		this.college = college;
		this.ppg = ppg;
		this.salary = salary;
	}

  @Id
  @GeneratedValue( generator = "uuid" )
  @GenericGenerator(
      name = "uuid",
      strategy = "org.hibernate.id.UUIDHexGenerator",
      parameters = {
          @Parameter(
              name = "uuid_gen_strategy_class",
              value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
          ),
          @Parameter(
              name = "separator",
              value = "-"
          )
      }
  )
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//@Column(nullable=false, name="FirstName")
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	//@Column(nullable=false, name="LastName")
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	//@Column(nullable=false)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//@Column(nullable=false)
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//@Column(nullable=false)
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	//@Column(nullable=false)
	public int getPpg() {
		return ppg;
	}

	public void setPpg(int ppg) {
		this.ppg = ppg;
	}

	@Column(nullable=false)
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}



}

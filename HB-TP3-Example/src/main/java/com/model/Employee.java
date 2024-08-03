package com.model;
import jakarta.persistence.*;
@Entity
@Table(name="Employee")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue (value="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	 public Employee(String name) {
		super();
		this.name = name; 
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


  public Employee() {
	  
  }
	

}

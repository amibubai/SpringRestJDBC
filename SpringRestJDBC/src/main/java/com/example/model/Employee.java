package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "EMPLOYEE", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID") })
public class Employee {
			

    	@Id
    	@GeneratedValue(strategy = GenerationType.IDENTITY)
    	@Column(name = "ID", unique = true, nullable = false)
		private int id;  
    	@Column(name = "NAME", unique = true, nullable = false, length = 100)
		private String name;  
    	@Column(name = "SALARY", unique = true, nullable = false, length = 10)
		private float salary;
    	@Column(name = "ADDRESS", unique = true, nullable = false, length = 300)
		private String adress;
		
		public Employee() {
			super();
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

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		public String getAdress() {
			return adress;
		}

		public void setAdress(String adress) {
			this.adress = adress;
		}
		
		
		
}

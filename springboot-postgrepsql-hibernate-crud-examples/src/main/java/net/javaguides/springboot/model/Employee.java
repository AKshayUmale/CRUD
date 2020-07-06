package net.javaguides.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;



@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	
		@Column(name = "name")
	    private String Name;
		
		@Column(name = "DOB")
	    private String DOB;
		
		@Column(name = "Address")
	    private String Address;
		
		@Column(name = "Pincode")
	    private int Pincode;
		
		@Column(name = "DOJ")
	    private String DOJ;
	    
	    
	    public Employee() {
			super();
		}
		public Employee(String name, String dOB, String address, int pincode, String dOJ) {
			super();
			Name = name;
			DOB = dOB;
			Address = address;
			Pincode = pincode;
			DOJ = dOJ;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getDOB() {
			return DOB;
		}
		public void setDOB(String dOB) {
			DOB = dOB;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public int getPincode() {
			return Pincode;
		}
		public void setPincode(int pincode) {
			Pincode = pincode;
		}
		public String getDOJ() {
			return DOJ;
		}
		public void setDOJ(String dOJ) {
			DOJ = dOJ;
		}
	
	    
	    
	 
	  
}

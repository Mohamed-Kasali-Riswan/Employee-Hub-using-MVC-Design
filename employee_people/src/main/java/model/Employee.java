package model;

import java.sql.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_details")
public class Employee{
	
	@Id
    @Column(name="emp_id")
    private String emp_id;
	
	@Column(name="emp_name")
	private String emp_name;
	
	@Column(name="emp_mob")
	private String emp_mob;
	
	@Column(name="emp_address")
	private String emp_address;
	
	@Column(name="emp_gender")
	private String emp_gender;
	
	@Column(name="emp_dob")
	private Date emp_dob;
	
	@Column(name="emp_salary")
	private double emp_salary;
	
	public Employee(){}

	public void setEmp_id() {
		this.emp_id = UUID.randomUUID().toString().substring(0,5);
	}
	
//	public void setEmp_id(String emp_id) {
//		this.emp_id = emp_id;
//	}
	
	public String get_EmpId() {
		return emp_id;
	}
	
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	public String get_EmpName() {
		return emp_name;
	}

	public void setEmp_mob(String emp_mob) {
		this.emp_mob = emp_mob;
	}

	public Date getEmp_dob() {
		return emp_dob;
	}

	public void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}

	public String getEmp_mob() {
		return emp_mob;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public String getEmp_gender() {
		return emp_gender;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

	public void setEmp_gender(String emp_gender) {
	    if (emp_gender != null) {
	        if (emp_gender.equalsIgnoreCase("Male")) {
	            this.emp_gender = "Male";
	        } else if (emp_gender.equalsIgnoreCase("Female")) {
	            this.emp_gender = "Female";
	        } else {
	            this.emp_gender = "Others";
	        }
	    }
	}


	public void setEmp_dob(String emp_dob) {
		this.emp_dob = Date.valueOf(emp_dob);
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
	
	public String toString() {
		return "Id is "+emp_id+" Name is "+emp_name+" Mobile number is "+emp_mob+" Gender is "+emp_gender+" Address is "+emp_address+" DOB is "+emp_dob;
	}

}
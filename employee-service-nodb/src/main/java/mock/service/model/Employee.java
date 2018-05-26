package mock.service.model;

import java.io.Serializable;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6333437351589571028L;
	int id;
	String empName;
	String empLevel;
	String role;
	
	
	public Employee(int id, String empName, String empLevel, String role) {
		super();
		this.id = id;
		this.empName = empName;
		this.empLevel = empLevel;
		this.role = role;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpLevel() {
		return empLevel;
	}
	public void setEmpLevel(String empLevel) {
		this.empLevel = empLevel;
	}
	
	
}

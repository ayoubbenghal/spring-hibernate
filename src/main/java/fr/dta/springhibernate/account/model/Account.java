/**
 * 
 */
package fr.dta.springhibernate.account.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import fr.dta.springhibernate.employee.model.Employee;

/**
 * @author Ayoub Benghal
 * 
 * 
 *
 *
 * 2017
 *
 *
 * Account.java
 */
@Entity
@Table(name="account")

public class Account {
	@Id
	private String userName;
	@Column
	private String password;
	@OneToOne(mappedBy="compte")
	private Employee employee;
	
	
	
	
	
	
	
	
	
	/**
	 * Constructor With : 
	 */
	public Account() {
		super();
	}

	/**
	 * Constructor With : 
	 * @param userName
	 */
	public Account(String userName) {
		super();
		this.userName = userName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj==null || this==null) return false;
		if(obj instanceof Account) {
			Account a=(Account)obj;
			if(a.getUserName().equals(this.userName)) return true;
			
		}
		return false;
	}
	
	
	
	

}

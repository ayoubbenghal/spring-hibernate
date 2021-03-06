/**
 * 
 */
package fr.dta.springhibernate.company.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import fr.dta.springhibernate.employee.model.Employee;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Entité pour la création de la table company ( Modéle de données )
 *
 *
 * Company.java
 */
@Entity
@Table(name="company")
@SequenceGenerator(name="seq_company",sequenceName="seq_company",initialValue=1,allocationSize=1)

public class Company {
	/**
	 *Company.java
	 * id
	 * 
	 * L'id est genéré automatiquement avec une sequence 
	 */
	@Id
	@GeneratedValue(generator="seq_company")
	private Long id;
	/**
	 *Company.java
	 * nom
	 */
	@Column
	private String nom;
	/**
	 *Company.java
	 * employees
	 * 
	 * Une société peut avoir plusieurs employés est c'est l'employé qui porte la relation
	 */
	@OneToMany(mappedBy="societe")
	private List<Employee> employees;
	
	
	
	/**
	 * Constructor With : 
	 * @param nom
	 */
	public Company(String nom) {
		super();
		this.nom = nom;
	}
	/**
	 * Constructor With : 
	 * @param id
	 * @param nom
	 * @param employees
	 */
	public Company(Long id, String nom, List<Employee> employees) {
		super();
		this.id = id;
		this.nom = nom;
		this.employees = employees;
	}
	/**
	 * Constructor With : 
	 */
	public Company() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj== null || this==null) return false;
		if(obj instanceof Company) {
			Company c=(Company)obj;
			if(c.getNom().equals(this.getNom())) return true;
		}
		return false;
	}
	
	

}

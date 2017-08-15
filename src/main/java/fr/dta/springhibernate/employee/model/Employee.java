/**
 * 
 */
package fr.dta.springhibernate.employee.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import fr.dta.springhibernate.account.model.Account;
import fr.dta.springhibernate.company.model.Company;

/**
 * @author Ayoub Benghal
 * 
 * 
 *
 *
 * 2017
 *
 *
 * Employee.java
 */
@Entity
@Table(name="employee")
@SequenceGenerator(name="seq_employee",sequenceName="seq_employee",initialValue=1,allocationSize=1)
public class Employee {
	/**
	 *Employee.java
	 * id
	 */
	@Id
	@GeneratedValue(generator="seq_employee")
	private Long id;
	/**
	 *Employee.java
	 * nom
	 */
	@Column
	private String nom;
	/**
	 *Employee.java
	 * prenom
	 */
	@Column
	private String prenom;
	/**
	 *Employee.java
	 * idSecu
	 */
	@Column
	private String idSecu;
	/**
	 *Employee.java
	 * salaire
	 */
	@Column
	private BigDecimal salaire;
	/**
	 *Employee.java
	 * dateEmbauche
	 */
	@Column
	private LocalDate dateEmbauche;
	/**
	 *Employee.java
	 * compte
	 */
	@OneToOne
	private Account compte;
	/**
	 *Employee.java
	 * societe
	 */
	@ManyToOne
	private Company societe;
	
	
	

	/**
	 * Constructor With : No parameters
	 */
	public Employee() {
		super();
	}

	
	



	/**
	 * Constructor With : 
	 * @param nom
	 * @param prenom
	 */
	public Employee(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}






	/**
	 * Constructor With : 
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param idSecu
	 * @param salaire
	 * @param dateEmbauche
	 * @param compte
	 * @param societe
	 */
	public Employee(Long id, String nom, String prenom, String idSecu, BigDecimal salaire, LocalDate dateEmbauche,
			Account compte, Company societe) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.idSecu = idSecu;
		this.salaire = salaire;
		this.dateEmbauche = dateEmbauche;
		this.compte = compte;
		this.societe = societe;
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




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public String getIdSecu() {
		return idSecu;
	}




	public void setIdSecu(String idSecu) {
		this.idSecu = idSecu;
	}




	public BigDecimal getSalaire() {
		return salaire;
	}




	public void setSalaire(BigDecimal salaire) {
		this.salaire = salaire;
	}




	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}




	public void setDateEmbauche(LocalDate dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}




	public Account getCompte() {
		return compte;
	}




	public void setCompte(Account compte) {
		this.compte = compte;
	}




	public Company getSociete() {
		return societe;
	}




	public void setSociete(Company societe) {
		this.societe = societe;
	}






	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj== null || this==null) return false;
		if(obj instanceof Employee) {
			Employee e=(Employee)obj;
			if(e.getNom().equals(this.nom) && e.getIdSecu().equals(this.idSecu)) return true;
		}
		return false;
	}




	

}

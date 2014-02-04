package tn.edu.esprit.infob2.interiorMinestreApp.domain.manyToManyWithData;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Projet
 *
 */
@Entity

public class Projet implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;
	
	private List<Employee> employees;

	public Projet() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@ManyToMany
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
   
}

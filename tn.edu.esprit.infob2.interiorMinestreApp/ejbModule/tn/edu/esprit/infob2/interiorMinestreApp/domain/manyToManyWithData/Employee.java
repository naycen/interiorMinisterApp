package tn.edu.esprit.infob2.interiorMinestreApp.domain.manyToManyWithData;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity

public class Employee implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;
	
	private List<Projet> projets;

	public Employee() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@ManyToMany(mappedBy="employees")
	public List<Projet> getProjets() {
		return projets;
	}
	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}
   
}

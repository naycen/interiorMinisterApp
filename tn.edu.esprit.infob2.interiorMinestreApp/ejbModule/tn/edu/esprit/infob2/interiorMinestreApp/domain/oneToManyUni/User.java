package tn.edu.esprit.infob2.interiorMinestreApp.domain.oneToManyUni;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;
	
	private List<Car> cars;

	public User() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@OneToMany
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
   
}

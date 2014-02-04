package tn.edu.esprit.infob2.interiorMinestreApp.domain.oneToManyUni;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Car
 *
 */
@Entity

public class Car implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;
	
	

	public Car() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}

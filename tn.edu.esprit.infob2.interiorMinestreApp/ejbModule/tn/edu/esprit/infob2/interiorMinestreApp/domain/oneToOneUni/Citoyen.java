package tn.edu.esprit.infob2.interiorMinestreApp.domain.oneToOneUni;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Citoyen
 *
 */
@Entity

public class Citoyen implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;

	public Citoyen() {
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

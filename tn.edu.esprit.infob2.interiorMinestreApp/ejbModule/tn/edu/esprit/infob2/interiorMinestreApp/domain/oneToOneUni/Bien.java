package tn.edu.esprit.infob2.interiorMinestreApp.domain.oneToOneUni;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Bien
 *
 */
@Entity

public class Bien implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;
	
	private Citoyen citoyen;

	public Bien() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@OneToOne
	public Citoyen getCitoyen() {
		return citoyen;
	}
	public void setCitoyen(Citoyen citoyen) {
		this.citoyen = citoyen;
	}
   
}

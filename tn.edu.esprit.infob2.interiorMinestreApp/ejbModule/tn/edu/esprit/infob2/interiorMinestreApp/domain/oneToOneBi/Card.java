package tn.edu.esprit.infob2.interiorMinestreApp.domain.oneToOneBi;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Card
 *
 */
@Entity
public class Card implements Serializable {

	
	private int id;
	private String type;
	private static final long serialVersionUID = 1L;
	
	private Person person;

	public Card() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@OneToOne
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
   
}

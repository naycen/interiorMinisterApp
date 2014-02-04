package tn.edu.esprit.infob2.interiorMinestreApp.domain.oneToOneBi;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity

public class Person implements Serializable {

	
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;
	
	private Card card;

	public Person() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@OneToOne(mappedBy="person")
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
   
}

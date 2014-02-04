package tn.edu.esprit.infob2.interiorMinestreApp.domain.oneToManyBi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: GirlFriend
 *
 */
@Entity

public class GirlFriend implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;

	private Boy boy;
	public GirlFriend() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne
	public Boy getBoy() {
		return boy;
	}
	public void setBoy(Boy boy) {
		this.boy = boy;
	}
   
}

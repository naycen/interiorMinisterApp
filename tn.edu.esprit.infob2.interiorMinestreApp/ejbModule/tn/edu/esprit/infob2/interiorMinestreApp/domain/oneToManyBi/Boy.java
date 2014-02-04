package tn.edu.esprit.infob2.interiorMinestreApp.domain.oneToManyBi;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Boy
 *
 */
@Entity

public class Boy implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;
	
	private List<GirlFriend> girlFriends;

	public Boy() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@OneToMany(mappedBy= "boy")
	public List<GirlFriend> getGirlFriends() {
		return girlFriends;
	}
	public void setGirlFriends(List<GirlFriend> girlFriends) {
		this.girlFriends = girlFriends;
	}
   
}

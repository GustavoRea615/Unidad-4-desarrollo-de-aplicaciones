package boots.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="providers")
public class Provider implements Serializable{


	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name="first_name")
	private String firstName;
	
	@Column (name="last_name")
	private String lastName;
	
	@Temporal(TemporalType.DATE)
	@Column (name="last_update")
	private Date lastUpdate;
	
	private boolean active;
	

	private String nationality;
	
	private String affiliation;
	
	public Provider(){}

	public Provider(int id, String firstName, String lastName, Date lastUpdate, boolean active, String nationality,
			String affiliation) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdate = lastUpdate;
		this.active = active;
		this.nationality = nationality;
		this.affiliation = affiliation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	@Override
	public String toString() {
		return "Provider [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate="
				+ lastUpdate + ", active=" + active + ", nationality=" + nationality + ", affiliation=" + affiliation
				+ "]";
	}
	
	
}

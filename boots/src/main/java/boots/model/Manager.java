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

@Entity(name="managers")
public class Manager implements Serializable{

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
	

	private String skill;
	
	private String nationality;
	
	public Manager(){}

	public Manager(int id, String firstName, String lastName, Date lastUpdate, boolean active, String skill,
			String nationality) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdate = lastUpdate;
		this.active = active;
		this.skill = skill;
		this.nationality = nationality;
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

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate="
				+ lastUpdate + ", active=" + active + ", skill=" + skill + ", nationality=" + nationality + "]";
	}
	
	
}

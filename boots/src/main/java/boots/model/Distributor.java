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

@Entity(name="distributors")
public class Distributor implements Serializable{

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
	

	private String company;
	
	private String experience;
	
	public Distributor(){}

	public Distributor(int id, String firstName, String lastName, Date lastUpdate, boolean active, String company,
			String experience) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdate = lastUpdate;
		this.active = active;
		this.company = company;
		this.experience = experience;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Distributor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate="
				+ lastUpdate + ", active=" + active + ", company=" + company + ", experience=" + experience + "]";
	}
	
	
}

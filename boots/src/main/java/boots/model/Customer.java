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

@Entity(name="customers")
public class Customer implements Serializable{

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name="first_name")
	private String firstName;
	
	@Column (name="last_name")
	private String lastName;
	
	@Temporal(TemporalType.DATE)
	@Column (name="last_update")
	private Date lastUpdate;
	
	private boolean activebool;
	

	private String email;
	
	public Customer(){
		
	}





	public Customer(int id, String firstName, String lastName, Date lastUpdate, boolean activebool, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdate = lastUpdate;
		this.activebool = activebool;
		this.email = email;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
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


	public boolean isActivebool() {
		return activebool;
	}


	public void setActivebool(boolean activebool) {
		this.activebool = activebool;
	}





	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate="
				+ lastUpdate + ", activebool=" + activebool + ", email=" + email + "]";
	}


	
	
	
	
}

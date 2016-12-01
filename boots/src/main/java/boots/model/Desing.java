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

@Entity(name="desings")
public class Desing implements Serializable {
	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	

	private String name;
	

	private String topic;
	
	@Temporal(TemporalType.DATE)
	@Column (name="last_update")
	private Date lastUpdate;
	
	private boolean active;
	

	private String email;
	
	private int telephone;
	
	public Desing(){}
	
	
	public Desing(int id, String name, String topic, Date lastUpdate, boolean active, String email, int telephone) {
		super();
		this.id = id;
		this.name = name;
		this.topic = topic;
		this.lastUpdate = lastUpdate;
		this.active = active;
		this.email = email;
		this.telephone = telephone;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTelephone() {
		return telephone;
	}


	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}


	@Override
	public String toString() {
		return "Desing [id=" + id + ", name=" + name + ", topic=" + topic + ", lastUpdate=" + lastUpdate + ", active="
				+ active + ", email=" + email + ", telephone=" + telephone + "]";
	}
	
	
}

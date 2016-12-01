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

@Entity(name="publishers")
public class Publisher implements Serializable {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name="full_name")
	private String fullName;
	
	private String age;
	
	private int salary;
	
	@Temporal(TemporalType.DATE)
	@Column (name="last_update")
	private Date lastUpdate;
	
	private boolean active;
	

	public Publisher(){}


	public Publisher(int id, String fullName, String age, int salary, Date lastUpdate, boolean active) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.salary = salary;
		this.lastUpdate = lastUpdate;
		this.active = active;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
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


	@Override
	public String toString() {
		return "Publisher [id=" + id + ", fullName=" + fullName + ", age=" + age + ", salary=" + salary
				+ ", lastUpdate=" + lastUpdate + ", active=" + active + "]";
	}
	
	
}

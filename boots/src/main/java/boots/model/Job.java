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

@Entity(name="jobs")
public class Job implements Serializable{

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name="job_title")
	private String jobTitle;
	
	@Column (name="min_salary")
	private int minSalary;
	
	@Column (name="max_salary")
	private int maxSalary;
	
	public Job(){}

	public Job(int id, String jobTitle, int minSalary, int maxSalary) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", jobTitle=" + jobTitle + ", minSalary=" + minSalary + ", maxSalary=" + maxSalary
				+ "]";
	}
	
	
}

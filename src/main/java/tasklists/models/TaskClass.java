package tasklists.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class TaskClass implements Task {
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy="increment")
	private int id;
	private String description;
	private String status; // "doing", "done"
	
	public TaskClass(String description) {
		this.description = description;
		this.status = "doing";
	}

	public TaskClass() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return this.description;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

package tasklists.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class TaskListClass implements TaskList {
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy="increment")
	private int id;
	private String name;
	
	@ElementCollection
	@OneToMany(
		    orphanRemoval = true,
		    cascade = CascadeType.ALL,
		    targetEntity = TaskClass.class)
	private List<Task> tasks;
	
	public TaskListClass() {
		super();
	}
	
	public TaskListClass(String name) {
		this.name = name;
		this.tasks = new ArrayList<Task>();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return this.name;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}
}

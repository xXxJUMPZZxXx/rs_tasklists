package tasklists.controllers;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import tasklists.models.Task;
import tasklists.models.TaskList;
import tasklists.models.TaskListClass;

public class TaskListControllerClass implements TaskListController {
	private SessionFactory sessionFactory;
	
	public TaskListControllerClass() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure("resource/hibernate.cfg.xml")
				.build();
        try {
        	this.sessionFactory  = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch(Exception e) {
        	e.printStackTrace();
        	System.exit(1);
        }
	}
	
	private List<TaskList> readTaskLists() {
		// TODO
		// Open Hibernate connection
		// Build all TaskList objects
		// Close connection		
		return null;
	}
	
	private TaskList readTaskList(String taskListId) {
		// TODO
		// Open Hibernate connection
		// Build TaskList object
		// Close connection		
		return null;
	}
	
	public void writeTaskList(TaskList taskList) {
		// TODO: change object id
        Session session = sessionFactory.openSession();
		// Open Hibernate session
        session.beginTransaction();
        // Save TaskList object
        session.save(taskList);
        session.getTransaction().commit();
        // Close session
        session.close();
	}
	
	public void close() {
		sessionFactory.close();
	}
	
	public List<TaskList> getTaskLists() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasTasksLists() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasTaskList(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public String createTaskList(String name) {
		TaskList taskList = new TaskListClass(name);
		this.writeTaskList(taskList);
		return ""+taskList.getId();
	}

	public TaskList getTaskList(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void changeTaskListName(String name, String newName) {
		// TODO Auto-generated method stub

	}
	
	public void deleteTask(String taskListId, String taskId) {
		// TODO Auto-generated method stub

	}
	
	public boolean hasTask(String taskListId, String taskId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasTaskInList(String taskListId, String taskId) {
		// TODO Auto-generated method stub
		return false;
	}

	public void changeTaskDescription(String taskId, String taskDescription) {
		// TODO Auto-generated method stub

	}

	public void changeTaskStatus(String taskListId, String taskId, String status) {
		// TODO Auto-generated method stub

	}

	public String createTask(String taskListId, String description) {
		// TODO Auto-generated method stub
		return null;
	}

	public Task getTask(String taskListId, String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteTaskList(String Id) {
		// TODO Auto-generated method stub

	}

}

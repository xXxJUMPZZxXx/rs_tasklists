package tasklists.controllers;

import java.util.List;

import tasklists.models.Task;
import tasklists.models.TaskList;

public class TaskListControllerClass implements TaskListController {
	
	private static List<TaskList> readTaskLists() {
		// TODO
		// Open Hibernate connection
		// Build all TaskList objects
		// Close connection		
		return null;
	}
	
	private static TaskList readTaskList(String taskListId) {
		// TODO
		// Open Hibernate connection
		// Build TaskList object
		// Close connection		
		return null;
	}
	
	private static void writeTaskList(TaskList taskList) {
		// TODO
		// Open Hibernate connection
		// Save TaskList object
		// Close connection
	}

	@Override
	public List<TaskList> getTaskLists() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasTasksLists() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasTaskList(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String createTaskList(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskList getTaskList(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeTaskListName(String name, String newName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTask(String taskListId, String taskId) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasTask(String taskListId, String taskId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasTaskInList(String taskListId, String taskId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void changeTaskDescription(String taskId, String taskDescription) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeTaskStatus(String taskListId, String taskId, String status) {
		// TODO Auto-generated method stub

	}

	@Override
	public String createTask(String taskListId, String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task getTask(String taskListId, String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTaskList(String Id) {
		// TODO Auto-generated method stub

	}

}

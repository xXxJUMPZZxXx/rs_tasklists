package tasklists.controllers;

import java.util.List;

import tasklists.models.Task;
import tasklists.models.TaskList;

public interface TaskListController {

	List<TaskList> getTaskLists();

	boolean hasTasksLists();

	boolean hasTaskList(String name);

	String createTaskList(String name);

	TaskList getTaskList(String name);

	void changeTaskListName(String name, String newName);
	
	void deleteTask(String taskListId, String taskId);

	boolean hasTask(String taskListId, String taskId);

	void changeTaskDescription(String taskId, String taskDescription);

	void changeTaskStatus(String taskListId, String taskId, String status);

	String createTask(String taskListId, String description);
	
	Task getTask(String taskListId, String taskId);

	void deleteTaskList(String Id);
	
	void close();

}

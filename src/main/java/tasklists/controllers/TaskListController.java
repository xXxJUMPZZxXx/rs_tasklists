package tasklists.controllers;

import java.util.List;

import tasklists.models.TaskList;
import tasklists.models.Task;

public interface TaskListController {

	List<TaskList> getTaskLists();

	boolean hasTasksLists();

	boolean hasTaskList(String name);

	String createTaskList(String name);

	TaskList getTaskList(String name);

	void changeTaskListName(String name, String newName);

	void changeTaskStatus(String taskListId, String taskId, String status);
	
	void deleteTask(String taskListId, String taskId);

	boolean hasTask(String taskListId, String taskId);

	boolean hasTaskInList(String taskListId, String taskId);

	void changeTaskDescription(String taskId, String taskDescription);
  
  void changeTaskStatus(String taskListId, String taskId, String status);

	Task getTask(String id);

	boolean hasTask(String id);
}
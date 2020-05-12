package tasklists.controllers;

import java.util.List;

import tasklists.models.TaskList;

public interface TaskListController {

	List<TaskList> getTaskLists();

	boolean hasTasksLists();

	boolean hasTaskList(String name);

	String createTaskList(String name);

	TaskList getTaskList(String name);

	void changeTaskListName(String name, String newName);
	
	void changeTaskStatus(String taskListId, String taskId, String status);

	boolean hasTask(String taskListId, String taskId);

}

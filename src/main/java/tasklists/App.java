package tasklists;

import tasklists.controllers.TaskListControllerClass;
import tasklists.models.TaskList;
import tasklists.models.TaskListClass;

public class App {
    public static void main( String[] args ) {
        TaskList taskList = new TaskListClass("Sample task list");
        TaskListControllerClass controller = new TaskListControllerClass();
        controller.writeTaskList(taskList);
        controller.close();
    }
}

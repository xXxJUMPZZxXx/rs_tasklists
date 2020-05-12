package tasklists.models;

import java.util.List;

public interface TaskList {

	String getName();

	List<Task> getTasks();
	
	int getId();

}

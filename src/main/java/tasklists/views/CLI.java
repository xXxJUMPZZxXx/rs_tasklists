package tasklists.views;

import java.util.List;
import java.util.Scanner;

import tasklists.controllers.TaskListController;
import tasklists.models.TaskList;

public class CLI {
	public static void main(String[] args) {
		TaskListController controller = null;
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			
			if(line.isBlank()) {
				// Exit on black line
				System.exit(0);
			}
			
			String[] command = line.split(" ");
			
			switch(command[0]) {
			//obtém a listagem de listas.
			case "LTL":
				if(!controller.hasTasksLists()) {
					System.out.println("There are not task lists.");
				}
				else {
					List<TaskList> taskLists = controller.getTaskLists();
					for(TaskList taskList : taskLists) {
						System.out.println(taskList.getName());
					}
				}
			break;
			//cria uma nova lista.
			case "CTL":
			break;
			//obtém uma lista, incluindo as tarefas.
			case "STL":
			break;
			//altera o nome da lista.
			case "MTL":
			break;
			//adiciona uma tarefa à lista.
			case "CT":
			break;
			//elemina a lista, e as suas tarefas.
			case "DTL":
			break;
			//obtém uma tarefa.
			case "ST":
			break;
			//altera o estado da tarefa.
			case "MT":
			break;
			//altera a descrição da tarefa.
			case "AT":
			break;
			//elimina a tarefa.case "":
			case "DT":
			break;
			default:

			}
		}
	}
}

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Handler lowpriority = new LowPriorTask();
        Handler mediumpriority = new MediumPriorTask();
        Handler highpriority = new HighPriorTask();

        lowpriority.setNextHandler(mediumpriority);
        mediumpriority.setNextHandler(highpriority);

        Task task1 = new Task("Add feature", "low");
        Task task2 = new Task("Fix issue", "medium");
        Task task3 = new Task("Fix critical bug", "high");

        Command createTask = new CreateTask(task1);
        Command deleteTask = new RemoveTask(task2);

        Mediator mediator = new Mediator();
        mediator.registerCommand(createTask);
        mediator.registerCommand(deleteTask);

        mediator.executeCommand();

        List<Task> tasks = Arrays.asList(task1, task2, task3);
        TaskIterator taskIterator = new TaskIterator(tasks);

        System.out.println("Tasks on today: ");
        while (taskIterator.hasNext()) {
            Task task = taskIterator.next();
            System.out.println("Task: " + task.name()+ " has a priority of " + task.priority());
        }
    }
}
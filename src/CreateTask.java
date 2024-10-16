public class CreateTask implements Command{
    private final Task task;

    public CreateTask(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        System.out.println("Task: " + task.getName() + " was created");
    }
}
public class RemoveTask implements Command{
    private final Task task;

    public RemoveTask(Task task) {
        this.task = task;
    }
    @Override
    public void execute() {
        System.out.println("Task: " + task.name() + " was removed." );
    }
}

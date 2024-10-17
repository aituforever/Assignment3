public class HighPriorTask extends Handler {
    @Override
    public void handleTask(Task task) {
        if (task.priority().equalsIgnoreCase("high")){
            System.out.println("Managing this high priority task right now: " + task.name());
        } else {
            nextHandler.handleTask(task);
        }
    }
}
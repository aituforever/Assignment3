public class HighPriorTask extends Handler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority().equalsIgnoreCase("high")){
            System.out.println("Managing this high priority task right now: " + task.getName());
        } else {
            nextHandler.handleTask(task);
        }
    }
}
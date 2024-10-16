public class LowPriorTask extends Handler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority().equalsIgnoreCase("low")){
            System.out.println("Managing this low priority task right now: " + task.getName());
        } else {
            nextHandler.handleTask(task);
        }
    }
}

public class LowPriorTask extends Handler {
    @Override
    public void handleTask(Task task) {
        if (task.priority().equalsIgnoreCase("low")){
            System.out.println("Managing this low priority task right now: " + task.name());
        } else {
            nextHandler.handleTask(task);
        }
    }
}

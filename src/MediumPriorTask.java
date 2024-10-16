public class MediumPriorTask extends Handler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority().equalsIgnoreCase("medium")){
            System.out.println("Managing this medium priority task right now: " + task.getName());
        } else {
            nextHandler.handleTask(task);
        }
    }
}
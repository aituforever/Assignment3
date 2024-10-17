public class MediumPriorTask extends Handler {
    @Override
    public void handleTask(Task task) {
        if (task.priority().equalsIgnoreCase("medium")){
            System.out.println("Managing this medium priority task right now: " + task.name());
        } else {
            nextHandler.handleTask(task);
        }
    }
}
public class Task {
    private final String name;
    private final String priority;

    public Task(String name, String priority){
        this.name = name;
        this.priority = priority;
    }
    public String getName(){
        return name;
    }
    public String getPriority(){
        return priority;
    }
}

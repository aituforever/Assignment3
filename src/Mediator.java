import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Command> commandList = new ArrayList<>();

    public void registerCommand(Command command) {
        commandList.add(command);
    }
    public void executeCommand() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}

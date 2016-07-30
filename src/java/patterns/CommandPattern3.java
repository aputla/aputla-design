import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@FunctionalInterface
interface MyCommand {
    void apply();
}

class CommandFactory {
    private final Map<String, MyCommand> commands = new HashMap<>();
    
    public void addCommand(String name, MyCommand command) {
        commands.put(name, command);
    }
    
    public void executeCommand(String name) {
        if (commands.containsKey(name)) {
            commands.get(name).apply();
        }
    }
    
    public void listCommands() {
        System.out.println("Enabled commands: " + commands.keySet().stream().collect(Collectors.joining(", ")));
    }
}

public class CommandPattern3 {
    public static void main(String[] args) {
        CommandFactory cf = new CommandFactory();
        cf.addCommand("Light on", () -> System.out.println("Light turned on"));
        cf.addCommand("Light off", () -> System.out.println("Light turned off"));
        cf.executeCommand("Light on");
        cf.listCommands();
    }
}

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


interface Command {
    void invoke();
}

class ConcreteCommand implements Command {
    
    private final Receiver receiver;
    
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void invoke() {
        receiver.doIt();
    }
}

class Receiver {
    public void doIt() {
    }
}

class Invoker {
    
    private final List<Command> commandList;
    
    public Invoker(List<Command> commandList) {
        this.commandList = commandList;
    }
    
    public void invokeAll() {
        for (Command command : commandList) {
            command.invoke();
        }
    }
}

public class CommandPattern1 {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand command = new ConcreteCommand(receiver);
        List<Command> commandList = new LinkedList<>((Arrays.asList(command)));
        Invoker invoker = new Invoker(commandList);
        invoker.invokeAll();
    }
}

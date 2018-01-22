package cooloongwu.com.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Command-NoCommand");
    }
}

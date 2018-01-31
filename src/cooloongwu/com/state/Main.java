package cooloongwu.com.state;

public class Main {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(2);

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
    }
}

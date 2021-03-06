package cooloongwu.com.state;

public class SoldOutState implements State {

    GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("The machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can`t eject, you haven`t inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}

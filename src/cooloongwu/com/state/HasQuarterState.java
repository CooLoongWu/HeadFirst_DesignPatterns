package cooloongwu.com.state;

public class HasQuarterState implements State {

    GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        //这是对此状的一个不恰当动作
        System.out.println("You can`t insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        machine.setState(machine.getSoldState());
    }

    @Override
    public void dispense() {
        //这是此状态的另一个不恰当动作
        System.out.println("No gumball dispensed");
    }
}

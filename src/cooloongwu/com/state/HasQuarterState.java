package cooloongwu.com.state;

import java.util.Random;

public class HasQuarterState implements State {

    Random randomWinner = new Random(System.currentTimeMillis());

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
        int winner = randomWinner.nextInt();
        if (winner == 0 && machine.getCount() > 1) {
            machine.setState(machine.getSoldOutState());
        } else {
            machine.setState(machine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        //这是此状态的另一个不恰当动作
        System.out.println("No gumball dispensed");
    }
}

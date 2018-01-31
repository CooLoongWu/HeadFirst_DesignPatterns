package cooloongwu.com.state;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;        //未投币状态
    final static int HAS_QUARTER = 2;       //已投币状态
    final static int SOLD = 3;


    State soldOutState;
    State soldState;
    State noQuarterState;
    State hasQuarterState;
    State winnerState;

    State state = soldOutState;

    int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        winnerState = new WinnerState(this);

        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public int getCount() {
        return count;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }

//    /**
//     * 当有25分钱投入时
//     */
//    public void insertQuarter() {
//        if (state == HAS_QUARTER) {
//            System.out.println("You can`t insert another quarter");
//        } else if (state == NO_QUARTER) {
//            System.out.println("You inserted a quarter");
//        } else if (state == SOLD_OUT) {
//            System.out.println("The machine is sold out");
//        } else if (state == SOLD) {
//            System.out.println("Please wait, we`re already giving you a gumball");
//        }
//    }
//
//    /**
//     * 当有用户试着退回投入的钱时
//     */
//    public void ejectQuarter() {
//        if (state == HAS_QUARTER) {
//            System.out.println("Quarter returned");
//        } else if (state == NO_QUARTER) {
//            System.out.println("You haven`t inserted a quarter");
//        } else if (state == SOLD_OUT) {
//            System.out.println("You can`t eject, you haven`t inserted a quarter yet");
//        } else if (state == SOLD) {
//            System.out.println("Sorry, you already turned the crank");
//        }
//    }
//
//    /**
//     * 当转动糖果机把手时
//     */
//    public void TurnCrank() {
//        if (state == HAS_QUARTER) {
//            System.out.println("You turned...");
//        } else if (state == NO_QUARTER) {
//            System.out.println("You turned but there`s no quarter");
//        } else if (state == SOLD_OUT) {
//            System.out.println("You turned but there are no gumballs");
//        } else if (state == SOLD) {
//            System.out.println("Turning twice doesn`t get you another gumball");
//        }
//    }
//
//    /**
//     * 发放糖果
//     */
//    public void dispense() {
//        if (state == HAS_QUARTER) {
//            System.out.println("No gumball dispensed");
//        } else if (state == NO_QUARTER) {
//            System.out.println("You need to pay first");
//        } else if (state == SOLD_OUT) {
//            System.out.println("No gumball dispensed");
//        } else if (state == SOLD) {
//            System.out.println("A gumball comes rolling out the slot");
//            count--;
//            if (count == 0) {
//                System.out.println("Oops, out of gumballs");
//                state = SOLD_OUT;
//            } else {
//                state = NO_QUARTER;
//            }
//        }
//    }
}

package cooloongwu.com.command;

public class Main {

    public static void main(String[] args) {
//        SimpleRemoteControl control = new SimpleRemoteControl();
//
//        Light light = new Light();
//        LightOnCommand command = new LightOnCommand(light);
//
//        control.setCommand(command);
//        control.buttonWasPressed();


        /**
         * 撤销操作
         */
//        RemoteControl remoteControl = new RemoteControl();
//
//        Light light = new Light();
//
//        LightOnCommand lightOnCommand = new LightOnCommand(light);
//        LightOffCommand lightOffCommand = new LightOffCommand(light);
//
//        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
//        System.out.println(remoteControl);
//
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.undoButtonWasPushed();

        /**
         * 带有状态的撤销操作
         */
        RemoteControl remoteControl = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand lowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(ceilingFan);
        remoteControl.setCommand(0, highCommand, offCommand);
        remoteControl.setCommand(1, lowCommand, offCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}

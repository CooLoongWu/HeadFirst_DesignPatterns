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


        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        System.out.println(remoteControl);


        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}

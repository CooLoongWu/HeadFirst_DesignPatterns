package cooloongwu.com.command;

/**
 * 遥控器
 */
public class SimpleRemoteControl {

    //有一个插槽持有命令，而这个命令控制着一个装置
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    /**
     * 当按钮按下时这个方法就会被调用，是的当前命令衔接插槽，并调用他的execute()方法
     */
    public void buttonWasPressed() {
        slot.execute();
    }
}

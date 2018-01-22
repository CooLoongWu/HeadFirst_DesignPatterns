package cooloongwu.com.command;

/**
 * 命令接口
 */
public interface Command {
    public void execute();

    /**
     * 加入撤销功能
     */
    public void undo();
}

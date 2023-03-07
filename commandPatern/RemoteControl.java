package commandPatern;

import commandPatern.commads.*;

public class RemoteControl {
    private static final int SLOT = 10;
    Command[] onCommands;
    Command[] offCommands;
    private Command noCommand = new NoCommand();

    public RemoteControl() {
        onCommands = new Command[SLOT];
        offCommands = new Command[SLOT];

        for (int i = 0; i < SLOT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int idx, Command onCommand, Command offCommand)
    {
        this.onCommands[idx] = onCommand;
        this.offCommands[idx] = offCommand;
    }

    public void onButtonWasPushed(int idx)
    {
        onCommands[idx].execute();
    }
 
    public void offButtonWasPushed(int idx)
    {
        offCommands[idx].execute();
    }
}
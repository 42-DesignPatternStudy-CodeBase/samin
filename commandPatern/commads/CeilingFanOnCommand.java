package commandPatern.commads;
import commandPatern.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;
    
    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    
    @Override
    public void execute() {
        ceilingFan.medium();
        ceilingFan.on();
    }
}
package mediatorPattern;

import java.awt.*;
import java.awt.event.*;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;


    public ColleagueCheckbox(String caption, CheckboxGroup g, boolean check) {
        super(caption, g, check);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged(this);
    }

}
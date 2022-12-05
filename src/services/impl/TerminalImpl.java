package services.impl;

import classes.Terminal;
import enums.Mobile;

public class TerminalImpl extends Terminal {
    private Terminal[] terminals;

    public TerminalImpl(Mobile mobileName, String color) {
        super(mobileName, color);
    }
}

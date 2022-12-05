package classes;

import enums.Mobile;
import services.TerminalInterface;

public class Terminal implements TerminalInterface {
    private Mobile mobileName;
    private String color;

    public Terminal(Mobile mobileName, String color) {
        this.mobileName = mobileName;
        this.color = color;
    }

    public Mobile getMobileName() {
        return mobileName;
    }

    public void setMobileName(Mobile mobileName) {
        this.mobileName = mobileName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "mobileName=" + mobileName +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String creatTerminal(Terminal... terminal) {
        return null;
    }

    @Override
    public Person[] getAllTerminal() {
        return new Person[0];
    }

    @Override
    public String transferToCard(Person person, String cardNumber, double summa) {
        return null;
    }

    @Override
    public String transferToPhoneNumber(Person person, String phoneNumber, double summa) {
        return null;
    }
}

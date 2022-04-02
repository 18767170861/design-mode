package org.wmc.behavior.memento.game.photo;

/**
 * 发起人：您
 */
public class You {

    private String wifeName;    //妻子

    public void setWife(String name) {
        wifeName = name;
    }

    public String getWife() {
        return wifeName;
    }

    public Girl createMemento() {
        return new Girl(wifeName);
    }

    public void restoreMemento(Girl p) {
        setWife(p.getName());
    }
}

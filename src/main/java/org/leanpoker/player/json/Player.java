package org.leanpoker.player.json;

/**
 * Created by Hupixel on 2017.01.11..
 */
    public class Player {
    private String name;
    private int stack;
    private String status;
    private int bet;
    private String version;
    private int id;

    public Player(String name, int stack, String status, int bet, String version, int id) {
        this.name = name;
        this.stack = stack;
        this.status = status;
        this.bet = bet;
        this.version = version;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStack() {
        return stack;
    }

    public void setStack(int stack) {
        this.stack = stack;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

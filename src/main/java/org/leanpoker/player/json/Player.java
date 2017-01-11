package org.leanpoker.player.json;

import java.util.List;

public class Player {
    private String name;
    private int stack;
    private String status;
    private int bet;
    private String version;
    private int id;
    private List<Card> hole_cards;

    public Player(String name, int stack, String status, int bet, String version, int id, List<Card> hole_cards) {
        this.name = name;
        this.stack = stack;
        this.status = status;
        this.bet = bet;
        this.version = version;
        this.id = id;
        this.hole_cards = hole_cards;
    }

    public String getName() {
        return name;
    }

    public int getStack() {
        return stack;
    }

    public String getStatus() {
        return status;
    }

    public int getBet() {
        return bet;
    }

    public String getVersion() {
        return version;
    }

    public int getId() {
        return id;
    }
    public List<Card> getHole_cards(){
        return hole_cards;
    }
}

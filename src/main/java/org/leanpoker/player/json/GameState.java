package org.leanpoker.player.json;

import java.util.List;

public class GameState {
    private String tournament_id;
    private String game_id;
    private int round;
    private int bet_index;
    private int small_blind;
    private int current_buy_in;
    private int pot;
    private int minimum_raise;
    private int dealer;
    private int orbits;
    private int in_action;
    private List<Card> community_cards;
    private List<Player> players;

    public GameState(String tournament_id, String game_id, int round, int bet_index, int small_blind, int current_buy_in, int pot, int minimum_raise, int dealer, int orbits, int in_action, List<Card> community_cards, List<Player> players) {
        this.tournament_id = tournament_id;
        this.game_id = game_id;
        this.round = round;
        this.bet_index = bet_index;
        this.small_blind = small_blind;
        this.current_buy_in = current_buy_in;
        this.pot = pot;
        this.minimum_raise = minimum_raise;
        this.dealer = dealer;
        this.orbits = orbits;
        this.in_action = in_action;
        this.community_cards = community_cards;
        this.players = players;
    }

    public String getTournament_id() {
        return tournament_id;
    }

    public String getGame_id() {
        return game_id;
    }

    public int getRound() {
        return round;
    }

    public int getBet_index() {
        return bet_index;
    }

    public int getSmall_blind() {
        return small_blind;
    }

    public int getCurrent_buy_in() {
        return current_buy_in;
    }

    public int getPot() {
        return pot;
    }

    public int getMinimum_raise() {
        return minimum_raise;
    }

    public int getDealer() {
        return dealer;
    }

    public int getOrbits() {
        return orbits;
    }

    public int getIn_action() {
        return in_action;
    }

    public List<Card> getCommunity_cards() {
        return community_cards;
    }

    public List<Player> getPlayers() {
        return players;
    }
}

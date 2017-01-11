package org.leanpoker.player;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.leanpoker.player.json.GameState;

public class PlayerBot {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        GameState gameState = new GsonBuilder().create().fromJson(request,GameState.class);

        int bet_index = gameState.getBet_index();
        return gameState.getSmall_blind();
    }

    public static void showdown(JsonElement game) {
    }
}

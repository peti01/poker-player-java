package org.leanpoker.player;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.leanpoker.player.json.Table;

public class PlayerBot {


    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        Table table = new GsonBuilder().create().fromJson(request, Table.class);
        return table.getSmall_blind();
    }

    public static void showdown(JsonElement game) {
    }
}

package com.gugzgames.server.controllers;

import com.gugzgames.server.beans.Game;
import com.gugzgames.server.beans.ListGamesResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class GameController {
    @ResponseBody
    @RequestMapping("/api/v1/games/list")
    public ListGamesResponse listGames() {
        ListGamesResponse response = new ListGamesResponse();
        ArrayList<Game> games = new ArrayList<Game>();

        Game ludo = new Game();
        ludo.setId("10000");
        ludo.setName("Ludo");
        games.add(ludo);
        response.setGames(games);
        return response;
    }
}

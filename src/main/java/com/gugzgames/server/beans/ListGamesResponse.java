package com.gugzgames.server.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "list-games-response")
public class ListGamesResponse {
    private List<Game> games;

    @XmlElement(name = "game")
    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}

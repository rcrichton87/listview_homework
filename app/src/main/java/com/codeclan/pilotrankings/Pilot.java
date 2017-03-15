package com.codeclan.pilotrankings;


public class Pilot {

    String name;
    Integer rank;
    String ship;

    public Pilot(String name, Integer rank, String ship){
        this.name = name;
        this.rank = rank;
        this.ship = ship;
    }

    public String getName() {
        return name;
    }

    public Integer getRank() {
        return rank;
    }

    public String getShip() {
        return ship;
    }
}

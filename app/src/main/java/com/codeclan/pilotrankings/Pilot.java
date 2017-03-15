package com.codeclan.pilotrankings;


public class Pilot {

    String name;
    int rank;
    String ship;

    public Pilot(String name, int rank, String ship){
        this.name = name;
        this.rank = rank;
        this.ship = ship;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public String getShip() {
        return ship;
    }
}

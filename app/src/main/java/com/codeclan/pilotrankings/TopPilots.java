package com.codeclan.pilotrankings;


import java.util.ArrayList;

/**
 * Created by user on 15/03/2017.
 */

public class TopPilots {

    ArrayList<Pilot> list;

    public TopPilots(){
        this.list = new ArrayList();
        list.add(new Pilot("Wedge Antilles", 1, "T-65 X-Wing"));
        list.add(new Pilot("Darth Vader", 2, "TIE Advanced"));
        list.add(new Pilot("Poe Dameron", 3, "T-70 X-Wing"));
        list.add(new Pilot("Han Solo", 4, "YT-1300"));
        list.add(new Pilot("Soontir Fel", 5, "TIE Interceptor"));
        list.add(new Pilot("Luke Skywalker", 6, "T-65 X-Wing"));
        list.add(new Pilot("Boba Fett", 7, "Firespray"));
        list.add(new Pilot("Howlrunner", 8, "TIE Fighter"));
        list.add(new Pilot("Omega Leader", 9, "TIE F/O"));
        list.add(new Pilot("Maarek Steele", 10, "TIE Avenger"));
        list.add(new Pilot("Colonel Vessery", 11, "TIE Defender"));
        list.add(new Pilot("Corran Horn", 12, "E-Wing"));
        list.add(new Pilot("Keyan Farlander", 13, "B-Wing"));
        list.add(new Pilot("IG-88", 14, "Aggressor"));
        list.add(new Pilot("'Dutch' Vander", 15, "Y-Wing"));
        list.add(new Pilot("Juno Eclipse", 16, "TIE Advanced"));
        list.add(new Pilot("'Whisper'", 17, "TIE Phantom"));
        list.add(new Pilot("'Redline'", 18, "TIE Punisher"));
        list.add(new Pilot("Dash Rendar", 19, "YT-2400"));
        list.add(new Pilot("Wes Jansen", 20, "T-65 X-Wing"));
    }

    public ArrayList<Pilot> getList(){
        return list;
    }

}

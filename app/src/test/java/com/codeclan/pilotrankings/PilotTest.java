package com.codeclan.pilotrankings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Wedge Antilles", 1, "T-65 X-Wing");
    }

    @Test
    public void testCanGetName(){
        assertEquals("Wedge Antilles", pilot.getName());
    }

    @Test
    public void testCanGetRank(){
        Integer expected = 1;
        assertEquals(expected, pilot.getRank());
    }

    @Test
    public void testCanGetShip(){
        assertEquals("T-65 X-Wing", pilot.getShip());
    }

}
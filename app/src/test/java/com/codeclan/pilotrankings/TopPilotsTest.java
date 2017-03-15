package com.codeclan.pilotrankings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 15/03/2017.
 */

public class TopPilotsTest {

    TopPilots topPilots;

    @Before
    public void before(){
        topPilots = new TopPilots();
    }

    @Test
    public void testCanList(){
        assertEquals(20, topPilots.getList().size());
    }
}
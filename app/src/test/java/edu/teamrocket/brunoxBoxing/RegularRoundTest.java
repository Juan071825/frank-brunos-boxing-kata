package edu.teamrocket.brunoxBoxing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RegularRoundTest {

    @Test
    public void replaceTest() {
        RegularRound round = new RegularRound("10 - 9");
        assertEquals(round.getRoundScore(), "10-9");
    }

    @Test
    public void roundScoreToIntTest() {
        RegularRound round = new RegularRound("10 - 9");
        assertEquals(round.getRoundScore(), "10-9");
        assertEquals(10,(int) round.getRedBoxerScore());
        assertEquals(9, (int) round.getBlueBoxerScore());
    }

    @Test // este para el alumnado
    public void boxerRoundScoreToIntTest() {
        RegularRound round = new RegularRound("10 - 9");
        assertEquals(10, (int) round.getRedBoxerScore());
        assertEquals(9, (int) round.getBlueBoxerScore());
    }
}
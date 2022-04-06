package megamek.server;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandingsEntryTest {

    @Test
    void compareToIfEquals() {
        StandingsEntry se = new StandingsEntry("Test");
        StandingsEntry se2 = new StandingsEntry("Test2");
        Assertions.assertEquals(0, se.compareTo(se2));
    }

    @Test
    void compareToIfGreater() {
        StandingsEntry se = new StandingsEntry("Test");
        se.setEloScore(5,1);
        StandingsEntry se2 = new StandingsEntry("Test2");
        Assertions.assertEquals(1, se.compareTo(se2));
    }

    @Test
    void compareToIfLower() {
        StandingsEntry se = new StandingsEntry("Test");
        se.setEloScore(1,5);
        StandingsEntry se2 = new StandingsEntry("Test2");
        Assertions.assertEquals(-1, se.compareTo(se2));
    }

    @Test
    void getEloScore() {
        StandingsEntry se = new StandingsEntry("Test");
        Assertions.assertEquals(10, se.getEloScore());
    }

    @Test
    void setEloScore() {
        StandingsEntry se = new StandingsEntry("Test");
        int prevuPos = 2;
        int finalPos = 3;
        Assertions.assertEquals(10, se.getEloScore());
        se.setEloScore(prevuPos,finalPos);
        Assertions.assertEquals(9, se.getEloScore());
    }

    @Test
    void getName() {
        StandingsEntry se = new StandingsEntry("Test");
        Assertions.assertEquals("Test", se.getName());
    }

    @Test
    void setName() {
        StandingsEntry se = new StandingsEntry("Test");
        Assertions.assertEquals("Test", se.getName());
        se.setName("TestChanged");
        Assertions.assertEquals("TestChanged", se.getName());
    }
}
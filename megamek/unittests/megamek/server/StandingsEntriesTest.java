package megamek.server;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StandingsEntriesTest {

    @org.junit.jupiter.api.Test
    void TestaddPlayerAlreadyinStanding() {

        StandingsEntries st =  new StandingsEntries();

        st.addPlayer("Bob");

        Assertions.assertEquals(1, st.getStandings().size());

    }

    @Test
    void getStandings() {
        StandingsEntries st =  new StandingsEntries();

        assertTrue(st.getStandings() instanceof List<StandingsEntry>)
    }

    @Test
    void getEloByName() {
    }

    @Test
    void updateStandingEntries() {
    }
}
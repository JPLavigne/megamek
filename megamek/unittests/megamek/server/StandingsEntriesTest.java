package megamek.server;

import megamek.common.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StandingsEntriesTest {

    @org.junit.jupiter.api.Test
    void TestaddPlayerNotAlreadyinStanding() {

        StandingsEntries st = new StandingsEntries();

        st.addPlayer("Bob");

        Assertions.assertEquals(1, st.getStandings().size());

    }

    @org.junit.jupiter.api.Test
    void TestaddPlayerAlreadyinStanding() {

        StandingsEntries st = new StandingsEntries();

        st.addPlayer("Bob");
        st.addPlayer("Bob");

        Assertions.assertEquals(1, st.getStandings().size());

    }


    @Test
    void getEloByName() {
        StandingsEntries st = new StandingsEntries();
        st.addPlayer("Bob");
        assertEquals(10, st.getEloByName("Bob"));

    }

    @Test
    void updateStandingEntries() {
        StandingsEntries st = new StandingsEntries();

        Player p1 = new Player(1, "Bob");
        Player p2 = new Player(2, "Benoit");
        Player p3 = new Player(3, "Geeks");

        List<Player> prevu = new ArrayList<Player>() {
            {
                add(p1);
                add(p2);
                add(p3);
            }
        };
        List<Player> reel = new ArrayList<Player>() {
            {
                add(p3);
                add(p2);
                add(p1);
            }
        };

        st.updateStandingEntries(prevu, reel);
        assertEquals(7, st.getEloByName("Geeks"));
    }
}
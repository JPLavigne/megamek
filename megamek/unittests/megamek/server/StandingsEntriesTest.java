package megamek.server;

import megamek.common.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(value = JUnit4.class)
public class StandingsEntriesTest {

    @Test
    public void TestaddPlayerNotAlreadyinStanding() {

        StandingsEntries st = new StandingsEntries();

        st.addPlayer("Bob");

        Assertions.assertEquals(1, st.getStandings().size());

    }

    @Test
    public void TestaddPlayerAlreadyinStanding() {

        StandingsEntries st = new StandingsEntries();

        st.addPlayer("Bob");
        st.addPlayer("Bob");

        Assertions.assertEquals(1, st.getStandings().size());

    }


    @Test
    public void getEloByName() {
        StandingsEntries st = new StandingsEntries();
        st.addPlayer("Bob");
        assertEquals(10, st.getEloByName("Bob"));

    }

    @Test
    public void updateStandingEntries() {
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

        st.addPlayer(p1.getName());
        st.addPlayer(p2.getName());
        st.addPlayer(p3.getName());

        st.updateStandingEntries(prevu, reel);
        assertEquals(12, st.getEloByName("Geeks"));
    }
}
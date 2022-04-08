package megamek.server;

import megamek.common.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Enumeration;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(value = JUnit4.class)
public class StandingsTest {

    @Test
    public void addPlayer() {
        Standings st = new Standings();
        String player = "Bob";
        st.addPlayer(player);

        assertEquals(player, st.getStandings().get(0));
    }

    @Test
    public void updateStandings() {
        Standings st = new Standings();
        String playerOne = "Alice";
        String playerTwo = "Bob";
        st.addPlayer(playerOne);
        st.addPlayer(playerTwo);

        Vector<Player> playerList = new Vector<>();
        playerList.add(new Player(1, playerOne));
        playerList.add(new Player(2, playerTwo));

        //st.updateStandings(playerList.elements(), );
    }

    @Test
    public void getStandings() {
        Standings st = new Standings();
        String player = "Bob";
        st.addPlayer(player);

        assertEquals(player, st.getStandings().get(0));
    }
}
package megamek.server;

import megamek.common.Player;
import megamek.common.options.GameOptions;
import megamek.server.victory.Victory;
import megamek.server.victory.VictoryResult;
import org.junit.jupiter.api.Test;

import java.util.Enumeration;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class StandingsTest {

    @Test
    void addPlayer() {
        Standings st = new Standings();
        String player = "Bob";
        st.addPlayer(player);

        assertEquals(player, st.getStandings().get(0));
    }

    @Test
    void updateStandings() {
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
    void getStandings() {
        Standings st = new Standings();
        String player = "Bob";
        st.addPlayer(player);

        assertEquals(player, st.getStandings().get(0));
    }
}
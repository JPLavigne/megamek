package megamek.server;

import megamek.common.Player;
import megamek.server.victory.VictoryResult;

import java.util.*;
import java.util.stream.Collectors;

public class Standings {


    private final StandingsEntries standingsEntries;

    public Standings() {
        standingsEntries = new StandingsEntries();
    }

    public void addPlayer(String name) {
        standingsEntries.addPlayer(name);
    }

    // appeller a la fin de la partie pour mettre a jour le standings
    public void updateStandings(Enumeration<Player> players, VictoryResult vr) {

        List<Player> prevu = getPrevuList(players);

        List<Player> reel = getReeList(players, vr);


        standingsEntries.updateStandingEntries(prevu, reel);

    }

    private List<Player> getPrevuList(Enumeration<Player> players) {

        List<Map.Entry<Player, Double>> playerWithElo = new ArrayList<>();

        while (players.hasMoreElements()) {
            Player player = players.nextElement();

            playerWithElo.add(Map.entry(player, standingsEntries.getEloByName(player.getName())));

        }

        playerWithElo.sort(Map.Entry.comparingByValue());

        return playerWithElo.stream().map(Map.Entry::getKey).collect(Collectors.toList());
    }

    private List<Player> getReeList(Enumeration<Player> players, VictoryResult vr){
        List<Map.Entry<Player, Double>> playerWithElo = new ArrayList<>();

        while (players.hasMoreElements()) {
            Player player = players.nextElement();

            playerWithElo.add(Map.entry(player, vr.getPlayerScore(player.getId())));

        }

        playerWithElo.sort(Map.Entry.comparingByValue());

        return playerWithElo.stream().map(Map.Entry::getKey).collect(Collectors.toList());
    }

    // accesseur de la liste de joueurs dans leur ordre durant le tournois
    public List<String> getStandings() {

        return standingsEntries.getStandings();
    }


}

package megamek.server;

import megamek.common.Game;
import megamek.common.Player;
import megamek.server.victory.VictoryResult;

import java.util.*;
import java.util.stream.Collectors;

public class Standings {


    private StandingsEntries standingsEntries;

    public Standings(){
        standingsEntries = new StandingsEntries();
    }

    public void addPlayer(String name) {
        standingsEntries.addPlayer(name);
    }

    // appeller a la fin de la partie pour mettre a jour le standings
    public void updateStandings(Enumeration<Player> players, VictoryResult vr) {

        LinkedHashMap<Player, Double> notOrderHash = new LinkedHashMap();

        // ordre de finissant de la partie
        for (Enumeration<Player> i = players; i.hasMoreElements(); ) {
            Player player = i.nextElement();

            notOrderHash.put(player,vr.getPlayerScore(player.getId()));

        }

        List<Map.Entry<Player, Double>> list = new ArrayList<>(notOrderHash.entrySet());
        list.sort(Map.Entry.comparingByValue());
        List<Player> OrdreFinReel = list.stream().map(Map.Entry::getKey).collect(Collectors.toList());


        // ordre de finissant de la partie

        LinkedHashMap<Player, Double> notOrderHashElo = new LinkedHashMap();

        for (Enumeration<Player> i = players; i.hasMoreElements(); ) {
            Player player = i.nextElement();

            notOrderHashElo.put(player, standingsEntries.getEloByName(player.getName()));
        }
        List<Map.Entry<Player, Double>> listElo = new ArrayList<>(notOrderHash.entrySet());
        listElo.sort(Map.Entry.comparingByValue());
        List<Player> OrdreFinPrevu = listElo.stream().map(Map.Entry::getKey).collect(Collectors.toList());

        standingsEntries.updateStandingEntries(OrdreFinPrevu, OrdreFinReel);

    }

    // accesseur de la liste de joueurs dans leur ordre durant le tournois
    public List<String> getStandings(){

        return standingsEntries.getStandings();
    }


}

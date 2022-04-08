package megamek.server;

import megamek.common.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

public class StandingsEntries {
    private List<StandingsEntry> standingsEntries;

    public StandingsEntries() {
        standingsEntries = new ArrayList<>();
    }

    public void addPlayer(String name) {
        if(!playerExists(name)) {
            standingsEntries.add(new StandingsEntry(name));
        }
    }
    private boolean playerExists(String name){
        for(StandingsEntry entry: standingsEntries) {
            if(entry.getName().equals(name)){
                return true;
            }
        }
        return false;
    }


    // accesseur de la liste de joueurs dans leur ordre durant le tournois
    public List<String> getStandings(){
        Collections.sort(standingsEntries);
        return  standingsEntries.stream().map(StandingsEntry::getName).collect(Collectors.toList());
    }
    public Double getEloByName(String name){
      StandingsEntry standingsEntryFound =  standingsEntries.stream()
                .filter(standingsEntry -> standingsEntry.getName()
                        .equals(name)).findFirst().orElse(null);

        assert standingsEntryFound != null;
        return standingsEntryFound.getEloScore();
    }

    // recoit la liste de l'ordre prevu et final
    // doit mettre a jour chaque player qui se trouve dans le stading
    public void updateStandingEntries(List<Player> prevu, List<Player> reel){

        for(int i =0; i < prevu.size();i++){

            Player current= prevu.get(i);

            // get associated standingEntry
            StandingsEntry se = standingsEntries.stream().filter(x -> x.getName().equals(current.getName())).findFirst().orElse(null);

            assert se != null;
            se.setEloScore(i, reel.indexOf(current));
        }

    }
}

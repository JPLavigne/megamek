package megamek.server;

import megamek.common.Player;

public class StandingsEntry implements Comparable<StandingsEntry> {

    private static final double DEFAULT_ELO = 10;

    private double eloScore;
    private String name;

    public StandingsEntry(String name){
        this.name = name;

        this.eloScore = DEFAULT_ELO;
    }

    @Override
    public int compareTo(StandingsEntry o) {
        return Double.compare(eloScore, o.getEloScore());
    }

    public double getEloScore() {
        return eloScore;
    }

    public void setEloScore(int prevuPos,int finalPos) {
        eloScore = eloScore - (finalPos - prevuPos);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

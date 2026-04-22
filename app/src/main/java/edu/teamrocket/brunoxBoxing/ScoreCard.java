package edu.teamrocket.brunoxBoxing;

public class ScoreCard {

    final String color;
    String redCorner = "";
    String blueCorner = "";
    final String[] judgeScoreCard;

    Round[] rounds;

    ScoreCard(String color) {

        this.color = color;
    }
    
    public Round[] getRounds() {
        return this.rounds; 
    }

    public void setRCorner(String boxerName) {
        this.redCorner = boxerName;
    }

    public void setBCorner(String boxerName) {
        this.blueCorner = boxerName;
    }

    public byte getNumRounds() {    
        return this.rounds.lenght();
    }

    public void loadJudgeScoreCard(String[] judgeScoreCard) {
        this.judgeScoreCard = judgeScoreCard;
    }

    @Override   
    public String toString() {
        return    "\n\t\t\t" + this.color 
                + "\n\t" + this.redCorner
                + "\t" + this.blueCorner
                + "\nRound\tScore\tRound\tRound\tScore"
                + "\nScore\tTotal\t\tTotal\tScore";
    }       
}
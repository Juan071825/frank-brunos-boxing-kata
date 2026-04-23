package edu.teamrocket.brunoxBoxing;

public class ScoreCard {

    final String color;
    String redCorner = "";
    String blueCorner = "";
    String[] judgeScoreCard;

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
        return (byte) this.rounds.length;
    }

    public void loadJudgeScoreCard(String[] judgeScoreCard) {
        this.judgeScoreCard = judgeScoreCard;
    }

    @Override   
    public String toString() {
        return    "\n\t\t\t   " + this.color 
                + "\n\t\t" + this.blueCorner 
                + "\t" + this.redCorner 
                + "\n\t\t\t"
                + this.getNumRounds() + " rounds\n" 
                + this.viewRounds() 
                + "\n\t FINAL SCORE: "
                + this.getRedBoxerFinalScore() 
                + " - " 
                + this.getBlueBoxerFinalScore() 
                + " FINAL SCORE";
    }       

    public int getRedBoxerFinalScore() {
        int redBoxerScore = 0;
        for (Round round : rounds) {
            redBoxerScore += round.getRedBoxerScore();
        }
        return redBoxerScore;
    }

    public int getBlueBoxerFinalScore() {
        int blueBoxerScore = 0;
        for (Round round : rounds) {
            blueBoxerScore += round.getRedBoxerScore();
        }
        return blueBoxerScore;
    }


    private String viewRounds() {
        StringBuilder text = new StringBuilder();

        text.append("\nRound\tScore\tRound\tRound\tScore")
            .append("\nScore\tTotal\t\tTotal\tScore");

        byte roundNum = 1;
        byte redBoxerScoreTotal = 0;
        byte blueBoxerScoreTotal = 0;

        for (Round round : this.rounds) {
            text.append("\n\t")
                .append(round.getRedBoxerScore())
                .append("\t\s")
                .append(redBoxerScoreTotal += round.getRedBoxerScore())
                .append("\t\s\s")
                .append(roundNum++)
                .append("\t\s")
                .append(blueBoxerScoreTotal += round.getBlueBoxerScore())
                .append("\t\s")
                .append(round.getBlueBoxerScore());
        }
        return text.toString();
    }
}
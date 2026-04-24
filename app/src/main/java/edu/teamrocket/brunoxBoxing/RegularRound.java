package edu.teamrocket.brunoxBoxing;



public class RegularRound implements Round {

    Byte redBoxerScore = 0;
    Byte blueBoxerScore = 0;
    private String roundScore;


    RegularRound(String roundScore){
        this.roundScore = roundScore.replace("\s", "");
        parseBoxerRoundScore();
    }


    public String getRoundScore() {
        return this.roundScore;
    }

    
    public void parseBoxerRoundScore(){

        String[] scores = getRoundScore().split("-", 2);
        this.redBoxerScore = Byte.parseByte(scores[0]);
        this.blueBoxerScore = Byte.parseByte(scores[1]);
    }


    @Override
    public Byte getRedBoxerScore() {
        return this.redBoxerScore;
    }


    @Override
    public Byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }


    @Override
    public String toString(){
        StringBuilder round = new StringBuilder();
        round.append(redBoxerScore);
        round.append(" - ");
        round.append(blueBoxerScore);
        return round.toString();
    }
}
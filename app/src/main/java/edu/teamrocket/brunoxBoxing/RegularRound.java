package edu.teamrocket.brunoxBoxing;



public class RegularRound implements Round {

    Byte redBoxerScore = 0;
    Byte blueBoxerScore = 0;
    String roundScore = "";


    RegularRound(String roundScore){
        this.roundScore = roundScore;
    }


    @Override
    public Byte getRedBoxerScore() {
        return this.redBoxerScore;
    }


    @Override
    public Byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }


    





}
package edu.teamrocket.brunoxBoxing;

public class RoundFactory {

    public static Round getRound(String roundScore){

        Round roundType;
        switch (roundScore) {
            case "10 - 9", "9 - 10": roundType = new RegularRound(roundScore);
                break;
        
            case "10 - 8", "8 - 10": roundType = new KnockdownRound(roundScore);
                break;

            case "1, 8 - 10", "10 - 1, 8": roundType = new PointsDeducted(roundScore);
                break;

            default: roundType = null;
                break;
        }
    }
}
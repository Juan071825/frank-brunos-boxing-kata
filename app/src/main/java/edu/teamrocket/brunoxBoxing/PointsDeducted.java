package edu.teamrocket.brunoxBoxing;

class PointsDeducted implements Round {

    private String roundScore = "";
    byte redBoxerScore;
    byte blueBoxerScore;

    PointsDeducted(String roundScore) {
        this.roundScore = roundScore.replace("\s", "");
        parseBoxerRoundScore();
    }

    void parseBoxerRoundScore() {
        String[] scores = this.roundScore.split("-", 2);
        String redBoxerScore = scores[0];
        String blueBoxerScore = scores[1];

        switch (redBoxerScore) {
            case "10":
                    this.redBoxerScore = Byte.parseByte(redBoxerScore);
                    break;
            case "1,8":
                    this.redBoxerScore = parseComaRed(redBoxerScore);
                    break;
            default: 
                    this.redBoxerScore = 0;
                    break;
        }

        switch (blueBoxerScore) {
            case "10":
                    this.blueBoxerScore = Byte.parseByte(blueBoxerScore);
                    break;
            case "8,1":
                    this.blueBoxerScore = parseComaBlue(blueBoxerScore);
                    break;
            default: 
                    this.blueBoxerScore = 0;
                    break;
        }
    }

    public String getRoundScore() {
        return this.roundScore;
    }

    private byte parseComaRed(String score) {
        String[] points = score.split(",", 2);
        return Byte.valueOf(points[1]);
    }

    private byte parseComaBlue(String score) {
        String[] points = score.split(",", 2);
        return Byte.valueOf(points[0]);
    }

    @Override
    public Byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    @Override
    public Byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    @Override
    public String toString() {
        return "Blue Boxer Score: %b\n Red Boxer Score: %b".formatted(getBlueBoxerScore(), getRedBoxerScore());
    }
}
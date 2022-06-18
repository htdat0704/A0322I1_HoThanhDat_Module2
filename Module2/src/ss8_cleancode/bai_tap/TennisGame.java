package ss8_cleancode.bai_tap;

public class TennisGame {

    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = 0;
        if (scorePlayer1==scorePlayer2)
        {
            score = getScore(scorePlayer1);
        }
        else if (scorePlayer1>=4 || scorePlayer2>=4)
            score = getAdvantageOrWin(scorePlayer1, scorePlayer2);
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = scorePlayer1;
                else { score += "-"; tempScore = scorePlayer2;}
                score = getPoint(score, tempScore);
            }
        }
        return score;
    }

    public static String getScore(int scorePlayer1) {
        String score;
        switch (scorePlayer1)
        {
            case ZERO:
                score = "Love-All";
                break;
            case ONE:
                score = "Fifteen-All";
                break;
            case TWO:
                score = "Thirty-All";
                break;
            case THREE:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    public static String getPoint(String score, int tempScore) {
        switch(tempScore)
        {
            case ZERO:
                score+="Love";
                break;
            case ONE:
                score+="Fifteen";
                break;
            case TWO:
                score+="Thirty";
                break;
            case THREE:
                score+="Forty";
                break;
        }
        return score;
    }

    public static String getAdvantageOrWin(int scorePlayer1, int scorePlayer2) {
        String score;
        int minusResult = scorePlayer1-scorePlayer2;
        boolean advantagePlayer1 = minusResult == 1;
        boolean winForPlayer1 = minusResult >= 2;
        boolean advantagePlayer2 = minusResult == -1;

        if (advantagePlayer1) score ="Advantage player1";
        else if (advantagePlayer2) score ="Advantage player2";
        else if (winForPlayer1) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }
}

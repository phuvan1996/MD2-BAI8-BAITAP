public class TennisGame {

    public static final int FIRTS_CORE = 1;
    public static final int SECOND_SCORE = 2;
    public static final int THIRD_SCORE = 3;
    public static final int FIRTS_SCORE = 1;

    public static String getScore(String player1Name, String player2Name, int firts_player1_score, int second_player_score) {
        String score = "";
        int tempScore = 0;
        if (firts_player1_score == second_player_score) {
            switch (firts_player1_score) {
                case 0:
                    score = "Love-All";
                    break;
                case FIRTS_CORE:
                    score = "Fifteen-All";
                    break;
                case SECOND_SCORE:
                    score = "Thirty-All";
                    break;
                case THIRD_SCORE:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if (firts_player1_score >= 4 || second_player_score >= 4) {
            int minusResult = firts_player1_score - second_player_score;

            if (minusResult == 1) score = "Advantage player1";

            else if (minusResult == -1) score = "Advantage player2";

            else if (minusResult >= 2) score = "Win for player1";

            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = firts_player1_score;

                else {
                    score += "-";
                    tempScore = second_player_score;
                }

                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case FIRTS_SCORE:
                        score += "Fifteen";
                        break;
                    case SECOND_SCORE:
                        score += "Thirty";
                        break;
                    case THIRD_SCORE:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}


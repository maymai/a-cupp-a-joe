public class Hello {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 1000;
        int level = 5;
        int bonus = 300;

        int finalScore = calculateScore(gameOver, score, level, bonus);
        displayPlayerPosition("Someone", finalScore);

        int scoreOne = 1500;
        int scoreTwo = 900;
        int scoreThree = 400;
        int scoreFour = 50;
        displayPlayerPosition("Lalala", scoreOne);
        displayPlayerPosition("Xupopix", scoreTwo);
        displayPlayerPosition("Cosgrove", scoreThree);
        displayPlayerPosition("Alalu", scoreFour);

    }

    private static int calculateScore(boolean gameOver, int score, int level, int bonus) {
        if (gameOver) {
            return (score * level) + bonus;
        }
        return -1;
    }

    private static void displayPlayerPosition(String playerName, int score) {
        int position = calculatePosition(score);
        System.out.println(playerName + " is in " + position + " place!");
    }

    private static int calculatePosition(int score) {
        if (score >= 1000)
            return 1;
        else if (score >= 500)
            return 2;
        else if (score >= 100)
            return 3;
        else
            return 4;
    }
}

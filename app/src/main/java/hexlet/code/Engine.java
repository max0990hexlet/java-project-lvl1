/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hexlet.code;

import hexlet.code.games.Game;

public class Engine {
    public static final int VICTORY_COUNT = 3;

    public static void run(Game game) {
        String userName = Cli.welcome();
        System.out.println(game.getRules());
        int countRightAnswer = 0;
        while (countRightAnswer < VICTORY_COUNT) {
            String[] question = game.getQuestion();
            System.out.println("Question: " + question[0]);
            System.out.print("Your answer: ");
            String answer = Cli.nextLine();
            String rightAnswer = question[1];
            if (rightAnswer.equals(answer)) {
                System.out.println("Correct!");
                countRightAnswer++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                countRightAnswer = 0;
                System.out.println("Let's try again, " + userName);
                return;
            }
        }
        System.out.println("Congratulations, " + userName);
        return;
    }
}

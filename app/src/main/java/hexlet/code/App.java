/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static String getGreeting() {
        return "Hello World!";
    }

    public static String choiceGame() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("0 - Exit");
        System.out.println("1 - Greet");
        System.out.println("2 - " + Even.getName());
        System.out.println("3 - " + Calc.getName());
        System.out.println("4 - " + GCD.getName());
        System.out.println("5 - " + Progression.getName());
        System.out.println("6 - " + Prime.getName());
        String gameNumber = "0";
        System.out.print("Your choice: ");
        gameNumber = Cli.nextLine();
        return gameNumber;
    }

    public static void main(String[] args) {
        String gameNumber = choiceGame();

        switch (gameNumber) {
            case "1" :
                Cli.welcome();
                break;
            case "2" :
                Engine.run(new Even());
                break;
            case "3" :
                Engine.run(new Calc());
                break;
            case "4" :
                Engine.run(new GCD());
                break;
            case "5" :
                Engine.run(new Progression());
                break;
            case "6" :
                Engine.run(new Prime());
                break;
            default :
                throw new IllegalArgumentException("Unknown game number");
        }
    }
}

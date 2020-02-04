package pl.michalgorski.task3.models.services;

import pl.michalgorski.task3.models.Player;

import java.util.Optional;

public class GameService {

    private static GameService INSTANCE = new GameService();
    private static double valueOfMaxPoints = MaxPointsService.getMaxPoints();

    private GameService() {
    }

    public static GameService getINSTANCE() {
        return INSTANCE;
    }


    public void startFiveRoundsForEachPlayer(Player player1, Player player2) {

        for (int i = 0; i < 5; i++) {
            startOneRound(player1);
            startOneRound(player2);
        }
    }

    private void startOneRound(Player player) {

        for (int i = 1; i <= 10; i++) {

            int sumOfTwoDices = RandomService.getSumOfTwoDices();

            if (i == 1 && (sumOfTwoDices == 7 || sumOfTwoDices == 11)) {
                break;

            } else if (i == 1 && (sumOfTwoDices == 2 || sumOfTwoDices == 12)) {
                player.setPoints(player.getPoints() + valueOfMaxPoints);
                break;

            } else if (sumOfTwoDices == 5) {
                break;

            } else {
                player.setPoints(player.getPoints() + (double)sumOfTwoDices / i);
            }
        }
    }

    public Optional<Player> getGameWinner(Player player1, Player player2) {

        if (player1.getPoints() > player2.getPoints()) {
            return Optional.of(player2);

        } else if (player1.getPoints() < player2.getPoints()) {
            return Optional.of(player1);

        } else return Optional.empty();
    }

}
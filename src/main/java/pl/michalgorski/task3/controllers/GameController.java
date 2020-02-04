package pl.michalgorski.task3.controllers;

import pl.michalgorski.task3.models.Player;
import pl.michalgorski.task3.models.services.GameService;
import pl.michalgorski.task3.views.MainView;

import java.util.Optional;

public class GameController {
    private MainView mainView;
    private GameService gameService = GameService.getINSTANCE();

    public GameController() {
        mainView = new MainView();
    }


    public void startGame() {

        Player player1 = new Player("pierwszy");
        Player player2 = new Player("drugi");

        gameService.startFiveRoundsForEachPlayer(player1, player2);
        getValueOfPoints(player1, player2);
        getWinner(player1, player2);
    }

    private void getWinner(Player player1, Player player2) {
        Optional<Player> winnerOptional = gameService.getGameWinner(player1, player2);

        if (winnerOptional.isPresent()) {
            mainView.showWinnerName(winnerOptional.get().getName());

        } else {
            mainView.showInfoAboutDraw();
        }
    }

    private void getValueOfPoints(Player player1, Player player2) {
        mainView.showInfoAboutPoints(player1.getName(), player1.getPoints());
        mainView.showInfoAboutPoints(player2.getName(), player2.getPoints());
    }

}
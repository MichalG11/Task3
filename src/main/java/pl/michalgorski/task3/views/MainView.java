package pl.michalgorski.task3.views;

public class MainView {

    public void showWinnerName(String winnerName) {
        System.out.println("Wygrał gracz o imieniu: " + winnerName);
    }

    public void showInfoAboutDraw() {
        System.out.println("Gra zakończyła się remisem!");
    }

    public void showInfoAboutPoints(String playerName, double playerPoints) {
        System.out.println("Gracz o imieniu: " + playerName + " zdobył: " + playerPoints + " punktów!");
    }

}
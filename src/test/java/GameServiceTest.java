import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.michalgorski.task3.models.Player;
import pl.michalgorski.task3.models.services.GameService;

import java.util.Optional;

public class GameServiceTest {

    private GameService gameService = GameService.getINSTANCE();

    @BeforeEach
    @Test
    public void checkGameWinnerReceiving() {
        Assertions.assertEquals(Optional.empty(), gameService.getGameWinner(new Player("pierwszy"),
                new Player("drugi")));

        Player player1 = new Player("pierwszy", 25.3);
        Player player2 = new Player("drugi", 25.4);
        Assertions.assertEquals(Optional.of(player1), gameService.getGameWinner(player1, player2));

        Player player3 = new Player("trzeci", 123.0);
        Player player4 = new Player("czwart", 15.9);
        Assertions.assertEquals(Optional.of(player4), gameService.getGameWinner(player3, player4));
    }

}
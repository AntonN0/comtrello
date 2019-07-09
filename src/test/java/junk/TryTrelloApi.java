package junk;

import trello.api.TrelloRestClient;
import com.trello.api.models.Card;
import org.testng.annotations.Test;

import java.io.IOException;

public class TryTrelloApi {
    trello.api.TrelloRestClient client = new trello.api.TrelloRestClient();

    @Test
    public void callIt() throws IOException, InterruptedException {
        Card card = new Card();
        card.name = "My New CARD 2";
        Card createdCard = client.cardsService.createCard("5ce82f1c897d0389fb05c151", card).execute().body();
        client.cardsService.deleteCard(createdCard.id).execute();
    }


}

package regression;

import com.trello.api.services.CardsService;
import com.trello.ui.core.Elem;
import org.openqa.selenium.By;
import trello.api.TrelloRestClient;
import com.trello.api.models.Card;
import com.trello.ui.core.BrowserFactory;
import com.trello.ui.pages.BoardsPage;
import com.trello.ui.pages.CardPage;
import com.trello.ui.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Date;

/**
 * Created by lolik on 25.06.2019
 */
public class CardActions extends BrowserFactory {

    public TrelloRestClient client = new TrelloRestClient();

    public LoginPage loginPage = new LoginPage();
    public BoardsPage boardsPage = new BoardsPage();
    public CardPage cardPage = new CardPage();

    Card card = new Card("Test_Card_"+new Date().getTime());



    @BeforeTest
    public void prepareData() throws IOException {
        card = client.cardsService.createCard("5ce82f1c897d0389fb05c151", card).execute().body();
    }

    @AfterTest
    public void clearData() throws IOException {
        client.cardsService.deleteCard(card.id).execute();
    }

    @Test
    public void login() throws InterruptedException {
        loginPage.open();
        loginPage.login("noga.anton+test@gmail.com", "qwer1234");
        boardsPage.openBoard("autotest");
    }

    @Test
    public void openCard() throws InterruptedException {

       cardPage.open(card.url.replace("https://trello.com",""));
       // cardPage.open("1-firstcard");
       // System.out.println(card);
       // Thread.sleep(10000);
        //Elem titleCard= new Elem(By.cssSelector(".card-detail-title-assist"), "Opened card title");
        //System.out.println(titleCard.find().getText());
        //Assert.assertEquals(titleCard.toString());
    }


    @Test
    public void moveCard(){
        //   cardPage.moveToList(""):

    }

    @Test
    public void renameCard(){

    }




}

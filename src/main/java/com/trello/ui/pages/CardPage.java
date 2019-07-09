package com.trello.ui.pages;

import com.trello.ui.core.Elem;
import org.openqa.selenium.By;

/**
 * Created by lolik on 25.06.2019
 */
public class CardPage {

    public Elem cardByUrlName(String urlName){
        return new Elem(By.cssSelector(".list-card[href*='"+urlName+"']"), urlName);
    }

    public void open(String cardUrl){

            cardByUrlName(cardUrl).click();

    }

    public void move(String listName){

    }


}

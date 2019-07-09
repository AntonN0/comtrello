package com.trello.ui.pages;

import com.trello.ui.core.Elem;
import org.openqa.selenium.By;

public class BoardsPage {

    private static final String PATH = "autotest17/boards";


    public Elem boardByUrlName(String urlName){
        return new Elem(By.cssSelector(".board-tile[href*='"+urlName+"']"), urlName);
    }


    public void open(){

    }

    public void isOpened(){

    }

    public void openBoard(String urlName){
        boardByUrlName(urlName).click();
    }
}

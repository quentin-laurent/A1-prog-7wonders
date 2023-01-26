package com.isep.utils;

import com.isep.game.cards.Card;
import com.isep.game.cards.Deck;
import com.isep.game.tokens.ProgressToken;
import com.isep.game.tokens.ProgressTokenStack;
import com.isep.game.wonders.Wonder;
import javafx.application.Application;
import javafx.stage.Stage;

import com.isep.utils.StageLoader;
import javafx.application.Platform;
import javafx.event.Event;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import java.io.IOException;

public class GUIParser extends Application implements InputParser{
    @Override
    public void start(Stage stage) throws IOException
    {
        // -_-_-_-_-_-_-_-_-_- load the fxml scene -_-_-_-_-_-_-_-_-_-
        StageLoader.setStage(stage);
        StageLoader.loadFXMLScene("/scenes/choiceMenu.fxml");
    }

    public int fetchPlayerCount()
    {
        boolean end = false;
        while(!end)
        {
            StageLoader.sleep(500);
            end = StageLoader.isActionFinished;
        }
        StageLoader.isActionFinished = false;
        return StageLoader.numberPlayer;
    }

    public String fetchPlayerName(){
        return null;
    }

    public LocalDate fetchPlayerBirthday(){
        return null;
    }

    public Wonder fetchPlayerWonder(List<Wonder> wonders){
        return null;
    }

    public Card fetchCardFromDeck(Deck leftDeck, Deck rightDeck, Deck centralDeck){
        return null;
    }

    public ProgressToken fetchProgressTokenFromStack(ProgressTokenStack stack){
        return null;
    }

    public void launchInterface()
    {
        launch();
    }
}

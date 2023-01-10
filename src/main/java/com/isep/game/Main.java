package com.isep.game;

import com.isep.game.cards.Deck;
import com.isep.game.wonders.Alexandria;
import com.isep.utils.ConsoleOutput;
import com.isep.utils.ConsoleParser;
import jdk.jshell.spi.ExecutionControl;

public class Main
{
    public static void main(String[] args) throws ExecutionControl.NotImplementedException
    {
        Game game = new Game(new ConsoleParser(), new ConsoleOutput());
        //game.play();
        Alexandria alexandria = new Alexandria();
        Deck deck = alexandria.getDeck();
        System.out.println(deck);
        System.out.println();
        deck.pickCard();
        System.out.println(deck);
    }
}
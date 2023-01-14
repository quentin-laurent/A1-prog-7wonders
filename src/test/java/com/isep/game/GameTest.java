package com.isep.game;

import com.isep.game.cards.*;
import com.isep.game.wonders.Alexandria;
import com.isep.game.wonders.Stage;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GameTest
{
    @Test
    void ifAPlayerCanBuildAStageItShouldBeBuilt()
    {
        // Checking if the player can build the Stage
        Alexandria alexandria = new Alexandria();
        Hand hand = new Hand();
        hand.addCard(new BlueCard(3, false));
        hand.addCard(new GreyCard(GreyCard.Material.WOOD));
        hand.addCard(new GreyCard(GreyCard.Material.WOOD));
        hand.addCard(new GreyCard(GreyCard.Material.GLASS));
        hand.addCard(new RedCard(0));

        Player player = new Player("bob", LocalDate.of(1999, 1, 1), alexandria, hand);

        ArrayList<Stage> stages = new ArrayList<>();
        stages.add(alexandria.getStages().get(0));

        assertTrue(player.getHand().canBuildStage(stages));

        // Checking if the Stage has been built
        alexandria.buildStage(alexandria.getStages().get(0), player.getHand());

        assertTrue(alexandria.getStages().get(0).isConstructed());

        // Checking if the cards have been removed from the player's hand after building the Stage
        Hand handAfterBuildingStage = new Hand();
        handAfterBuildingStage.addCard(new BlueCard(3, false));
        handAfterBuildingStage.addCard(new GreyCard(GreyCard.Material.WOOD));
        handAfterBuildingStage.addCard(new RedCard(0));

        assertEquals(handAfterBuildingStage, player.getHand());
    }

    @Test
    void ifAPlayerCanBuildAStageUsingYellowCardsItShouldBeBuilt()
    {
        // Checking if the player can build the Stage
        Alexandria alexandria = new Alexandria();
        Hand hand = new Hand();
        hand.addCard(new BlueCard(3, false));
        hand.addCard(new GreyCard(GreyCard.Material.WOOD));
        hand.addCard(new GreyCard(GreyCard.Material.WOOD));
        hand.addCard(new YellowCard());
        hand.addCard(new RedCard(0));

        Player player = new Player("bob", LocalDate.of(1999, 1, 1), alexandria, hand);

        ArrayList<Stage> stages = new ArrayList<>();
        stages.add(alexandria.getStages().get(0));

        assertTrue(player.getHand().canBuildStage(stages));

        // Checking if the Stage has been built
        alexandria.buildStage(alexandria.getStages().get(0), player.getHand());

        assertTrue(alexandria.getStages().get(0).isConstructed());

        // Checking if the cards have been removed from the player's hand after building the Stage
        Hand handAfterBuildingStage = new Hand();
        handAfterBuildingStage.addCard(new BlueCard(3, false));
        handAfterBuildingStage.addCard(new GreyCard(GreyCard.Material.WOOD));
        handAfterBuildingStage.addCard(new RedCard(0));

        assertEquals(handAfterBuildingStage, player.getHand());
    }
}
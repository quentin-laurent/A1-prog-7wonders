package com.isep;

/**
 * A class representing a red card.
 */
public class RedCard extends Card
{
    // Attributes
    private int horns;

    // Constructor
    public RedCard(int horns)
    {
        super(Color.RED);
        this.horns = horns;
    }
}

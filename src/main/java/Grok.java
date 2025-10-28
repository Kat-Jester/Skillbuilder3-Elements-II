
/**
 * Groks are bad actors in a game.  Groks have the ability to ingest
 * a PowerPill to replenish their energy.  This makes them difficult
 * to kill.
 *
 * @author (You Again)
 * @version (0.1)
 */
public class Grok
{
    /**
     * The default power level for a Grok.
     */
    private static final int DEFAULT_POWER_LEVEL = 50;

    // instance variables
    private int powerLevel;

    // constructors

    /**
     * Initializes a Grok object to the default power level of 50.
     */
    public Grok()
    {
        // Set the instance variable to the static default value
        this.powerLevel = DEFAULT_POWER_LEVEL;
    }

    /**
     * Initializes a Grok object to power powerLevel
     * @param powerLevel the initial power value for this Grok.
     */
    public Grok(int powerLevel)
    {
        // Set the instance variable to the value passed in the parameter
        this.powerLevel = powerLevel;
    }

    // accessor method

    /**
     * Returns the power level of this Grok.
     * @return returns the power level of this Grok
     */
    public int getPowerLevel()
    {
        return this.powerLevel;
    }

    // mutator methods

    /**
     * Sets the power level of this Grok.
     * @param powerLevel the power value to set for this Grok.
     */
    public void setPowerLevel(int powerLevel)
    {
        this.powerLevel = powerLevel;
    }

    /**
     * Set the power level of this Grok to the power level of
     * the pill.
     * @param pill The PowerPill that the this Grok.  The power
     * of the pill is added to the power level of this Grok.
     */
    public void takePowerPill(PowerPill pill)
    {
        // Add the power of the pill to the Grok's current power level
        this.powerLevel += pill.getPower();
    }

    /**
     * Invoked when this Grok takes a hit.  The power level of
     * this Grok is reduced by 5.
     */
    public void tookHit()
    {
        // Reduce the power level by 5
        this.powerLevel -= 5;
    }
}
import greenfoot.*;

/**
 * Autumn. A world with some leaves.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class MyWorld extends World
{
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();

        // Make a loop
        for(int i = 1; i <= 18;i += 1)
        {
            addObject(new Leaf(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
         }
    }

    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);

    }
}

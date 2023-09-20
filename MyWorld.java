import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        s s = new s();
        addObject(s,234,413);
        s s2 = new s();
        addObject(s2,1101,178);
        s s3 = new s();
        addObject(s3,735,175);
        s s4 = new s();
        addObject(s4,799,572);
        s s5 = new s();
        addObject(s5,279,236);
        s s6 = new s();
        addObject(s6,784,360);
    }
}

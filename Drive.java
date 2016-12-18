import TI.*;
/**
 * Write a description of class Drive here.
 * 
 * @author  (Arthur van Strien) 
 * @version (1)
 * @date    ()
 */
public class Drive
{
    Servo leftEngine;
    Servo rightEngine;
    
    public Drive()
    {
        leftEngine = new Servo(Constants.ENGINE_LEFT);
        rightEngine = new Servo(Constants.ENGINE_RIGHT);
    }
    
    public void stop()
    {
        leftEngine.update(1500);
        rightEngine.update(1500);
    }
    
    public void forward()
    {
        leftEngine.update(1300);
        rightEngine.update(1700);
    }
    
    public void forwardHalf()
    {
        leftEngine.update(1400);
        rightEngine.update(1600);
    }
    
    public void backwards()
    {
        leftEngine.update(1700);
        rightEngine.update(1300);
    }
    
    public void backwardsHalf()
    {
        leftEngine.update(1600);
        rightEngine.update(1400);
    }
    
    public void right(int slowDown)
    {
        int slowDownRight = 0;
        int slowDownLeft = 0;
        
        if(slowDown < 200 && slowDown > 0)
        {
            slowDownRight = slowDown;
        }
        else if(slowDown > 200 && slowDown < 400)
        {
            slowDownRight = 200;
            slowDownLeft = slowDown - 200;
        }
        else
        {
            slowDownRight = 200;
        }
        
        leftEngine.update((1300 + slowDownLeft));
        rightEngine.update((1700 - slowDownRight));
    }
    
    public void left(int slowDown)
    {
        int slowDownLeft = 0;
        int slowDownRight = 0;
        
         if(slowDown < 200 && slowDown > 0)
        {
            slowDownLeft = slowDown;
        }
        else if(slowDown > 200 && slowDown < 400)
        {
            slowDownLeft = 200;
            slowDownRight = slowDown - 200;
        }
        else
        {
            slowDownLeft = 200;
        }
        
        leftEngine.update((1300 + slowDownLeft));
        rightEngine.update((1700 - slowDownRight));
    }
}

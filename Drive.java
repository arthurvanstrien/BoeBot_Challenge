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
        if(slowDown > 400)
        {
            slowDown = 400;
        }
        
        leftEngine.update((1300));
        rightEngine.update((1700 - slowDown));
    }
    
    public void left(int slowDown)
    {   
        if(slowDown > 400)
        {
            slowDown = 400;
        }
        
        leftEngine.update((1300 + slowDown));
        rightEngine.update((1700));
    }
}

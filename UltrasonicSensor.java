import TI.*;
/**
 * Write a description of class UltrasonicSensor here.
 * 
 * @author  (Arthur van Strien) 
 * @version (1)
 * @date    ()
 */
public class UltrasonicSensor
{
    public UltrasonicSensor()
    {

    }
    
    public boolean clear()
    {
        BoeBot.digitalWrite(3, true);
        BoeBot.wait(50);
        BoeBot.digitalWrite(3, false);
        
        int pulse = BoeBot.pulseIn(4, true, 10000);
        if(pulse > 550)
        {
            return true;
        }
        
        return false;
    }
}

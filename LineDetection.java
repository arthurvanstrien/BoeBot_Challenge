import TI.*;
/**
 * Write a description of class LineDetection here.
 * 
 * @author  (Arthur van Strien) 
 * @version (1)
 * @date    ()
 */
public class LineDetection
{
    public LineDetection()
    {
        
    }
    
    public boolean leftBlack()
    {
        if(BoeBot.analogRead(Constants.LINE_DETECTOR_LEFT) > Constants.LINE_TRIGGER)
        {
            return true;
        }
        return false;
    }
    
    public boolean middleBlack()
    {
        if(BoeBot.analogRead(Constants.LINE_DETECTOR_MIDDLE) > Constants.LINE_TRIGGER)
        {
            return true;
        }
        return false;
    }
    
    public boolean rightBlack()
    {
        if(BoeBot.analogRead(Constants.LINE_DETECTOR_RIGHT) > Constants.LINE_TRIGGER)
        {
            return true;
        }
        return false;
    }
}

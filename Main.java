import TI.*;
/**
 * Write a description of class Main here.
 * 
 * @author  (Arthur van Strien) 
 * @version (1)
 * @date    ()
 */
public class Main
{
    public static void main(String[] args)
    {
        LineFollower lineFollower = new LineFollower();
        
        while(true)
        {
            lineFollower.followLine();
            BoeBot.wait(2);
        }
    }
}

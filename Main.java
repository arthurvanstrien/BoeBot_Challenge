
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
        BlueTooth blueTooth = new BlueTooth();
        Drive drive = new Drive();
        int data = 0;
        boolean followLine = false;
        
        while(true)
        {
            data = blueTooth.readConnection();
            
            if(data > -1)
            {
                if(data == 68)
                {
                    followLine = true;
                }
                else
                {
                    followLine = false;
                    drive.stop();
                }
            }
            
            if(followLine == true)
            {
                lineFollower.followLine();
            }
        }
    }
}

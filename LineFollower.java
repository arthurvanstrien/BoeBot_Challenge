import TI.*;
/**
 * Write a description of class LineFollower here.
 * 
 * @author  (Arthur van Strien) 
 * @version (1)
 * @date    ()
 */
public class LineFollower
{
    Drive drive;
    LineDetectors lineDetectors;
    private int left;
    private int right;
    
    public LineFollower()
    {
        drive = new Drive();
        lineDetectors = new LineDetectors();
        left = 0;
        right = 0;
    }
    
    public void followLine()
    {  
        //Turn Right
        if(lineDetectors.leftBlack() == true && lineDetectors.rightBlack() == false)
        {
            /*
            left = 0;
            right = right + Constants.LINE_STEP;
            drive.right(right);
            */
           
            drive.right(180);
        }
        //Turn Left
        else if(lineDetectors.leftBlack() == false && lineDetectors.rightBlack() == true)
        {
            /*
            right = 0;
            left = left + Constants.LINE_STEP;
            drive.left(left);
            */
           
            drive.left(180);
        }
        //Drive Straight
        else if(lineDetectors.rightBlack() == false && lineDetectors.leftBlack() == false && lineDetectors.middleBlack() == true)
        {   
            /*
            if(left > 0)
            {
                left = left - Constants.LINE_STEP;
                drive.left(left);
            }
            else if(right > 0)
            {
                right = right - Constants.LINE_STEP;
                drive.right(right);
            }
            else
            {
                drive.forward();
            }
            */
            drive.forward();
        }
        //Crossing detected
        else if(lineDetectors.rightBlack() == true && lineDetectors.leftBlack() == true && lineDetectors.middleBlack() == true)
        {
            /*
            drive.stop();
            */
            drive.stop();
        }
        //Other condition, possibly all sensors white.
        else
        {
            //drive.stop();
        }
    }
}

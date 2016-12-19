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
        if(lineDetectors.leftBlack() == true && lineDetectors.rightBlack() == false)
        {
            left = 0;
            right = right + 2;
            drive.right(right);
        }
        else if(lineDetectors.rightBlack() == false && lineDetectors.rightBlack() == true)
        {
            right = 0;
            left = left + 2;
            drive.left(left);
        }
        else if(lineDetectors.rightBlack() == false && lineDetectors.leftBlack() == false && lineDetectors.middleBlack() == true)
        {
            if(left > 0)
            {
                left = left - 2;
                drive.left(left);
            }
            else if(right > 0)
            {
                right = right - 2;
                drive.right(right);
            }
            else
            {
                drive.forward();
            }
        }
        else if(lineDetectors.rightBlack() == true && lineDetectors.leftBlack() == true && lineDetectors.middleBlack() == true)
        {
            //Crossing
        }
        else
        {
            drive.stop();
        }
    }
}

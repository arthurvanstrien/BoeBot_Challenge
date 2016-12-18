import TI.*;
/**
 * Write a description of class BlueTooth here.
 * 
 * @author  (Arthur van Strien) 
 * @version (1)
 * @date    ()
 */
public class BlueTooth
{
    SerialConnection connection;
   
    public BlueTooth()
    {
        connection = new SerialConnection(115200);
    }
   
    public int readConnection()
    {
        int data = -1;
        
        if(connection.available() > 0)
        {
            data = connection.readByte();
        }
        return data;
    }
}

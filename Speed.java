public enum Speed
{ 
    STOP(0, 0),
    HALF(50, 50),
    HALF_REVERSE(-50, -50),
    MAX(200, 200),
    MAX_REVERSE(-200, -200),
    LEFT(200, -200),
    RIGHT(-200, 200),
    HALF_LEFT_REVERSE(-200, -50),
    HALF_RIGHT_REVERSE(-50, -200),
    HALF_LEFT(200, 50),
    HALF_RIGHT(50, 200),
    LINE_LEFT(150, 0),
    LINE_RIGHT(0, 150),
    CROSS_LEFT(200, -50),
    CROSS_RIGHT(-50, 200);

    public final int Left, Right;

    Speed(int left, int right)
    {
        Left = left;
        Right = right;
    }
    
    public boolean equals(Speed speed)
    {
        return speed.Left == Left && speed.Right == Right;
    }
}
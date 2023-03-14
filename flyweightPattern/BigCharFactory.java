package flyweightPattern;

public class BigCharFactory {
    private static BigCharFactory instance;
    // private static BigChar bigChar;
    
    String bingChars[];

    public static BigCharFactory getInstance()
    {
        if (instance == null)
            instance = new BigCharFactory();
        return instance;
    }

    public BigChar getBigChar(char c)
    {
        // if (bigChar == null)
        //     bigChar = new BigChar();

        // return bigChar;
        return new BigChar(c);
    }
}

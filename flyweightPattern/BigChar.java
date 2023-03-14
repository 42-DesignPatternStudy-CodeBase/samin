package flyweightPattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// import java.util.ArrayList;

public class BigChar {
    char c;
    String printChar = "";

    public BigChar(char c) {
        this.c = c;
    }
    
    public void print() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("flyweightPattern/BigChars/" + c + ".txt"));            
            for (int i = 0; i < 8; i++)
            {
                printChar += br.readLine();
                printChar += '\n';
            }
        } catch (IOException e) {
            printChar += c + "??";
        }

        System.out.println(printChar);
    }
}

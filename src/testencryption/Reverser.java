package testencryption;

/**
 * @author Francisco Garcia
 * PID# 5767275
 * Programming Assignment 2
 * Professor Joslyn Smith
 */

public class Reverser extends Transpose {
    public Reverser(String s)
    {
        super(s);
    }
    public String reverseText(String word)
    {
        String reversed = "";
        for (int i = word.length()-1; i >= 0; i--)
        {
            reversed += word.charAt(i);
        }
        return reversed;
    }
        public String encode(String word)
        {
            return reverseText(word);
        }
        public String decode(String word)
        {
            return reverseText(word);
        }
}

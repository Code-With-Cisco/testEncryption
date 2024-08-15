package testencryption;

/**
 * @author Francisco Garcia
 * PID# 5767275
 * Programming Assignment 2
 * Professor Joslyn Smith
 */

    public class Transpose extends Cipher
    {
        Transpose(String s)
    {
        super(s);
    }
        //@Override
    public String encode(String word)
    {
        StringBuilder result = new StringBuilder(word);
        result.reverse();
        return result.toString();
    }
        //@Override
    public String decode(String word)
    {

        StringBuilder result = new StringBuilder(word);
        result.reverse();
        return result.toString();
    }
    }


package testencryption;
import javax.swing.JOptionPane;
/**
 * @author Francisco Garcia
 * PID# 5767275
 * Programming Assignment 2
 * Professor Joslyn Smith
 */

    class TestEncryption {

    public static void main(String[] args) 
    {
        String code, output = "";
        String text = JOptionPane.showInputDialog("Enter message:", "The quick brown fox");
        output += "The original message is \n" + text + "\n";

        Cipher c = new Caesar(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\n--Ceasar Cipher--\nThe encrypted message is: \n" + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output +="The decrypted message is: \n" + code + "\n";

        c = new Transpose(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\n--Transpose--\nThe encrypted Transpose message is: \n" + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output +="The decripted Transpose message is: \n" + code + "\n";

        Reverser r = new Reverser(text);
        r.encrypt();
        code = r.reverseText(code);
        output += "\n--Reverser--\nThe encrypted Reverse message is: \n" + code+ "\n";
        code = r.decode(code);
        output+="The decrypted Reverse message is: \n" + code;

        display(output);
    }
            static void display(String s)
            {
                JOptionPane.showMessageDialog(null, s, "Encrypt/decrypt",
                JOptionPane.INFORMATION_MESSAGE);
            }
    
}

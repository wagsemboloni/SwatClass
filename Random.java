/**
 * @(#)Random.java
 *
 *
 * @author 
 * @version 1.00 2014/12/4
 */
import javax.swing.*;
public class Random {
    public static void main(String[] args) {
        int randNum = 0;
        String word = "";
        StringBuffer strBuff = new StringBuffer();
        String newWord = "";
        
        //random the number between a word and the lenght of word.
        
        
        word = JOptionPane.showInputDialog(null, "Inter a word");
                
        for(int i = 0; i < word.length(); i++){
        	randNum = (int)(Math.random()* word.length());	
        	strBuff.append(word.charAt(randNum));
        }
        newWord = strBuff.toString();
        System.out.print(newWord);
        
    }
}

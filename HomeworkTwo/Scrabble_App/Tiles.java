import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 * @author Andrew Espinosa
 * @version 1.0
 * 
 */

public class Tiles {
    public String word_set;
    public char[] alphabet = {'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z'};
    
    /** Initialize Tiles file
     * 
     * @param word_set
     * 
     */
    public Tiles(String word_set){
        this.word_set = word_set;
    }

    /** Setter for word_set
     * 
     * @param word_set
     */
    
    public void word_setSetter(String word_set){
        this.word_set = word_set;
    }

    /** Build the word getter
     * 
     * @return String of word_set contents
     */
   
    public String word_setGetter(){
        return this.word_set;
    }

    /** Return the word length
     * 
     * @return int of word_set length
     */
   
    public int length(){
        return this.word_set.length();
    }

    /** Check if there are any errors within the the word_set
     * 
     * @param frame
     * @param text_field
     * @return Boolean of whether an error was located
     */
     
    public Boolean check_error(JFrame frame, JTextField text_field){
        int length = length();

        // Check if there are more than 7 Characters
        if(length > 7){
            JOptionPane.showMessageDialog(frame, "Please Enter Only 7 Letters");
            text_field.setText("");
            return true;
        }else{

            // Check if there are invalid characters
            int al_length = alphabet.length;
            for(int i = 0; i < length; i++){
                for(int j = 0; j <= al_length - 1; j++){
                    if(word_setGetter().charAt(i) == alphabet[j]){
                        // Character found in alphabet
                        break;
                    }else if(word_setGetter().charAt(i) != alphabet[j] && j == al_length - 1){
                        //character NOT found in alphabet
                        JOptionPane.showMessageDialog(frame, "Invalid Character: \"" + word_setGetter().charAt(i) + "\". Please enter only characters from the English alphabet.");
                        text_field.setText("");
                        return true;
                    }
                }
            }
        }

        return false;
    }
    
    /** Return every possibility
     * 
     * @param text_field
     * @return
     */

    public String[] scramble(JTextField text_field){
        String[] array = {"Hello", "World"};
        
        return array;
    }
}

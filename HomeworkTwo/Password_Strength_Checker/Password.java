import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/** Object: The user's password
 * @author Andrew Espinosa
 * @version 1.0
*/

public class Password{
    public String password;

    /** Constructor for the class.
     * @param The user's password.
     */
    public Password(String password){  
        this.password = password;
    }
    
    /** Sets the password to a new value.
     * @param password
     */
    public void setPassword(String password){
        this.password = password;
    }
    
    /** Returns the user's password
     * @return String of the user's password
     */
    public String retrievPassword(){
        return this.password;
    }
    
    /** Returns the length of the user's password.
     * @return int of the user's password length.
     */
    public int passwordLength(){
        return password.length();
    }
    
    /** Checks for any errors within the password.
     * @param Main document's frame.
     * @param text_field in the Main file.
     * @return Return whether there is an error.
     */
    // Check For Error
    public Boolean checkError(JFrame frame, JTextField text_field){

        String text = retrievPassword();

        if(passwordLength() < 8 || this.password.length() > 12){
            JOptionPane.showMessageDialog(frame, "Error: please enter 8-12 characters");
            text_field.setText("");
            return true;
        }else{
            for(int i = 0; i < passwordLength() - 1; i++){
                if(text.charAt(i) == ' '){
                    JOptionPane.showMessageDialog(frame, "Error: Spaces an invalid character");
                    text_field.setText("");
                    return true;
                }
            }
        }

        return false;
    }

    
    /** Determines the strength of the password. 
     * 
     * @param text_field in the Main file.
     * @return Return the new String with only the repeated values.
     * 
     */
    // Check Password Strength
    public String passwordStrength(JTextArea text_area){

        HashSet<Character> exists = new HashSet<>();
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < passwordLength(); i++){
            if(!exists.contains(password.charAt(i))){
                exists.add(password.charAt(i));
            }else{
                str.append(password.charAt(i));
            }
        }

        int strLength = str.toString().length();

        if(strLength <= 2){
            text_area.setText("The largest block in this password is: " + (strLength) + ".\nThis is a strong password.");
        }else if(strLength > 2 && strLength < 8){
            text_area.setText("The largest block in this password is: " + (strLength) + ".\nThis is a decent password.");
        }else{
            text_area.setText("The largest block in this password is: " + (strLength) + ".\nThis is a weak password.");
        }
        
        return str.toString();
    }   
}
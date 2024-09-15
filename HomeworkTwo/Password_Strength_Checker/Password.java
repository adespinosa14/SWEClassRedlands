import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Andrew Espinosa
 * @version 1.0
*/

public class Password{
    public String password;
    public Password(String password){  
        this.password = password;
    }

    // Password Setter
    public void setPassword(String password){
        this.password = password;
    }

    // Password Getter
    public String retrievPassword(){
        return this.password;
    }


    // Check For Error

    public Boolean checkError(JFrame frame, JTextField text_field){

        int length = this.password.length();
        String text = retrievPassword();

        if(length < 8 || this.password.length() > 12){
            JOptionPane.showMessageDialog(frame, "Error: please enter 8-12 characters");
            text_field.setText("");
            return true;
        }else{
            for(int i = 0; i < length - 1; i++){
                if(text.charAt(i) == ' '){
                    JOptionPane.showMessageDialog(frame, "Error: Spaces an invalid character");
                    text_field.setText("");
                    return true;
                }
            }
        }

        return false;
    }

    // Check Password Strength
    public String passwordStrength(){

        return "";
    }   
}
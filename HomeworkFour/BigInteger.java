package HomeworkFour;

import javax.swing.JOptionPane;

public class BigInteger {
	public String x;
	public String y;
	
	public BigInteger(String x, String y) {
		this.x = x;
		this.y = y;
	}
	
	
	// Getters
	public String getX() {
		return x;
	}
	
	public String getY() {
		return y;
	}
	
	// Setters
	public void setX(String x) {
		this.x = x;
	}
	
	public void setY(String y) {
		this.y = y;
	}
	
	// Add the integers
	public String addIntegers() {
		
		 // Get length
        int len1 = x.length() - 1;
        int len2 = y.length() - 1;
        
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(len1 >= 0|| len2 >=0 ){
            //Turn each character into a number from the back, save into it's respective variable
            int n1 = 0;
            if (len1 >= 0){
                n1 = x.charAt(len1)-'0';
                len1--;
            }   
            int n2 = 0;
            if (len2 >= 0){
                n2 = y.charAt(len2)-'0';
                len2--;
            }   
        
            // Add the numbers together. If there is a carry over, save that number for the next number in the String
            int sum = n1 + n2 + carry;
            int unit = sum%10;
            carry = sum/10;

            // Append the result into a new string 
            result.append((char)(unit + '0'));
        }
        
        // If there is carry over at the end of the loop, add it to the end of the string
        if(carry > 0){
            result.append((char)(carry + '0'));
        }

        // Return the result to the user
        return result.reverse().toString(); 
	}
	
	// Check for errors
	public void checkError() {
		try{
			Integer.parseInt(x);
			Integer.parseInt(y);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
	}
	
	// Modulus the Integers
	public String modIntegers() {
        // Initialize result
        int res = 0;
 
        // One by one process all digits of 'num'
        for (int i = 0; i < x.length(); i++) {
            res = (res * 10 + x.charAt(i) - '0') % Integer.parseInt(y);
        }
 
        return String.valueOf(res);
	}
	
	public String toString() {
		return "";
	}

}

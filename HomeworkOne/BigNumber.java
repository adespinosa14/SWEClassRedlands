package HomeworkOne;
public class BigNumber {
    // Create Parameters
    String x;
    String y;

    // Initialize the object
    public BigNumber(String x, String y){
        this.x = x;
        this.y = y;
    }

    // Create setterX
    public void setBigNumberX(String x){
        this.x = x;
    }

    // create getterX
    public String getBigNumberX(){
        return x;
    }

    // Creat SetterY
    public void setBigNumberY(String y){
        this.y = y;
    }

    // create getterY
    public String getBigNumberY(){
        return y;
    }

    // Add two number method
    public String add(String x, String y){
        //Detect if one of the tabs is left empty
        if(x == null || x.isEmpty())return y;
        if(y == null || y.isEmpty())return x;

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

}

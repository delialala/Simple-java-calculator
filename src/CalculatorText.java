import javax.swing.*;
//package resultField;
public class CalculatorText extends JTextField {
    static int previous;
    static int result;
    CalculatorText(){
        super();
        previous = 0;
        this.setText("0");
    }

    void updateResult(int number){
        //we append the number to the text that is already displayed
        String initialString = result + "";
        String addedString = number + "";
        if(result == 0)
            this.setText(addedString);
        else
            this.setText(initialString + addedString);
        //update the result
        try{
            result = Integer.parseInt(this.getText());
        }
        catch (Exception e){
            System.out.println("too many numbers");
        }
    }

    
}

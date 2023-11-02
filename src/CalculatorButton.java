import javax.swing.*;

public class CalculatorButton extends JButton {

    int number;
    CalculatorButton(){
        super();
        this.setRequestFocusEnabled(false);
    }
    CalculatorButton(String symbol){
        super(symbol);
        this.setRequestFocusEnabled(false);
        number = Integer.parseInt(symbol);
        this.addActionListener(e -> changeText());
    }

    //calculates the row where the number should be
    int getRow (){
        if(7<= this.number && this.number <= 9)
            return 2;
        if(4<= this.number && this.number <= 6)
            return 3;
        if(1<= this.number && this.number <= 3)
            return 4;

        return 0;
    }
    //calculates the column where the number should be
    int getColumn (){
        if(this.number == 1 || this.number == 4 || this.number == 7)
            return 0;
        if(this.number == 2 || this.number == 5 || this.number == 8)
            return 1;
        if(this.number == 3 || this.number == 6 || this.number == 9)
            return 2;

        return 0;
    }
    public void changeText(){
        if(0 <= number && number <= 9){
            Main.resultTextField.updateResult(number);
        }
    }
}

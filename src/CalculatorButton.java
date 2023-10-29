import javax.swing.*;
public class CalculatorButton extends JButton {

    int number;
    CalculatorButton(String symbol){
        super(symbol);
        number = Integer.parseInt(symbol);
        if(number < 1 || number > 9){
            number = 0;
        }
    }

    //calculates the row where the number should be
    int getRow (){
        if(7<= this.number && this.number <= 9)
            return 0;
        if(4<= this.number && this.number <= 6)
            return 1;
        if(1<= this.number && this.number <= 3)
            return 2;
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
    /*public int getNumber() {
        return number;
    }*/
}

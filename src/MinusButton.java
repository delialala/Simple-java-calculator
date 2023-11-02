public class MinusButton extends OperationalButton{
    public MinusButton() {
        this.setText("-");
    }
    @Override
    public int getResult(){
        return CalculatorText.previous - CalculatorText.result;
    }
}

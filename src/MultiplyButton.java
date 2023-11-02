public class MultiplyButton extends OperationalButton{
    public MultiplyButton() {
        this.setText("X");
    }
    @Override
    public int getResult(){
        return CalculatorText.previous * CalculatorText.result;
    }
}

public class PlusButton extends OperationalButton{
    public PlusButton() {
        this.setText("+");
    }
    @Override
    public int getResult(){
        return CalculatorText.previous + CalculatorText.result;
    }
}

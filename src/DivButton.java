public class DivButton extends OperationalButton{
    public DivButton() {
        this.setText("/");
    }
    @Override
    public int getResult(){
        return CalculatorText.previous / CalculatorText.result;
    }
}

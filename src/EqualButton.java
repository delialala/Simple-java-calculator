public class EqualButton extends CalculatorButton{
    public EqualButton() {
        super();
        this.addActionListener(e -> changeText());
        this.setText("=");
        number = 0;
    }

    @Override
    public void changeText() {
        int rez = Main.pressedButton.getResult();

        Main.resultTextField.setText(Main.pressedButton.getResult() + "");
        CalculatorText.result = rez;
    }
}

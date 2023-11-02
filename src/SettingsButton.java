import javax.swing.*;

public class SettingsButton extends JButton {
    public SettingsButton() {
        super();
        this.setText("⚙");
        this.addActionListener(e -> openSettings());
    }
    public void openSettings(){

    }
}

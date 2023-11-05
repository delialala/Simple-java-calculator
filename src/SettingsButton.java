import javax.swing.*;
import java.util.ArrayList;

public class SettingsButton extends JButton {
    public SettingsButton() {
        super();
        this.setText("⚙");
        this.addActionListener(e -> openSettings());
        this.setRequestFocusEnabled(false);
    }
    public void openSettings(){
        JFrame optionsFrame = new JFrame();
        optionsFrame.setVisible(true);

        //ArrayList<String> themesList = new ArrayList<String>();

        //JList<String> themesList = new JList<String>(); //data has type Object[]
        //list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        //list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        //list.setVisibleRowCount(-1);

        optionsFrame.setSize(300, 350);
        optionsFrame.setVisible(true);
        optionsFrame.setResizable(false);
    }
}

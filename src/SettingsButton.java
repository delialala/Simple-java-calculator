import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import java.awt.*;

public class SettingsButton extends JButton {
    DefaultListModel<String> themesListString;
    JList<String> themesList;
    JFrame optionsFrame;
    public SettingsButton() {
        super();
        this.setText("⚙");
        this.addActionListener(e -> openSettings());
        this.setRequestFocusEnabled(false);
    }
    public void openSettings(){
        //initializing the new frame
        optionsFrame = new JFrame("Choose theme");

        themesListString = new DefaultListModel<>();
        themesList = new JList<>(themesListString);

        //the layout for this frame
        GridBagLayout settingsLayout = new GridBagLayout();
        GridBagConstraints settingsConstraints = new GridBagConstraints();
        //make a panel for them
        JPanel settingsPanel = new JPanel();
        settingsPanel.setLayout(settingsLayout);

        //constrains for the list
        settingsConstraints.gridwidth = 1;
        settingsConstraints.gridheight = 1;
        settingsConstraints.fill = GridBagConstraints.BOTH;
        settingsConstraints.weightx = 1;
        settingsConstraints.weighty = 1;
        settingsConstraints.gridx = 0;
        settingsConstraints.gridy = 0;
        settingsConstraints.ipady = 100;
        settingsConstraints.anchor = GridBagConstraints.NORTHWEST;

        //initializing the themes' names
        themesListString.addElement("FlatLaf");
        themesListString.addElement("IntellijLaf");
        themesListString.addElement("DarkLaf");
        themesListString.addElement("DracuLaf");
        themesListString.addElement("DarkMacLaf");
        themesListString.addElement("Metal");
        themesListString.addElement("Native");

        //initializing the list itself
        themesList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        themesList.setLayoutOrientation(JList.VERTICAL);
        themesList.setVisibleRowCount(0);
        //add list to the panel
        settingsPanel.add(themesList, settingsConstraints);

        //make button
        JButton setThemeButton = new JButton("Select theme");
        setThemeButton.setRequestFocusEnabled(false);
        setThemeButton.addActionListener(e -> chooseTheme());
        //set the constraints
        settingsConstraints.insets = new Insets(10, 10, 10, 10);
        settingsConstraints.gridy = 1;
        settingsConstraints.ipady = 0;
        //add button to panel
        settingsPanel.add(setThemeButton, settingsConstraints);

        //add panel to the frame
        optionsFrame.getContentPane().add(settingsPanel);
        optionsFrame.setSize(300, 350);
        optionsFrame.setVisible(true);
        optionsFrame.setResizable(false);
        optionsFrame.setVisible(true);
    }
    public void chooseTheme(){
        if(themesList.getSelectedValue() == null)
            return;

        if(themesList.getSelectedValue().equals("DarkLaf")){
            try {
                UIManager.setLookAndFeel( new FlatDarkLaf() );
            } catch( Exception ex ) {
                System.err.println( "Failed to initialize LaF" );
            }
            Main.frame.setSize(300, 340);
        }
        if(themesList.getSelectedValue().equals("FlatLaf")){
            try {
                UIManager.setLookAndFeel( new FlatLightLaf() );
            } catch( Exception ex ) {
                System.err.println( "Failed to initialize LaF" );
            }
            Main.frame.setSize(300, 330);
        }
        if(themesList.getSelectedValue().equals("DracuLaf")){
            try {
                UIManager.setLookAndFeel( new FlatDarculaLaf());
            } catch( Exception ex ) {
                System.err.println( "Failed to initialize LaF" );
            }
            Main.frame.setSize(300, 360);
        }
        if(themesList.getSelectedValue().equals("Metal")){
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch( Exception ex ) {
                System.err.println( "Failed to initialize LaF" );
            }
            Main.frame.setSize(300, 350);
        }
        if(themesList.getSelectedValue().equals("Native")){
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch( Exception ex ) {
                System.err.println( "Failed to initialize LaF" );
            }
            Main.frame.setSize(300, 340);
        }
        if(themesList.getSelectedValue().equals("DarkMacLaf")){
            try {
                UIManager.setLookAndFeel(new FlatMacDarkLaf());
            } catch( Exception ex ) {
                System.err.println( "Failed to initialize LaF" );
            }
            Main.frame.setSize(300, 360);
        }
        if(themesList.getSelectedValue().equals("IntellijLaf")){
            try {
                UIManager.setLookAndFeel(new FlatIntelliJLaf());
            } catch( Exception ex ) {
                System.err.println( "Failed to initialize LaF" );
            }
            Main.frame.setSize(300, 360);
        }
        SwingUtilities.updateComponentTreeUI(Main.frame);
        SwingUtilities.updateComponentTreeUI(optionsFrame);
    }
}

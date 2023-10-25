import javax.swing.*;
import java.awt.*;

public class Main {

    //function for the GUI
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Demoooo!");

        //we make the frame look native
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
            System.out.println("yo mama");
        }
        //make a label and add it to the frame
        JLabel emptyLabel = new JLabel("yoooo");
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        //make a button and add it to the frame
        JButton myButton = new JButton("I dare you click me!");
        frame.getContentPane().add(myButton, BorderLayout.NORTH);

        //set action listener for the button
        myButton.addActionListener(e -> emptyLabel.setText("WOOO"));
        //set the size of the frame
        frame.setSize(300, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(Main::createAndShowGUI);
    }
}
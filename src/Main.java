import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    //function for the GUI
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Demoooo!");

        //we make the frame look native
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch(Exception e) {
            System.out.println("yo mama");
        }
        //make a label and add it to the frame
        JLabel emptyLabel = new JLabel("yoooo");
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        //make list for buttons
        ArrayList<JButton> numbers = new ArrayList<>(10);
        StringBuilder crtNumberString = new StringBuilder();

        //put numbers in the list
        for(int i = 0; i < 9; i++){
            crtNumberString.setLength(0);
            crtNumberString.append(i+1);
            JButton crtButton = new JButton(crtNumberString.toString());
            numbers.add(crtButton);
        }

        //create a panel and grid for the numbers
        JPanel numbersPanel = new JPanel();
        GridLayout numbersGrid = new GridLayout(3, 3);

        //put all the numbers in the panel
        for(JButton crtButton : numbers){
            numbersPanel.add(crtButton.getName(), crtButton);
        }

        //add the grid to the panel
        numbersPanel.setLayout(numbersGrid);
        frame.getContentPane().add(numbersPanel, BorderLayout.CENTER);

        //add grid
        //frame.add();
        //set the size of the frame and other cool stuff
        frame.setSize(300, 400);
        frame.setLayout(numbersGrid);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(Main::createAndShowGUI);
    }
}
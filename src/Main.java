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
        //JLabel emptyLabel = new JLabel("yoooo");
        //frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        //make list for buttons
        ArrayList<CalculatorButton> numbers = new ArrayList<>(10);
        StringBuilder crtNumberString = new StringBuilder();

        //put numbers in the list
        for(int i = 0; i < 9; i++){
            //delete the previous number and add the current one
            crtNumberString.setLength(0);
            crtNumberString.append(i+1);
            CalculatorButton crtButton = new CalculatorButton(crtNumberString.toString());
            numbers.add(crtButton);
        }
        //create a panel and grid for the numbers
        JPanel numbersPanel = new JPanel();
        GridBagLayout numbersGrid = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        //add the grid to the panel
        numbersPanel.setLayout(numbersGrid);
        //making the constraints for the buttons
        //one column wide
        constraints.gridwidth = 1;
        constraints.gridheight = 1;

        //put all the numbers in the panel
        for(CalculatorButton crtButton : numbers){
            constraints.ipadx = 30;
            constraints.ipady = 30;
            constraints.gridx = crtButton.getRow();
            constraints.gridy = crtButton.getColumn();
            numbersPanel.add(crtButton, constraints);
        }


        frame.getContentPane().add(numbersPanel, BorderLayout.CENTER);

        //add grid
        //set the size of the frame and other cool stuff
        frame.setSize(300, 400);

        frame.setLayout(numbersGrid);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(Main::createAndShowGUI);
    }
}
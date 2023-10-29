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
        constraints.ipadx = 30;
        constraints.ipady = 30;
        constraints.fill = GridBagConstraints.BOTH;
        //put all the numbers in the panel
        for(CalculatorButton crtButton : numbers){
            constraints.gridx = crtButton.getColumn();
            constraints.gridy = crtButton.getRow();
            numbersPanel.add(crtButton, constraints);
        }

        //let's add the other numbers too
        CalculatorButton CEbutton = new CalculatorButton("CE");
        constraints.gridx = 3;
        constraints.gridy = 2;
        numbersPanel.add(CEbutton, constraints);

        CalculatorButton minusButton = new CalculatorButton("-");
        constraints.gridx = 3;
        constraints.gridy = 3;
        numbersPanel.add(minusButton, constraints);

        CalculatorButton plusButton = new CalculatorButton("+");
        constraints.gridx = 3;
        constraints.gridy = 4;
        numbersPanel.add(plusButton, constraints);

        CalculatorButton equalButton = new CalculatorButton("=");
        constraints.gridx = 3;
        constraints.gridy = 5;
        equalButton.requestFocusInWindow();
        numbersPanel.add(equalButton, constraints);

        CalculatorButton zeroButton = new CalculatorButton("0");
        constraints.gridx = 0;
        constraints.gridy = 5;
        numbersPanel.add(zeroButton, constraints);

        CalculatorButton multiplyButton = new CalculatorButton("X");
        constraints.gridx = 1;
        constraints.gridy = 5;
        numbersPanel.add(multiplyButton, constraints);

        CalculatorButton divisionButton = new CalculatorButton("/");
        constraints.gridx = 2;
        constraints.gridy = 5;
        numbersPanel.add(divisionButton, constraints);

        //make the text result
        JTextField result = new JTextField();
        result.setHorizontalAlignment(SwingConstants.RIGHT);
        constraints.gridwidth = 4;
        constraints.gridx = 0;
        constraints.gridy = 1;
        numbersPanel.add(result, constraints);

        //and the settings button
        CalculatorButton settingsButton = new CalculatorButton("()");
        constraints.ipady = 10;
        constraints.ipadx = 10;
        constraints.gridx = 3;
        constraints.gridy = 0;
        numbersPanel.add(settingsButton, constraints);

        //work on the result
        result.setEditable(false);
        frame.getContentPane().add(numbersPanel, BorderLayout.SOUTH);

        zeroButton.addActionListener(e -> result.setText("zero"));
        //add grid
        //set the size of the frame and other cool stuff
        frame.setSize(300, 350);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(Main::createAndShowGUI);
    }
}
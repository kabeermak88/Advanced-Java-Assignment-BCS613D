4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( ).

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CountryButtons {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Country Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create buttons
        JButton srilankaBtn = new JButton("Sri Lanka");
        JButton indiaBtn = new JButton("India");

        // Create label for output
        JLabel resultLabel = new JLabel("Press a button");

        // Add action listeners
        srilankaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("Sri Lanka is pressed");
            }
        });

        indiaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("India is pressed");
            }
        });

        // Add components to frame
        frame.add(srilankaBtn);
        frame.add(indiaBtn);
        frame.add(resultLabel);

        // Display the frame
        frame.setVisible(true);
    }
}

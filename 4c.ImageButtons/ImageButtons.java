// 4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
// Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
// pressed by implementing the event handling mechanism with addActionListener( ).

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
public class ImageButtons {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Image Button Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new FlowLayout());

        // Try to load images (using default icons if images not found)
        ImageIcon clockIcon = createImageIcon("/images/clock.png", "Digital Clock");
        ImageIcon hourglassIcon = createImageIcon("/images/hourglass.png", "Hour Glass");

        // Create buttons with images
        JButton clockBtn = new JButton("Digital Clock", clockIcon);
        JButton hourglassBtn = new JButton("Hour Glass", hourglassIcon);

        // Create label for output
        JLabel resultLabel = new JLabel("Press an image button");

        // Add action listeners
        clockBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("Digital Clock is pressed");
            }
        });

        hourglassBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("Hour Glass is pressed");
            }
        });

        // Add components to frame
        frame.add(clockBtn);
        frame.add(hourglassBtn);
        frame.add(resultLabel);

        // Display the frame
        frame.setVisible(true);
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path, String description) {
        URL imgURL = ImageButtons.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return new ImageIcon(); // return empty icon
        }
    }
}

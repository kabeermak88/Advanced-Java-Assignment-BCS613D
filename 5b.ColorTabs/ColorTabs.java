// 5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
// display the concerned color whenever the specific tab is selected in the Pan.

import javax.swing.*;
import java.awt.*;
public class ColorTabs {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Color Tabs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();
        
        // Create colored panels
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.add(new JLabel("RED Tab"));
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.add(new JLabel("BLUE Tab"));
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.add(new JLabel("GREEN Tab"));
        
        // Add tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);
        
        // Add to frame and display
        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}

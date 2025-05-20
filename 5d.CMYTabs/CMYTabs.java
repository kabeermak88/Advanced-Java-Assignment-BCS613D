// 5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
// display the concerned color whenever the specific tab is selected in the Pan

import javax.swing.*;
import java.awt.*;
public class CMYTabs {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("CMY Color Tabs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();
        
        // Create colored panels
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        cyanPanel.add(new JLabel("Cyan Tab"));
        
        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);
        magentaPanel.add(new JLabel("Magenta Tab"));
        
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        yellowPanel.add(new JLabel("Yellow Tab"));
        
        // Add tabs
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);
        
        // Add to frame and display
        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}

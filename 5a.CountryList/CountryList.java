// 5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
// Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
// display them on console whenever the countries are selected on the list.

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class CountryList {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Country Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Country data
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", 
            "Greenland", "Singapore"
        };
        
        // Create list and make it scrollable
        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);
        
        // Add selection listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Selected countries:");
                    for (String country : countryList.getSelectedValuesList()) {
                        System.out.println("- " + country);
                    }
                    System.out.println();
                }
            }
        });
        
        // Add to frame and display
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

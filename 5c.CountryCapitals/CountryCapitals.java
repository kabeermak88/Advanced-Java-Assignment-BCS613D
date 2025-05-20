// 5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
// Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
// display the capital of the countries on console whenever the countries are selected on the list.

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
public class CountryCapitals {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Country Capitals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Country and capital data
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", 
            "Greenland", "Singapore"
        };
        
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Various (continent)");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");
        
        // Create list and make it scrollable
        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);
        
        // Add selection listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selected = countryList.getSelectedValue();
                    if (selected != null) {
                        System.out.println("Capital of " + selected + ": " + capitals.get(selected));
                    }
                }
            }
        });
        
        // Add to frame and display
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

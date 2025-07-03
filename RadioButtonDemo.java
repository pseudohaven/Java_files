// A Java GUI program that uses radio buttons to let users select a pet.
// It displays the selected pet's image and shows a message box with the selection.

/*
Name : Erick Kanja  
Reg No: BSE-05-0162/2024  
Group : 3  
Github username:pseudohaven
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame implements ActionListener {
    // Declare radio buttons and a label for the image
    JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    JLabel petImageLabel;

    public RadioButtonDemo() {
        // Set up the frame
        setTitle("RadioButtonDemo");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Create radio buttons and add action listeners
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Add action listener to all radio buttons
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        // Create a label to display the pet image
        petImageLabel = new JLabel();
        petImageLabel.setPreferredSize(new Dimension(100, 100));

        // Add components to the frame
        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);
        add(petImageLabel);
    }

 @Override
public void actionPerformed(ActionEvent e) {
    String pet = ((JRadioButton) e.getSource()).getText().toLowerCase();
    String imageFile = "/" + pet + ".png";

    java.net.URL imageUrl = getClass().getResource(imageFile);

    if (imageUrl != null) {
        ImageIcon originalIcon = new ImageIcon(imageUrl);
        Image scaledImage = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        petImageLabel.setIcon(new ImageIcon(scaledImage));
    } else {
        System.out.println("Image not found: " + imageFile);
        petImageLabel.setIcon(null);
    }

    JOptionPane.showMessageDialog(this, "You selected: " + pet.substring(0, 1).toUpperCase() + pet.substring(1));
}



    private void showMessage(String message) {
        // Display a message box with the selection
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        // Create and show the application window
        RadioButtonDemo app = new RadioButtonDemo();
        app.setVisible(true);
    }
}




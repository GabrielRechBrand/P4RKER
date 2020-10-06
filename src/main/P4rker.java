package main;

import javax.swing.*;
import java.awt.*;

public class P4rker {



    public P4rker() {

        JTextField placeField, plateField, colorField, modelField;
        JLabel placeLabel, plateLabel;
        JButton submitButton1, submitButton2, submitButton3, submitButton4;

        JFrame frame = new JFrame();
        ParkingPanel panel = new ParkingPanel();
        frame.add(panel);

        placeLabel = new JLabel("PLACE");
        placeField = new JTextField(10);
        submitButton1 = new JButton("Submit Data");

        plateLabel = new JLabel("PLATE");
        plateField = new JTextField(10);
        submitButton2 = new JButton("Submit Data");

        panel.add(placeLabel);
        panel.add(placeField);
        panel.add(submitButton1);

        panel.add(plateLabel);
        panel.add(plateField);
        panel.add(submitButton2);

        frame.setLayout(new FlowLayout());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("P4RKER");

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);



    }

    public static void main(String[] args) {

        new P4rker();

    }
}


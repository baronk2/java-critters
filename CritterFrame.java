// CSE 142 Homework 8 (Critters)
// Authors: Stuart Reges and Marty Stepp
//
// Class CritterFrame provides the user interface for a simple simulation
// program.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CritterFrame extends JFrame {
    private CritterModel myModel;
    private CritterPanel myPicture;
    private javax.swing.Timer myTimer;
    private JButton[] counts;
    
    public CritterFrame(int width, int height) {
        // create frame and model
        setTitle("CSE142 critter simulation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        myModel = new CritterModel(width, height);

        // set up critter picture panel
        myPicture = new CritterPanel(myModel);
        add(myPicture, BorderLayout.CENTER);

        addTimer();

        // add timer controls to the south
        JPanel p = new JPanel();
        JButton b1 = new JButton("start");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myTimer.start();
            }
        });
        p.add(b1);
        JButton b2 = new JButton("stop");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myTimer.stop();
            }
        });
        p.add(b2);
        JButton b3 = new JButton("step");
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                doOneStep();
            }
        });
        p.add(b3);
        
        // add debug button
        JButton b4 = new JButton("debug");
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myModel.toggleDebug();
                myPicture.repaint();
            }
        });
        p.add(b4);
        add(p, BorderLayout.SOUTH);
    }

    // starts the simulation...assumes all critters have already been added
    public void start() {
        addClassCounts();
        pack();
        setVisible(true);
    }

    // add right-hand column showing how many of each critter are alive
    private void addClassCounts() {
        Set<Map.Entry<String, Integer>> entries = myModel.getCounts();
        JPanel p = new JPanel(new GridLayout(entries.size(), 1));
        counts = new JButton[entries.size()];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = new JButton();
            p.add(counts[i]);
        }
        add(p, BorderLayout.EAST);
        setCounts();
    }

    private void setCounts() {
        Set<Map.Entry<String, Integer>> entries = myModel.getCounts();
        int i = 0;
        for (Map.Entry<String, Integer> entry: myModel.getCounts()) {
            String s = String.format("%s =%4d", entry.getKey(),
                                     (int) entry.getValue());
            counts[i].setText(s);
            i++;
        }
    }

    // add a certain number of critters of a particular class to the simulation
    public void add(int number, Class<? extends Critter> c) {
        myModel.add(number, c);
    }

    // post: creates a timer that calls the model's update
    //       method and repaints the display
    private void addTimer() {
        ActionListener updater = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                doOneStep();
            }
        };
        myTimer = new javax.swing.Timer(10, updater);
        myTimer.setCoalesce(true);
    }

    // one step of the simulation
    private void doOneStep() {
        myModel.update();
        setCounts();
        myPicture.repaint();
    }
}
package com.filminterpolator;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

    //Imports are listed in full to show what's being used
//could just import javax.swing.* and java.awt.* etc..
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;


public class GUI {
        //Note: Typically the main method will be in a
//separate class. As this is a simple one class
//example it's all in the one class.

        private String fps2 = "FPS x 2";
        private String fps3 = "FPS x 3";
        private String fps4 = "FPS x 4";
        private String fps5 = "FPS x 5";
        private String fps6 = "FPS x 6";

        private JRadioButton FPS2 = new JRadioButton(fps2);
        private JRadioButton FPS3 = new JRadioButton(fps3);
        private JRadioButton FPS4 = new JRadioButton(fps4);
        private JRadioButton FPS5 = new JRadioButton(fps5);
        private JRadioButton FPS6 = new JRadioButton(fps6);



        JFileChooser chooser;
        String choosertitle;


        private boolean flag = false;



        GUI() {
    }
    public boolean openInterfaceWindow() {
        JLabel lbl1 = new JLabel("Choose FPS multiplier:");
        JLabel lbl2 = new JLabel("Specify input directory: ");
        JLabel lbl3 = new JLabel("Specify output directory:");

        JFrame guiFrame = new JFrame();
        //make sure the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Film Interpolator v.0.2");
        guiFrame.setSize(600, 250);

        DemoJFileChooser inputDIR = new DemoJFileChooser('i');
        DemoJFileChooser outputDIR = new DemoJFileChooser('o');


        JButton go = new JButton("Go");
        go.setBackground(Color.GREEN);
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = true;
                Interpolator Inter = new Interpolator();
                Inter.processFilm();
                System.out.println("NoFPS = " + Options.getSingleton().getFPSvalue());
                System.out.println("Number of Added frame = " + Options.getSingleton().getNumberOfAddedFrames());
                System.out.println("Input Path = " + Options.getSingleton().getInputDirectoryPath());
                System.out.println("Output Path = " + Options.getSingleton().getOutputDirectoryPath());
                guiFrame.dispose();
            }
        });


//This will center the JFrame in the middle of the screen
//Options for the JComboBox
//The JFrame uses the BorderLayout layout manager.
//Put the two JPanels and JButton in different areas.


        FPS2.setActionCommand(fps2);
        FPS2.setSelected(true);
        FPS3.setActionCommand(fps3);
        FPS3.setActionCommand(fps4);
        FPS5.setActionCommand(fps5);
        FPS6.setActionCommand(fps6);

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(FPS2);
        group.add(FPS3);
        group.add(FPS4);
        group.add(FPS5);
        group.add(FPS6);

        JPanel pan = new JPanel();
        JPanel pan2 = new JPanel();
        JPanel pan3 = new JPanel();

        pan.add(lbl1);
        pan.add(FPS2);
        pan.add(FPS3);
        pan.add(FPS4);
        pan.add(FPS5);
        pan.add(FPS6);

        pan2.add(lbl2);
        pan2.add(inputDIR);

        pan3.add(lbl3);
        pan3.add(outputDIR);
        pan3.add(go);
        Options.getSingleton().setFPSvalue(2);


        guiFrame.add(pan, BorderLayout.NORTH);
        guiFrame.add(pan2, BorderLayout.CENTER);
        guiFrame.add(pan3, BorderLayout.SOUTH);
        //guiFrame.add(FPS3, BorderLayout.CENTER);
        //FPS3.setLocation(0,0);
        //guiFrame.add(listPanel, BorderLayout.CENTER);
        //guiFrame.add(vegFruitBut,BorderLayout.SOUTH);
        //make sure the JFrame is visible
        guiFrame.setVisible(true);
        //Register a listener for the radio buttons.
        FPS2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Options.getSingleton().setFPSvalue(2);

            }
        });
        FPS3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //e.getSource().equals(FPS2);
                Options.getSingleton().setFPSvalue(3);
            }
        });
        FPS4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Options.getSingleton().setFPSvalue(4);
            }
        });
        FPS5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Options.getSingleton().setFPSvalue(5);
                //System.out.println(noFPS);
            }
        });
        FPS6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Options.getSingleton().setFPSvalue(6);
            }


        });
        return flag;
    }

    public class DemoJFileChooser extends JPanel
                implements ActionListener {
            JButton Bgo;

            JFileChooser chooser;
            String choosertitle;
            char io;

            DemoJFileChooser(char io) {
                Bgo = new JButton("Choose");
                Bgo.addActionListener(this);
                add(Bgo);
                this.io = io;
            }

            public void actionPerformed(ActionEvent e) {
                int result;
                chooser = new JFileChooser();
                chooser.setCurrentDirectory(new java.io.File("."));
                chooser.setDialogTitle(choosertitle);
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                //
                // disable the "All files" option.
                //
                chooser.setAcceptAllFileFilterUsed(false);
                //
                if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                    System.out.println("getCurrentDirectory(): "
                            +  chooser.getCurrentDirectory());
                    System.out.println("getSelectedFile() : "
                            +  chooser.getSelectedFile());
                    if(io == 'i') {
                        Options.getSingleton().setInputDirectoryPath(chooser.getSelectedFile().getAbsolutePath());
                        System.out.println(Options.getSingleton().getInputDirectoryPath());
                    }
                    else {
                        Options.getSingleton().setOutputDirectoryPath(chooser.getSelectedFile().getAbsolutePath());
                        System.out.println(Options.getSingleton().getOutputDirectoryPath());
                    }
                }
                else {
                    System.out.println("No Selection ");
                }
            }
        }
}

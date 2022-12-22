package ru.mirea.task05.exe3;

import javax.swing.*;

class Frame extends JFrame {
    private final JLabel imgLabel;

    public Frame(String arg){
        this.setSize(1200, 1200);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource(arg)), SwingConstants.CENTER);
        getContentPane().add(imgLabel);
    }
}

public class main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Arguments wasnt inputed.");
            return;
        }
        Frame frame = new Frame(args[0]);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

package ru.mirea.task05.exe4;

import javax.swing.*;

public class Frame extends JFrame{
    private final JLabel imgLabel;
    private int imgNum = 1;

    private Frame(){
        this.setSize(1200, 1200);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("1.jpg")), SwingConstants.CENTER);

        getContentPane().add(imgLabel);

        Timer timer = new Timer(200, w -> nextImg());
        timer.start();
    }
    private void nextImg(){
        imgLabel.setIcon(new ImageIcon(getClass().getResource((++imgNum)+".jpg")));
        if(imgNum == 4) imgNum = 0;

    }

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

package ru.mirea.task5.exe1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Team{
    String title;
    JButton button;
    int score;

    public Team(String title, int score) {
        this.title = title;
        this.button = new JButton(title);
        this.score = score;
    }
}




public class GUI extends JFrame{
    Team milan = new Team("AC Milan", 0);
    Team madrid = new Team("Real Madrid", 0);

    String lastScorerString = "N/A";
    String winnerString = "DRAW";

    JLabel resultLabel = new JLabel("Result: "+milan.score+" X "+madrid.score);
    JLabel lastScorerLabel = new JLabel("Last Scorer: "+lastScorerString);
    Label winnerLabel = new Label("Winner: " + winnerString);

    private void coutScore() {
        winnerString = milan.score > madrid.score ? "AC Milan" : milan.score < madrid.score ? "Real Madrid": "Draw" ;
        winnerLabel.setText("Winner: " + winnerString);
    }

    public GUI () {
        setSize(384, 256);
        // Кнопки футбольных команд
        add(milan.button, BorderLayout.WEST);
        add(madrid.button, BorderLayout.EAST);

        add(resultLabel, BorderLayout.NORTH);
        add(lastScorerLabel, BorderLayout.SOUTH);
        add(winnerLabel, BorderLayout.CENTER);

        milan.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan.score++;
                lastScorerString = "AC Milan";
                resultLabel.setText("Result: "+milan.score+" X "+madrid.score);
                lastScorerLabel.setText("Last Scorer: "+lastScorerString);
                coutScore();
            }
        });

        madrid.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madrid.score++;
                lastScorerString = "Real Madrid";
                resultLabel.setText("Result: "+milan.score+" X "+madrid.score);
                lastScorerLabel.setText("Last Scorer: "+lastScorerString);
                coutScore();
            }
        });

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GUI();
    }
}

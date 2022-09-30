package src;
import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String [] args){
        new Main();
    }

    public Main(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("New Game");
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Minesweeper");
        frame.pack();
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;

public class ColoredStringExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Colored String Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        JLabel coloredLabel = new JLabel("<html><font color='green'>This is a red string</font></html>");
        panel.add(coloredLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}

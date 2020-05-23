import javax.swing.*;
import java.awt.*;

public class Main {
    static JLabel label1;
    static JTextField text1;
    static JButton convert;
    static JLabel label2;
    static JTextField text2;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Convert Fahrenheit to celsius");
        JPanel cmp = new Component();
        frame.add(cmp);
        frame.setSize(500,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}

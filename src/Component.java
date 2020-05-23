import javax.swing.*;
import java.awt.*;

public class Component extends JPanel {
    public Component() {
        setComponent();
    }
    public void setComponent() {
        setLayout(null);
        Main.label1=new JLabel("Fahrenheit");
        Main.label1.setBounds(10,20,100,20);
        add(Main.label1);
        Main.text1=new JTextField();
        Main.text1.setBounds(75,20,100,20);
        add(Main.text1);
        Main.convert= new JButton("Convert");
        Main.convert.setBounds(190,20,80,20);
        Main.convert.addActionListener(new Listener());
        add(Main.convert);
        Main.label2=new JLabel("celsius");
        Main.label2.setBounds(280,20,100,20);
        add(Main.label2);
        Main.text2=new JTextField();
        Main.text2.setBounds(325,20,100,20);
        add(Main.text2);

    }
}

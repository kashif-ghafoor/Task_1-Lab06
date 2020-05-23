import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Main.convert) {
            String input =Main.text1.getText();
            double in = Double.parseDouble(input);
            double output = (0.556)*(in-32);
            Main.text2.setText(String.valueOf(output));

        }



    }
}

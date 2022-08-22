import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");

    NewWindow(){
        label.setBounds(0,0,100,50);

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

   // public static void main (String [] args){



    //}
}

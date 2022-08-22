import javax.swing.*;

public class NewWindow2 {
    JFrame frame2 = new JFrame();
    JLabel label2 = new JLabel("Bye");

    NewWindow2(){
        label2.setBounds(0,0,100,50);

        frame2.add(label2);

        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setSize(420,420);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }

    public static void main (String [] args){



    }
}


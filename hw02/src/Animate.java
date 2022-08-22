import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Animate extends JFrame
        implements ActionListener{

    JLabel lblanim;
    JTextField txtAnim;

    private int x;
    private int y;
    private JButton btnMove,btnStop;
    private static Timer timer;
    private boolean toRight;

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        //super.paint(g);
        g.setColor(Color.BLACK);

        g.fillRect(x, y, 50, 80);



    }


    public Animate() {
        // TODO Auto-generated constructor stub
        setLayout(new FlowLayout());
        lblanim = new JLabel("Please Wait");
        lblanim.setText("Please Wait");
        lblanim.setBounds(50, 110, 80, 30);
        lblanim.setVisible(false);
        add(lblanim);
        txtAnim = new JTextField("Loading");
        txtAnim.setBounds(150, 150, 150, 80);
        txtAnim.setEditable(true);// False yaptığım zaman kayboluyor.
        add(txtAnim);
        x=10; //Start point for X axis
        y=400;//Start point for Y axis
        toRight=true;
        btnMove= new JButton("Move");
        //add(btnMove);
        btnStop= new JButton("Stop");
        //add(btnStop);

        btnMove.addActionListener(this);
        btnStop.addActionListener(this);

        // initialize "timer"
        timer= new Timer(100, this);
        timer.start();// start timer



        setSize(500, 500);
        setTitle("Please Wait");
        setVisible(true);
        try {
            TimeUnit.SECONDS.sleep(6);
        }catch(InterruptedException e){}
        dispose();


        //setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public void init(){
        // TODO Auto-generated constructor stub
        setLayout(new FlowLayout());
        lblanim = new JLabel("Please Wait");
        lblanim.setText("Please Wait");
        lblanim.setBounds(50, 110, 80, 30);
        lblanim.setVisible(false);
        add(lblanim);
        txtAnim = new JTextField("Loading");
        txtAnim.setBounds(150, 150, 150, 80);
        txtAnim.setEditable(true);// False yaptığım zaman kayboluyor.
        add(txtAnim);
        x=10; //Start point for X axis
        y=400;//Start point for Y axis
        toRight=true;
        btnMove= new JButton("Move");
        //add(btnMove);
        btnStop= new JButton("Stop");
        //add(btnStop);

        btnMove.addActionListener(this);
        btnStop.addActionListener(this);

        // initialize "timer"
        timer= new Timer(100, this);
        timer.start();// start timer



        setSize(500, 500);
        setTitle("Please Wait");
        setVisible(true);
        try {
            TimeUnit.SECONDS.sleep(6);
        }catch(InterruptedException e){}
        dispose();


        //setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }









    public static void main(String[] args) {
        new Animate();
        //timer.start();



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if(e.getSource()==timer) {
            // controls circle moving
            if(x<450 && toRight==true) {
                x=x+5;// move to right
            }
            else if(x>0) {
                toRight=false;
                x=x-5; // move to left
            }
            else {
                toRight=true;
            }
        }

        repaint();// calls the "paint" method

    }

}







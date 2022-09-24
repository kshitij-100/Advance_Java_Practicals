import javax.swing.*;
import java.awt.event.*;

public class Practical_6 extends JFrame implements KeyListener {
    public Practical_6(){
        setLayout(null);

        JTextField bt = new JTextField("Enter text...");
        bt.setBounds(100,140,150,40);
        add(bt);

        bt.addKeyListener(this);

        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     @Override
    public void keyTyped(KeyEvent e) {
        JOptionPane.showMessageDialog(this, "Key is Typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        JOptionPane.showMessageDialog(this, "Key is Pressed"); 
    }

    @Override
    public void keyReleased(KeyEvent e) {
        JOptionPane.showMessageDialog(this, "Key is Relesed");
        
    }
    public static void main(String[] args) {
        new Practical_6();
    }

   
}

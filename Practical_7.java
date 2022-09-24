import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practical_7 extends JFrame implements MouseListener,MouseMotionListener{
    private JLabel lb;
    public Practical_7(){
        setLayout(null);

        lb = new JLabel();
        lb.setBounds(100,150 , 200, 40);
        lb.setLayout(new FlowLayout());
        add(lb);

        addMouseListener(this);
        addMouseMotionListener(this);

        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
    
    @Override
    public void mouseDragged(MouseEvent e) {
        lb.setText("Mouse has Dragged");
        
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        lb.setText("Mouse has Moved");
        
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        lb.setText("Mouse has Clicked");
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        lb.setText("Mouse has Pressed");
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        lb.setText("Mouse has Relesed");
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        lb.setText("Mouse has Entered");
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        lb.setText("Mouse has Exited");
        
    }
    public static void main(String[] args) {
        new Practical_7();
    }
}

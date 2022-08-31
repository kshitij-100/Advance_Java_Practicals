import javax.swing.*;
import java.awt.*;

public class Practical_1 extends JFrame{
	public Practical_1(){

		ImageIcon icon = new ImageIcon("C:\\Users\\GT\\Documents\\NetBeansProjects\\ADV. JAVA Practicals\\src\\user_icon.jpg");
		JLabel lb1 = new JLabel("Login Form",icon,JLabel.CENTER);
		add(lb1);

        JTextField tfo = new JTextField(20);
		add(tfo);
        JLabel lb2 = new JLabel("\n\nUsername");
		add(lb2);
		JTextField tf = new JTextField(20);
		add(tf);

		JLabel lb3 = new JLabel("Password");
		add(lb3);
		JPasswordField ps = new JPasswordField(20);
		add(ps);

		JButton btn = new JButton("Login");
		add(btn);

		setSize(300,300);
		setVisible(true);
		setTitle("Practical No. 1");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Practical_1();
		

	}
}
import javax.swing.*;
import java.awt.*;

public class Practical_1 extends JFrame{
	
	public Practical_1(){

		setLayout(null);

		ImageIcon icon = new ImageIcon("C:\\Users\\GT\\Documents\\NetBeansProjects\\ADV. JAVA Practicals\\src\\user_icon.jpg");
		JLabel lb1 = new JLabel("Login Form",icon,JLabel.CENTER);
		lb1.setBounds(80,10,150,100);
		add(lb1);

        JLabel lb2 = new JLabel("Username");
        lb2.setBounds(20,100,100,30);
		add(lb2);
		JTextField tf = new JTextField(20);
		tf.setBounds(130,100,150,30);
		add(tf);

		JLabel lb3 = new JLabel("Password");
		lb3.setBounds(20,160,100,30);
		add(lb3);
		JPasswordField ps = new JPasswordField(20);
		ps.setBounds(130,160,150,30);
		add(ps);

		JButton btn = new JButton("Login");
		btn.setBounds(90,220,90,30);
		add(btn);

		setSize(300,300);
		setVisible(true);
		setTitle("Practical No. 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Practical_1();
		

	}
}
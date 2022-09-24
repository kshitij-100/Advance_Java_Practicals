import javax.swing.*;
import java.awt.*;	

public class Practical_2{

    JFrame f;

 	Practical_2(){
 		f = new JFrame();
 		f.setLayout(new FlowLayout());
 		String arr[] = {"English","Marathi","Hindi","Sanskrit"};
 		JComboBox jcb = new JComboBox(arr);
 		jcb.setBounds(50,50,150,40);
 		f.add(jcb);

 		JTextArea tx = new JTextArea(10,10);
 		JScrollPane jsp = new JScrollPane(tx);
 		f.add(jsp);

		f.setSize(300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	}

 	public static void main(String[] args) {
 		Practical_2 pr2 = new Practical_2();
 	}

	
}
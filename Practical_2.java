import javax.swing.*;
import java.awt.*;	

public class Practical_2{

    JFrame f;

 	Practical_2(){
 		f = new JFrame();
 		f.setLayout(null);
 		
 		String arr[] = {"English","Marathi","Hindi","Sanskrit"};
 		JComboBox jcb = new JComboBox(arr);
 		jcb.setBounds(50,50,100,20);
 		f.add(jcb);

 		JScrollPane js = new JScrollPane();
 		f.add(js,BorderLayout.CENTER);
 		
		f.setSize(250,150);
		f.setVisible(true);
 	}

 	public static void main(String[] args) {
 		Practical_2 pr2 = new Practical_2();
 	}

	
}
import javax.swing.*;
import java.awt.*;	

public class Practical_2{

    JFrame f;

 	Practical_2(){
 		f = new JFrame();
 		f.setLayout(new BorderLayout());
 		String arr[] = {"English","Marathi","Hindi","Sanskrit"};
 		JComboBox jcb = new JComboBox(arr);
 		jcb.setBounds(50,50,150,40);
 		f.add(jcb);

		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(10,10));
 		int b=0;
 		for (int i=0;i<10 ;i++ ) {
 			for (int j=0;j<10 ;j++ ) {
 				jp.add(new JButton("Button "+b));
 				b++;
 			}
 			
 		}
 		JScrollPane jsp = new JScrollPane(jp);
 		f.add(jsp);

		f.setSize(300,200);
		f.setVisible(true);
 	}

 	public static void main(String[] args) {
 		Practical_2 pr2 = new Practical_2();
 	}

	
}
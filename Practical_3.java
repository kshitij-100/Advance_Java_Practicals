import javax.swing.*;
import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;


public class Practical_3 {

	JFrame f;
	JTree jt;

	Practical_3() {

		f= new JFrame();
        f.setLayout(new BorderLayout());
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
		
		DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
		top.add(a);
		DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
		top.add(b);

		DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
		a.add(a1);
 		DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
		a.add(a2);
		DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("A2");
		a.add(a3);
		DefaultMutableTreeNode a4 = new DefaultMutableTreeNode("A2");
		a.add(a4);

		DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
		b.add(b1);
 		DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
		b.add(b2);
		DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
		b.add(b3);

		jt = new JTree(top);
		JScrollPane js = new JScrollPane(jt);
		f.add(js,BorderLayout.CENTER);

		f.setSize(200,200);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Practical_3 pr = new Practical_3();
	}
}
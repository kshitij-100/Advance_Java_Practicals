import javax.swing.*;
import java.awt.*;

public class Practical_4{

	JFrame jf;
	Practical_4(){
		jf = new JFrame();
		// jf.setLayout(null);

		String row[][] = {{"20CM018","Kshitij","18"},
						  {"20CM050","Omkar","18"},
						  {"20CM041","Devesh","18"},
						  {"20CM001","Abhay","18"},
						  {"20CM002","Chetan","18"}
						 };
		String column[] = {"ID Code","Name","Age"};
		
		JTable tbl = new JTable(row,column);
		tbl.setBounds(30,40,200,300); 
		JScrollPane jsp = new JScrollPane(tbl);	
		jf.add(jsp);

		jf.setSize(300,400);
		jf.setVisible(true);			 
	}
	public static void main(String[] args) {
		new Practical_4();
	}
}
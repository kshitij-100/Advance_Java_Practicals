import java.awt.Color;

import javax.swing.*;

class Practical_5 extends JFrame
{
    JProgressBar jp;
    int i =0 , num=0;
    public Practical_5(){
        setLayout(null);

        jp = new JProgressBar(0,2000);
        jp.setBounds(50, 50, 250, 30);
        jp.setString("Practical 5...");
        jp.setForeground(Color.MAGENTA);
        jp.setStringPainted(true);
        add(jp);

        setSize(400,400);
        setTitle("Practical No. 5");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void iterate(){
        while (i<=2000) {
            jp.setValue(i);
            i=i+100;
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }
    }
    public static void main(String[] args)
    {
        Practical_5 p = new Practical_5();
        p.iterate();
    }
}
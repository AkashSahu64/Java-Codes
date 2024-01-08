import java.awt.*;
import java.awt.event.*;
public class AwtB implements ActionListener
{
    Frame f;
    Label lb;
    Button b1,b2;
    TextField tf;
    Font font;
    AwtB()
    {
        font = new Font("Courier",Font.BOLD,40);
        f=new Frame("MyFrame");
        b1= new Button("click");
        b2= new Button("Exit");
        tf= new TextField(60);
        lb = new Label("DD");
        f.add(tf);
        f.add(b1);
        f.add(b2);
        f.add(lb);
        f.setLayout(null);


        tf.setBounds(30,100,300,70);
        lb.setBounds(30,170,300,70);
        b1.setBounds(30,250,70,50);
        b2.setBounds(30,290,70,50);

        tf.setFont(font);
        lb.setFont(font);

        tf.setBackground(Color.green);
        lb.setBackground(Color.blue);
        lb.setForeground(Color.white);
        b1.setBackground(Color.cyan);
        b2.setBackground(Color.red);

        f.setSize(500,500);
        f.setBackground(Color.yellow);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str= ae.getActionCommand();
        if (str.equals("Exit"))
            f.dispose();
        else
        {
            lb.setText(tf.getText());
            System.out.println(tf.getText());

        }
    }
    public static void main(String s[])
    {
        AwtB obj = new AwtB();
    }
}
import java.awt.*;
import java.awt.event.*;
public class EventHandling extends Frame implements ActionListener {
    TextField tf = new TextField();
    EventHandling(){
//        TextField tf = new TextField();
        tf.setBounds(80,60,180,90);
        Button b = new Button("Click Hear");
        b.setBounds(200,200,90,40);
        b.addActionListener(this);
        add(b);
        add(tf);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public  void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        new EventHandling();
    }
}

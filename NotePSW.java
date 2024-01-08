import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public class NotePSW extends Frame implements ActionListener {
    JFrame fr;
    JTextArea ta;
    Font fo;
    NotePSW(){
        fr = new JFrame("Notepad");
        ta = new JTextArea();
        fr.add(ta);
        fo = new Font("Century",Font.BOLD,30);
        ta.setFont(fo);
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenuItem mi = new JMenuItem("New Tab");
        JMenuItem m2 = new JMenuItem("Open");
        JMenuItem m3 = new JMenuItem("Save");
        JMenuItem m4 = new JMenuItem("Exit");
        m1.add(mi); m1.add(m2); m1.add(m3); m1.add(m4); mb.add(m1);
        mi.addActionListener(this);
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        JMenu m5 = new JMenu("Edit");
        JMenuItem m6 = new JMenuItem("Cut");
        JMenuItem m7 = new JMenuItem("Copy");
        JMenuItem m8 = new JMenuItem("Past");
        JMenuItem m9 = new JMenuItem("Date");
        JMenuItem m10 = new JMenuItem("Time");
        JMenu m20 = new JMenu("Format");
        JMenuItem m11 = new JMenuItem("Font Size");
        JMenuItem m12 = new JMenuItem("Font Color");
        JMenuItem mi2 = new JMenuItem("Size");
        for (int size = 10; size <= 24; size += 2) {
            JMenuItem mi3 = new JMenuItem(String.valueOf(size));
            mi3.addActionListener(new FontSizeActionListener(size));
            mi2.add(mi3);
        }
//        m11.add(mi2);
        m5.add(m6); m5.add(m7); m5.add(m8); m5.add(m9); m5.add(m10); m20.add(m11); m20.add(m12); mb.add(m5);
        mb.add(m20);
//        m11.setJMenuBar(mb);
        JScrollPane sp = new JScrollPane(ta);
        mi2.add(sp);
        mi2.addActionListener(this);
        m10.addActionListener(this);
        m9.addActionListener(this);
        m11.addActionListener(this);
        m12.addActionListener(this);
        JMenu m13 = new JMenu("View");
        JMenuItem m15 = new JMenuItem("Zoom In");
        JMenuItem m16 = new JMenuItem("Zoom Out");
        JMenuItem m17 = new JMenuItem("Theme");
        JMenuItem mi1 = new JMenuItem("BackGround");
        m13.add(m15); m13.add(m16); m13.add(m17); mb.add(m13); m13.add(mi1);
        mi1.addActionListener(this);
        JMenu m14 = new JMenu("Help");
        JMenuItem m18 = new JMenuItem("File Choose");
        JMenuItem m19 = new JMenuItem("Key");
        m14.add(m18); m14.add(m19); mb.add(m14);
        fr.setJMenuBar(mb);
        fr.setSize(900,600);
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String st = e.getActionCommand();
        if (st.equals("New Tab")) {
            ta.setText("");
        }
        else if (st.equals("Exit")) {
            fr.dispose();
        }
        else if (st.equals("Save")) {
                JFileChooser fc = new JFileChooser();
                int result = fc.showSaveDialog(this);
                if (result == JFileChooser.APPROVE_OPTION){
                    File fl = fc.getSelectedFile();
                    try (PrintWriter writer = new PrintWriter(fl)) {
                        writer.write(ta.getText());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
        }
        else if (st.equals("Open")) {
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                File fl = fc.getSelectedFile();

                try (BufferedReader br = new BufferedReader(new FileReader(fl))) {
                    StringBuilder sb = new StringBuilder();
                    String s;
                    while ((s = br.readLine()) != null) {
                        sb.append(s).append("\n");
                    }
                    ta.setText(sb.toString());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        else if(st.equals("Time")){
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String s = sdf.format(new Date());
            ta.append(s+"\n");
        }
        else if(st.equals("Date")){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String s = sdf.format(new Date());
            ta.append(s+"\n");
        }
        else if(st.equals("Font Color")){
            Color c = JColorChooser.showDialog(this,"Choose Font Color", Color.BLACK);
            ta.setForeground(c);
        }
        else if(st.equals("BackGround")){
            Color c = new JColorChooser().showDialog(this,"Back Ground Color", Color.WHITE);
            ta.setBackground(c);
        }
//        else if (st.equals("Font Size")) {
//            String input = JOptionPane.showInputDialog(this, "Enter font size:");
//            if (input != null && !input.isEmpty()) {
//                int fontSize = Integer.parseInt(input);
//                Font currentFont = ta.getFont();
//                Font newFont = currentFont.deriveFont((float) fontSize);
//                ta.setFont(newFont);
//            }
//        }
    }
    class FontSizeActionListener implements ActionListener {
        int fs;
        public FontSizeActionListener(int fontSize) {
            this.fs = fontSize;
        }
        public void actionPerformed(ActionEvent e) {
            Font currentFont = ta.getFont();
            Font newFont = currentFont.deriveFont((float) fs);
            ta.setFont(newFont);
        }
    }
    public static void main(String[] args){
                new NotePSW();
    }
}
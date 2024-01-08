import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class NotepadAppWithFontSizeInMenu extends JFrame {
    private JTextArea textArea;
    private JMenuBar menuBar;
    private JMenu formatMenu;
    public NotepadAppWithFontSizeInMenu() {
        setTitle("Notepad App");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 16)); // Default font and size
        menuBar = new JMenuBar();
        formatMenu = new JMenu("Format");
        JMenu fontSizeSubMenu = new JMenu("Font Size");
        for (int size = 10; size <= 24; size += 2) {
            JMenuItem fontSizeItem = new JMenuItem(String.valueOf(size));
            fontSizeItem.addActionListener(new FontSizeActionListener(size));
            fontSizeSubMenu.add(fontSizeItem);
        }
        formatMenu.add(fontSizeSubMenu);
        menuBar.add(formatMenu);
        setJMenuBar(menuBar);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        setVisible(true);
    }
    private class FontSizeActionListener implements ActionListener {
        private int fontSize;

        public FontSizeActionListener(int fontSize) {
            this.fontSize = fontSize;
        }
        public void actionPerformed(ActionEvent e) {
            Font currentFont = textArea.getFont();
            Font newFont = currentFont.deriveFont((float) fontSize);
            textArea.setFont(newFont);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new NotepadAppWithFontSizeInMenu();
        });
    }
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Exit")) {
            dispose();
        }
    }
}

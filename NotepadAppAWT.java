import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NotepadAppAWT extends JFrame {
    private JTabbedPane tabbedPane;
    private JTextArea textArea;

    public NotepadAppAWT() {
        setTitle("Notepad App");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane = new JTabbedPane();
        textArea = new JTextArea();

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newTabItem = new JMenuItem("New Tab");
        JMenuItem settingsItem = new JMenuItem("Settings");

        newTabItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea = new JTextArea(); // Create a new text area for each tab
                JScrollPane scrollPane = new JScrollPane(textArea);
                tabbedPane.addTab("Untitled", scrollPane);
            }
        });

        settingsItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement your settings functionality here
                JOptionPane.showMessageDialog(NotepadAppAWT.this, "Settings dialog would open here.");
            }
        });

        fileMenu.add(newTabItem);
        fileMenu.add(settingsItem);
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        JScrollPane scrollPane = new JScrollPane(textArea);
        tabbedPane.addTab("Untitled", scrollPane);

        add(tabbedPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new NotepadAppAWT();
        });
    }
}

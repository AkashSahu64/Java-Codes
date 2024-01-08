import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;
import javax.swing.UIManager.LookAndFeelInfo;

public class NotepadApp extends Frame {
    private TextArea textArea;
    private int fontSize = 12;
    public NotepadApp() {
        setTitle("Notepad");
        setSize(800, 600);
        textArea = new TextArea();
        add(textArea);
        createMenus();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }
    private void createMenus() {
        MenuBar menubar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem newTabItem = new MenuItem("New Tab");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");
        MenuItem themeItem = new MenuItem("Theme");

        newTabItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(NotepadApp.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();

                    try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                        StringBuilder content = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            content.append(line).append("\n");
                        }
                        textArea.setText(content.toString());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showSaveDialog(NotepadApp.this);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();

                    try (PrintWriter writer = new PrintWriter(selectedFile)) {
                        writer.write(textArea.getText());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });
        fileMenu.add(newTabItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        Menu editMenu = new Menu("Edit");
        MenuItem timeItem = new MenuItem("Time");
        MenuItem dateItem = new MenuItem("Date");
        timeItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                textArea.append(currentTime + "\n");
            }
        });
        dateItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String currentDate = sdf.format(new Date());
                textArea.append(currentDate + "\n");
            }
        });
        MenuItem fontColorItem = new MenuItem("Font Color");
        MenuItem bgColorItem = new MenuItem("Background Color");
        fontColorItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(NotepadApp.this, "Choose Font Color", Color.BLACK);
                textArea.setForeground(color);
            }
        });
        bgColorItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(NotepadApp.this, "Choose Background Color", Color.WHITE);
                textArea.setBackground(color);
            }
        });
        themeItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UIManager.LookAndFeelInfo[] lookAndFeels = UIManager.getInstalledLookAndFeels();

                String[] themeNames = new String[lookAndFeels.length];
                for (int i = 0; i < lookAndFeels.length; i++) {
                    themeNames[i] = lookAndFeels[i].getName();
                }
                String selectedTheme = (String) JOptionPane.showInputDialog(
                        NotepadApp.this,
                        "Select a theme:",
                        "Theme Selection",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        themeNames,
                        themeNames[0]);
                if (selectedTheme != null) {
                    for (LookAndFeelInfo info : lookAndFeels) {
                        if (selectedTheme.equals(info.getName())) {
                            try {
                                UIManager.setLookAndFeel(info.getClassName());
                                SwingUtilities.updateComponentTreeUI(NotepadApp.this);
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                            break;
                        }
                    }
                }
            }
        });
        editMenu.add(timeItem);
        editMenu.add(dateItem);
        editMenu.add(fontColorItem);
        editMenu.add(bgColorItem);
        editMenu.add(themeItem);
        Menu viewMenu = new Menu("View");
        MenuItem zoomInItem = new MenuItem("Zoom In");
        MenuItem zoomOutItem = new MenuItem("Zoom Out");
        zoomInItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fontSize += 2;
                updateTextAreaFont();
            }
        });
        zoomOutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (fontSize > 2) {
                    fontSize -= 2;
                    updateTextAreaFont();
                }
            }
        });
        viewMenu.add(zoomInItem);
        viewMenu.add(zoomOutItem);
        menubar.add(fileMenu);
        menubar.add(editMenu);
        menubar.add(viewMenu);
        setMenuBar(menubar);
    }
    private void updateTextAreaFont() {
        Font currentFont = textArea.getFont();
        Font newFont = currentFont.deriveFont((float) fontSize);
        textArea.setFont(newFont);
    }
    public static void main(String[] args) {
            NotepadApp app = new NotepadApp();
            app.setVisible(true);
    }
}
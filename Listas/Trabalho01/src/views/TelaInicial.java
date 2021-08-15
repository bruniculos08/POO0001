package views;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TelaInicial extends JFrame {
    private JTextArea text;


    public TelaInicial() {
        super("Main Menu");
        startItems();
        setSettings();
    }


    private void startItems() {
    }
    
    private void setSettings() {
        setSize(500,500);
        setLayout(new BorderLayout());
        setTextArea();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setTextArea(){
        JTextArea textArea = new JTextArea("This is a text area: ");
        textArea.setCaretPosition(textArea.getDocument().getLength());
        textArea.setRows(20);
        textArea.setColumns(50);
        textArea.setEditable(true);
        getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);
        //JScrollPane scrollPane = new JScrollPane(textArea);
        //scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //scrollPane.setPreferredSize(new Dimension(250, 250));
        add(textArea);
    }
}
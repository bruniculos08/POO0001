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
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setTextArea(){
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }



}

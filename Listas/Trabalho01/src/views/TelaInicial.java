package views;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TelaInicial extends JFrame implements ActionListener{
    private JTextArea text;
    private JFrame textfield;
    private JLabel label;
    private JPanel panel;
    private JButton submit;
    private String movieName;   

    public TelaInicial() {
        super("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSettings();
    }

    private void setSettings() {
        label = new JLabel();
        submit = new JButton("submit");
        submit.addActionListener(this);
        text = new JTextArea(1, 10);
        panel = new JPanel();
        setTextArea();
    }

    private void setTextArea(){
        text.setMaximumSize(new Dimension(1, 10));
        text.setLineWrap(true);
        //text.addKeyListener(new MKeyListener());
        layout.addComponent(enter);
        enter.setClickShortcut(KeyCode.ENTER);

        panel.add(text);
        panel.add(submit);
        panel.add(label);
        add(panel);

        setSize(500,500);
        show();
    }
}
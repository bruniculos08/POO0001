package views;
import model.OMDBHelper;
import presenter.RecebedorDeNome;
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
        setSettings();
    }

    private void setSettings() {
        label = new JLabel();
        submit = new JButton("submit");
        submit.addActionListener(this);
        text = new JTextArea(1, 10);
        panel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTextArea();
    }

    private void setTextArea(){
        setTextListener();
        addTodosOsItens();
        setSize(500,500);
        show();
    }

    public void addTodosOsItens(){
        panel.add(text);
        panel.add(submit);
        panel.add(label);
        add(panel);
    }

    public void setTextListener(){
        text.setMaximumSize(new Dimension(1, 10));
        text.setLineWrap(true);
        text.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent event) {
                    if (event.getKeyCode() == KeyEvent.VK_ENTER){
                        text.setEditable(false);
                        submit.doClick();
                    }
                    else {
                        text.setEditable(true);
                    }
                }
            });
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == submit) {
            enviarParaPesquisa();
            limparAreaDeTexto();
            trocarTela();
        }
    }
    
    public void trocarTela(){
        TelaExibir telaExibir = new TelaExibir();
        dispose();
    }

    public void limparAreaDeTexto(){
        label.setText("submited");
        text.setText(null);
    }

    public void enviarParaPesquisa(){
        String name = text.getText();
        //System.out.println(name);
        RecebedorDeNome envia = new RecebedorDeNome(name);
    }
}
package views;
import model.OMDBHelper;
import presenter.RecebedorDeDados;
import presenter.RecebedorDeNome;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class TelaExibir extends JFrame implements ActionListener{
    private JTextArea text;
    private JFrame textfield;
    private JLabel label;
    private JLabel picLabel;
    private JPanel panel;
    private JButton voltar;
    private String movieName;
    private ViewListener1 viewListener;
    
    public TelaExibir() {
        super("Exibition Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSettings();
    }

    private void setSettings() {
        label = new JLabel();
        voltar = new JButton("Other Movie");
        voltar.addActionListener(this);
        text = new JTextArea(1, 10);
        panel = new JPanel();
        setArea();
    }

    private void setArea(){
        panel.add(voltar);
        panel.add(label);
        add(panel);
        setSize(500,500);
        show();
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == voltar) {
            TelaInicial janela = new TelaInicial();
            dispose();
        }
    }

    public void setViewListener(RecebedorDeDados recebedorDeDados) {
        viewListener = new ViewListener1(recebedorDeDados);
    }

    public void RecarregarSemPoster(String dados) {
        System.out.println("RecarregarSemPoster\n");
        text.setText(dados);
        panel.add(text);
    }

    public void RecarrregarComPoster(String dados, Image poster) {
        System.out.println("RecarregarComPoster\n");
        picLabel = new JLabel(new ImageIcon(poster));
        panel.add(picLabel);
        text.setText(dados);
        panel.add(text);
    }
}

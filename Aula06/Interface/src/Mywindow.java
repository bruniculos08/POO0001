import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionEvent;
import javax.swing.Action;
//import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Mywindow extends JFrame implements ActionListener{ //^ implementar uma interface, pois esta não tem código, o código tem que ser escrito antes da implementação
    JLabel label = new JLabel("This is a label"); //^ Objeto Label (uma região com um texto ou algo do tipo)
    JButton button1 = new JButton("Okay");        //^ Objeto Button (botão escrito "Okay")
    JButton button2 = new JButton("Hey");

    public Mywindow(){
        super("The title of my window is it this");
        startComponents();                              //^ método para criar os componentes da janela
        //setSize(1100, 1100);                          //^ Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //^ A janela fecha ao encerrar o código
        setVisible(true);
    }
    
    private void startComponents(){
      //JLabel label = new JLabel("This is a label"); //^ Objeto Label (uma região com um texto ou algo do tipo)
      //JButton button = new JButton("Okay");         //^ Objeto Button (botão escrito "Okay")
        button1.setBackground(Color.WHITE);           //^ Altera a cor de fundo do botão para azul
        button2.setBackground(Color.WHITE);

        //button1.actionPerformed("Okay");
        //button2.actionPerformed("Hey");

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); //^ Organiza o layout sobre o eixo Y (fila vertical)
        add(label);//, BorderLayout.NORTH);                           //^ Coloca o botão no norte do Layout Border se este for o Layout
        add(button1);//, BorderLayout.SOUTH);                         //^ Coloca o botão no sul do Layout Border se este for o Layout
        add(button2);//, BorderLayout.SOUTH); 

        //& Listeners ("Observadores")
        button1.addActionListener(this);
        button2.addActionListener(this);

        //button1.actionPerformed("Okay"); //^Parte que não funcionau
        //button2.actionPerformed("Hey");
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button1) {
            System.out.println("Button1 was pressed!");
        }
        if (e.getSource() == button2) {
            System.out.println("Hello");
        }
    }

}
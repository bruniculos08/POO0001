import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Janela extends JFrame implements ActionListener{
    JLabel label = new JLabel("This is a label");      //^ Objeto Label (uma região com um texto ou algo do tipo)
    JButton button1 = new JButton("Okay");             //^ Objeto Button (botão escrito "Okay")
    JButton button2 = new JButton("Hey");              //^ Objeto Button (botão escrito "Hey")

    public Mywindow(){
        super("The title of my window is it this");
        startComponents();                              //^ Método para criar/iniciar os componentes da janela
        setSize(1100, 1100);                            //^ Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //^ A janela fecha ao encerrar o código
        setVisible(true);
    }

    private void startComponents(){
        //JLabel label = new JLabel("This is a label"); //^ Objeto Label (uma região com um texto ou algo do tipo)
        //JButton button = new JButton("Okay");         //^ Objeto Button (botão escrito "Okay")
          button1.setBackground(Color.WHITE);           //^ Altera a cor de fundo do botão para azul
          button2.setBackground(Color.WHITE);           //^ Altera a cor de fundo do botão para branco
  
          button1.actionPerformed("Okay");
          button2.actionPerformed("Hey");
  
          setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); 
          //^ Organiza o layout sobre o eixo Y (fila vertical)
          
          
          add(label);//, BorderLayout.NORTH);   //^ Adiciona o item a janela  //? Parte comentada: Coloca o label no norte do Layout Border se este for o Layout
          add(button1);//, BorderLayout.SOUTH); //^ Adiciona o item a janela  //? Parte comentada: Coloca o botão no sul do Layout Border se este for o Layout
          add(button2);//, BorderLayout.SOUTH); //^ Adiciona o item a janela  //? Parte comentada: Coloca o botão no sul do Layout Border se este for o Layout
  
          //& Listeners ("Observadores")
          button1.addActionListener(this);      //^ Adiciona um "ouvidor" ao botão (o torna sensivel à ações, chamando então o método actionPerformed)
                                                //^ Se este botão for clicado, este evento será enviado ao actionLister this(o próprio botão é um actionListener nesse caso)
                                                
        }
  
      public void actionPerformed(ActionEvent e){
        if (e == button1) {
            System.out.println("Button was pressed!");
        }
        if (e == button2) {
            System.out.println("Hello");
        }
    }

}

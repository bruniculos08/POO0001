import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Janela extends JFrame implements ActionListener{
    JButton button1 = new JButton("Button 1");              //^ Objeto Button (botão escrito "Okay")
    JButton button2 = new JButton("Button 2");              //^ Objeto Button (botão escrito "Hey")

    public Janela(){
        super("Title");
        startComponents();                              //^ Método para criar/iniciar os componentes da janela
        setSize(1100, 1100);                            //^ Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //^ A janela fecha ao encerrar o código
        setVisible(true);
    }

    private void startComponents(){

          button1.setBackground(Color.WHITE);           //^ Altera a cor de fundo do botão para azul
          button2.setBackground(Color.WHITE);           //^ Altera a cor de fundo do botão para branco
  
          setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); 
          //^ Organiza o layout sobre o eixo Y (fila vertical)
          
          add(button1);//, BorderLayout.SOUTH); //^ Adiciona o item a janela  //? Parte comentada: Coloca o botão no sul do Layout Border se este for o Layout
          add(button2);//, BorderLayout.SOUTH); //^ Adiciona o item a janela  //? Parte comentada: Coloca o botão no sul do Layout Border se este for o Layout
  
        }
}

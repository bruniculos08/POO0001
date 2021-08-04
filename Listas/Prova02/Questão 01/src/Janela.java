import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Janela extends JFrame implements ActionListener{
    JButton button1 = new JButton("Botao 1");              //^ Objeto Button (botão escrito "Okay")
    JButton button2 = new JButton("Botao 2");              //^ Objeto Button (botão escrito "Hey")

    public Janela(){
        super("Janela");
        startComponents();                              //^ Método para criar/iniciar os componentes da janela
        setSize(100, 100);                              //^ Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //^ A janela fecha ao encerrar o código
        setVisible(true);
    }

    private void startComponents(){

          button1.setBackground(Color.WHITE);          
          button2.setBackground(Color.WHITE);           

          setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); 

          add(button1);
          add(button2);
  
        }

        public void actionPerformed(ActionEvent e){
            
        } 
}
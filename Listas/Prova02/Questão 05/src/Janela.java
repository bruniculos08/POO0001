import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Janela extends JFrame implements ActionListener{
    JButton button1 = new JButton("Button 1");                  
    JButton button2 = new JButton("Button 2");     
    Contador valores = new Contador();             

    public Janela(){
        super("Janela");
        startComponents();                                      //^ Método para criar/iniciar os componentes da janela
        setSize(100, 100);                                      //^ Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         //^ A janela fecha ao encerrar o código
        setVisible(true);
    }

    private void startComponents(){

          button1.setBackground(Color.WHITE);           
          button2.setBackground(Color.WHITE);           
  
          setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); 
          
          add(button1);
          add(button2);
  
          button1.addActionListener(this);      
          button2.addActionListener(this);      
        
        }
  
      public void actionPerformed(ActionEvent e){
        if (e.getSource() == button1) {
            valores.incremetarValor();
            //System.out.println("incrementando");
        }
        if (e.getSource() == button2) {
            valores.decrementarValor();
            //System.out.println("decrementando");
        }
    }

}

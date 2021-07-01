import javax.swing.*;
import java.awt.*;

public class Mywindow extends JFrame{
    public Mywindow(){
        super("the title of my window is it this");
        startComponents();                              //^ método para criar os componentes da janela
        //setSize(1100, 1100);                          //^ Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //^ A janela fecha ao encerrar o código
        setVisible(true);
    }
    
    private void startComponents(){
        JLabel label = new JLabel("This is a label"); //^ Objeto Label (uma região com um texto ou algo do tipo)
        JButton button = new JButton("Okay");         //^ Objeto Button (botão escrito "Okay")
        button.setBackground(Color.BLUE);             //^ Altera a cor de fundo do botão para azul

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); //^ Organiza o layout sobre o eixo Y (fila vertical)
        add(label, BorderLayout.NORTH);                               //^ Coloca o botão no norte do Layout Border se este for o Layout
        add(button, BorderLayout.SOUTH);                              //^ Coloca o botão no sul do Layout Border se este for o Layout
    }
}

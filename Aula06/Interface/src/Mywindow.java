import javax.swing.*;
import java.awt.*;

public class Mywindow extends JFrame{
    public Mywindow(){
        super("the title of my window is it this");
        startComponents();
        //setSize(1100, 1100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void startComponents(){
        JLabel label = new JLabel("This is a label");
        JButton button = new JButton("Okay");
        button.setBackground(Color.BLUE);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(label, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
    }
}

package views;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent event) {
            if (event.getKeyCode() == KeyEvent.VK_ENTER) {
                System.out.println("Enter pressed");
            }
        }       
}
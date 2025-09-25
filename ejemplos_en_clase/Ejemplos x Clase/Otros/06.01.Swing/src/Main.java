import javax.swing.*;
import java.awt.event.*;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana con eventos");
        JPanel panel = new JPanel();
        JButton button = new JButton("Haz clic");
        JLabel  label = new JLabel("no presionaste nada");
        panel.add(label);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // System.out.println("Botón presionado");
                JLabel  label2 = new JLabel("HICISTE CLICK");
                panel.add(label2);
                frame.setVisible(true);

            }
        });
        panel.add(button);
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


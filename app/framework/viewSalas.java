package framework;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JScrollPane;
import src.*;


public class viewSalas extends JFrame {
    public static void main (String []args){
        new viewSalas();
    }
    public viewSalas() {
        setTitle("Salas da FGA");
        setSize(800, 600);
        JPanel mainPanel = new JPanel(new GridBagLayout());
        add(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel title = new JLabel("Salas FGA");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setHorizontalAlignment(JLabel.CENTER);


    }

}

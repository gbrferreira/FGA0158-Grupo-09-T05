package framework;

import javax.swing.*;
import java.awt.*;

public class viewSalas extends JDialog {
    private JList list1;
    private JPanel salasPainel;

    public viewSalas(JFrame parent) {
        super (parent);
        setTitle("Salas disponíveis FGA");
        setContentPane(salasPainel);
        setMinimumSize(new Dimension(800,600));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    public static void main(String[] args) {
        viewSalas salas = new viewSalas(null);

    }
}

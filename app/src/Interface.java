package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface extends JFrame {
    public Interface() {
    setTitle("Reserva de salas FGA");
    setSize(1200, 720);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    JPanel mainPanel = new JPanel(new BorderLayout());
    add(mainPanel);

    JLabel title = new JLabel("Portal do Aluno");
    title.setFont(new Font("Arial", Font.BOLD, 40));
    title.setHorizontalAlignment(JLabel.CENTER);
    mainPanel.add(title, BorderLayout.PAGE_START);

    JPanel buttonPanel = new JPanel(new GridBagLayout());
    mainPanel.add(buttonPanel, BorderLayout.CENTER);

    JButton registerButton = new JButton("Cadastro");
    registerButton.setPreferredSize(new Dimension(500, 100));
    registerButton.setFont(new Font("Arial", Font.BOLD, 40));

    // quando clica em "cadastro"
    registerButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame form = new JFrame();
        form.setTitle("Cadastro");
        form.setSize(500, 300);
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel formPanel = new JPanel();
        form.add(formPanel);

        JLabel emailLabel = new JLabel("Email: ");
        JTextField emailField = new JTextField();
        JLabel passwordLabel = new JLabel("Senha: ");
        JTextField passwordField = new JTextField();
        JLabel enrollmentLabel = new JLabel("Matrícula: ");
        JTextField enrollmentField = new JTextField();
        JLabel nameLabel = new JLabel("Nome: ");
        JTextField nameField = new JTextField();

        JButton sendButton = new JButton("Enviar");
        formPanel.add(sendButton);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form.dispose();
            }
        }
    );
        
        
        sendButton.setBounds(500, 300, 300, 100);
       
        GridLayout layout = new GridLayout(6, 2);
        formPanel.setLayout(layout);
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        formPanel.add(passwordLabel);
        formPanel.add(passwordField);
        formPanel.add(enrollmentLabel);
        formPanel.add(enrollmentField);
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(new JLabel());
        formPanel.add(sendButton); 
        
        form.setVisible(true);
    }
}
);
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);
    buttonPanel.add(registerButton, gbc);
    setVisible(true);
    }
}
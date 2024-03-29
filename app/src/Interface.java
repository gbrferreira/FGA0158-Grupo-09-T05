package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface extends JFrame {
    
    public Interface() {
        setTitle("Reserva de salas FGA");
        setSize(800, 600);
        JPanel mainPanel = new JPanel(new GridBagLayout());
        add(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // estilização nimbus
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        
        JLabel title = new JLabel("Reserva de salas FGA");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setHorizontalAlignment(JLabel.CENTER);
        
        //botão de cadastro, login, nova reserva
        JPanel btnPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JButton btnCadastro = new JButton("cadastro");
        btnCadastro.setPreferredSize(new Dimension(400, 80));
        btnCadastro.setFont(new Font("Arial", Font.BOLD, 40));
        gbc.gridy = 1;
        btnPanel.add(btnCadastro, gbc);

        JButton btnLogin = new JButton("Login");
        btnLogin.setPreferredSize(new Dimension(400, 80));
        btnLogin.setFont(new Font("Arial", Font.BOLD, 40));
        gbc.gridy = 2;
        btnPanel.add(btnLogin, gbc);

        JButton btnReserva = new JButton("Nova reserva");
        btnReserva.setPreferredSize(new Dimension(400, 80));
        btnReserva.setFont(new Font("Arial", Font.BOLD, 40));
        gbc.gridy = 3;
        btnPanel.add(btnReserva, gbc);

        add(btnPanel);
        setVisible(true);

        // quando clica em "cadastro"
        btnCadastro.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame cadastro = new JFrame();
            cadastro.setTitle("Cadastro");
            cadastro.setSize(500, 300);
            cadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
            JPanel cadastroPanel = new JPanel();
            cadastro.add(cadastroPanel);
    
            JLabel emailLabel = new JLabel("Email: ");
            JTextField emailField = new JTextField();
            JLabel passwordLabel = new JLabel("Senha: ");
            JPasswordField passwordField = new JPasswordField();
            JLabel enrollmentLabel = new JLabel("Matrícula: ");
            JTextField enrollmentField = new JTextField();
            JLabel nameLabel = new JLabel("Nome: ");
            JTextField nameField = new JTextField();
    
            JButton sendButton = new JButton("Enviar");
            cadastroPanel.add(sendButton);
    
            //quando clica em "enviar"
            sendButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String email, password, enrollment, name;
    
                    email = emailField.getText();
                    password = passwordField.getText();
                    enrollment = enrollmentField.getText();
                    name = nameField.getText();
    
                    System.out.println("Email: " + email);
                    System.out.println("Senha: " + password);
                    System.out.println("Matrícula: " + enrollment);
                    System.out.println("Nome: " + name);
    
                    cadastro.dispose();
                    sendButton.setBounds(500, 300, 300, 100);
                }
            });
    
        // interface formulário de cadastro
        GridLayout layout = new GridLayout(6, 2);
    
        cadastroPanel.setLayout(layout);
        cadastroPanel.add(emailLabel);
        cadastroPanel.add(emailField);
        cadastroPanel.add(passwordLabel);
        cadastroPanel.add(passwordField);
        cadastroPanel.add(enrollmentLabel);
        cadastroPanel.add(enrollmentField);
        cadastroPanel.add(nameLabel);
        cadastroPanel.add(nameField);
        cadastroPanel.add(new JLabel());
        cadastroPanel.add(sendButton); 
        cadastro.setVisible(true);
    }
});   
        //quando clica em "login"
        btnLogin.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            JFrame login = new JFrame();
            login.setTitle("Login");
            login.setSize(500, 300);
            login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JPanel loginPanel = new JPanel();
            login.add(loginPanel);

            JLabel emailLabel = new JLabel("Email: ");
            JTextField emailField = new JTextField();
            JLabel passwordLabel = new JLabel("Senha: ");
            JPasswordField passwordField = new JPasswordField();

            GridLayout layout = new GridLayout(6, 2);
            loginPanel.setLayout(layout);
            loginPanel.add(emailLabel);
            loginPanel.add(emailField);
            loginPanel.add(passwordLabel);
            loginPanel.add(passwordField);
            login.setVisible(true);

            JButton sendButton = new JButton("Enviar");
            loginPanel.add(sendButton);
    
            //quando clica em "enviar"
            sendButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String email, password;
    
                    email = emailField.getText();
                    password = passwordField.getText();
    
                    System.out.println("Email: " + email);
                    System.out.println("Senha: " + password);
    
                    login.dispose();
                    sendButton.setBounds(500, 300, 300, 100);
                }
            });

        }
    });             ////// PARTE NOVA E COM POSSÌVEIS ERROS !!!!!!!!!!!!!!!!!!

        // quando clica em "reservar sala'" 
        btnReserva.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            JFrame reserva = new JFrame();
            reserva.setTitle("Reservar uma sala");
            reserva.setSize(800, 800);
            reserva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JPanel reservaPanel = new JPanel();
            reserva.add(reservaPanel);

            JButton sala1 = new JButton("sala1");
            sala1.setPreferredSize(new Dimension(150, 50));
            sala1.setFont(new Font("Arial", Font.BOLD, 20));
            gbc.gridy = 1;
            gbc.gridx = 1;
            reservaPanel.add(sala1, gbc);

            JButton sala2 = new JButton("sala2");
            sala2.setPreferredSize(new Dimension(150, 50));
            sala2.setFont(new Font("Arial", Font.BOLD, 20));
            gbc.gridy = 1;
            gbc.gridx = 2;
            reservaPanel.add(sala2, gbc);

            JButton sala3 = new JButton("sala3");
            sala3.setPreferredSize(new Dimension(150, 50));
            sala3.setFont(new Font("Arial", Font.BOLD, 20));
            gbc.gridy = 1;
            gbc.gridx = 2;
            reservaPanel.add(sala3, gbc);

            JButton sala4 = new JButton("sala4");
            sala4.setPreferredSize(new Dimension(150, 50));
            sala4.setFont(new Font("Arial", Font.BOLD, 20));
            gbc.gridy = 2;
            gbc.gridx = 1;
            reservaPanel.add(sala4, gbc);

            JButton sala5 = new JButton("sala5");
            sala5.setPreferredSize(new Dimension(150, 50));
            sala5.setFont(new Font("Arial", Font.BOLD, 20));
            gbc.gridy = 2;
            gbc.gridx = 2;
            reservaPanel.add(sala5, gbc);

            JButton sala6 = new JButton("sala6");
            sala6.setPreferredSize(new Dimension(150, 50));
            sala6.setFont(new Font("Arial", Font.BOLD, 20));
            gbc.gridy = 2;
            gbc.gridx = 3;
            reservaPanel.add(sala6, gbc);

        

            reserva.add(reservaPanel);
            reserva.pack();
            reserva.setVisible(true);

            
        }
    });



}
}
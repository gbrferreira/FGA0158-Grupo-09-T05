package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginForm extends JDialog {
    private JLabel userIcon;
    private JTextField tfEmail;
    private JPasswordField pfSenha;
    private JButton btnEntrar;
    private JButton btnCancelar;
    private JPanel loginPanel;

    public LoginForm(JFrame parent) {
        super(parent);
        setTitle("Login");
        setContentPane(loginPanel);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = tfEmail.getText();
                String senha = String.valueOf(pfSenha.getPassword());

                usuario = getUsuarioAutenticado(email, senha);

                if (usuario != null) {
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog( LoginForm.this,
                            "Email ou senha inválidas",
                            "Tente novamente",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public Usuario usuario;
    private Usuario getUsuarioAutenticado(String email, String senha) {
        Usuario usuario = null;

        final String DB_URL = "jdbc:mysql://localhost/meubanco/?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, senha);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                usuario = new Usuario();
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setMatricula(Integer.parseInt(resultSet.getString("matricula")));
                usuario.setSenha(resultSet.getString("senha"));
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


        return usuario;
    }

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm(null);
        Usuario usuario = loginForm.usuario;
        if (usuario != null) {
            System.out.println("Autenticação com sucesso de:" + usuario.getNome());
            System.out.println(" Email:" + usuario.getEmail());
            System.out.println(" Matricula:" + usuario.getMatricula());
        }
        else {
            System.out.println("Autenticação cancelada");
        }
    }
}

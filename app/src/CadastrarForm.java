package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class CadastrarForm extends JDialog {
    private JTextField tfNome;
    private JTextField tfMatricula;
    private JTextField tfEmail;
    private JPasswordField pfSenha;
    private JPasswordField pfConfirmarSenha;
    private JButton btnCancelar;
    private JButton btnCadastrar;
    private JPanel cadastrarPainel;

    public CadastrarForm(JFrame parent) {
        super(parent);
        setTitle("Criar uma nova conta");
        setContentPane(cadastrarPainel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarUsuario();
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


    private void cadastrarUsuario() {

        String nome = tfNome.getText();
        String email = tfEmail.getText();
        String matricula = tfMatricula.getText();
        String senha = String.valueOf(pfSenha.getPassword());
        String confirmarSenha = String.valueOf(pfConfirmarSenha.getPassword());

        if(nome.isEmpty() || email.isEmpty() || email.isEmpty() || matricula.isEmpty() || senha.isEmpty() || confirmarSenha.isEmpty()) {
            JOptionPane.showMessageDialog( this,
                    "Por favor preencha todos os campos",
                    "Tente novamente",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(!senha.equals(confirmarSenha)) {
            JOptionPane.showMessageDialog( this,
                    "Senhas não coincidem",
                    "Tente novamente",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        usuario = addUsuarioToDatabase( nome, email, matricula, senha);
        if(usuario != null) {
            dispose();
        }
        else {
            JOptionPane.showMessageDialog( this,
                    "Falha ao criar novo usuário",
                    "Tente novamente",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public Usuario usuario;
    private Usuario addUsuarioToDatabase(String nome, String email, String matricula, String senha) {
        Usuario usuario = null;
        final String DB_URL = "jdbc:mysql://localhost/meubanco/?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO users (nome, email, matricula, senha) " +
                    "VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, matricula);
            preparedStatement.setString(4, senha);

            int addedRows = preparedStatement.executeUpdate();
            if (addedRows > 0) {
                usuario = new Usuario();
                usuario.setNome(nome);
                usuario.setEmail(email);
                usuario.setMatricula(Integer.parseInt(matricula));
                usuario.setSenha(senha);
            }

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuario;
    }


    public static void main(String[] args) {
        CadastrarForm myForm = new CadastrarForm(null);
        Usuario usuario = myForm.usuario;
        if (usuario != null) {
            System.out.println("Cadastrado realizado com sucesso de:" + usuario.getNome());
        }
        else {
            System.out.println("Cadastro cancelado");
        }
    }
}

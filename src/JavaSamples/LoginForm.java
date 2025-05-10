package JavaSamples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener {
    JPanel panel;
    JLabel user_label, password_label, message;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit;

    LoginForm() {
        // Labels e campos
        user_label = new JLabel("User Name :");
        userName_text = new JTextField();

        password_label = new JLabel("Password :");
        password_text = new JPasswordField();

        submit = new JButton("SUBMIT");

        message = new JLabel();

        // Painel com layout
        panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);
        panel.add(password_text);
        panel.add(new JLabel()); // Espaço em branco
        panel.add(message);
        panel.add(new JLabel()); // Espaço em branco
        panel.add(submit);

        submit.addActionListener(this);

        // Configurações da janela
        setTitle("Please Login Here!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel, BorderLayout.CENTER);
        setSize(400, 200);
        setLocationRelativeTo(null); // Centraliza
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String userName = userName_text.getText();
        String password = new String(password_text.getPassword());

        if (userName.trim().equals("admin") && password.trim().equals("admin")) {
            message.setText("Hello " + userName + "!");
        } else {
            message.setText("Invalid user...");
        }
    }
}

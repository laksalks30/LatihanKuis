/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener {
    private JLabel titleLabel, usernameLabel, passwordLabel;
    private JTextField usernameTextField;
    private JPasswordField passTextField;
    private JButton loginButton, resetButton;
    
    public LoginPage() {
        // Set Frame Properties
        setTitle("Login Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        
        // Create Panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Padding
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Spacing

        // Title Label
        titleLabel = new JLabel("LOGIN PAGE");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(titleLabel, gbc);

        // Username Label
        usernameLabel = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(usernameLabel, gbc);

        // Username TextField
        usernameTextField = new JTextField(15);
        gbc.gridx = 1;
        panel.add(usernameTextField, gbc);

        // Password Label
        passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(passwordLabel, gbc);

        // Password Field
        passTextField = new JPasswordField(15);
        gbc.gridx = 1;
        panel.add(passTextField, gbc);
        // Add action listener to the password field to trigger login on Enter key
        passTextField.addActionListener(e -> loginButton.doClick());


        // Login Button
        loginButton = new JButton("Login");
        loginButton.setBackground(new Color(30, 144, 255)); // Dodger Blue
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.addActionListener(this);
        
        // Reset Button
        resetButton = new JButton("Reset");
        resetButton.setBackground(new Color(220, 20, 60)); // Crimson
        resetButton.setForeground(Color.WHITE);
        resetButton.setFocusPainted(false);
        resetButton.addActionListener(this);

        // Buttons Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(loginButton);
        buttonPanel.add(resetButton);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(buttonPanel, gbc);

        // Add Panel to Frame
        add(panel);
        
        // Make Frame Visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameTextField.getText();
            String password = new String(passTextField.getPassword());

            if (username.equals("admin") && password.equals("admin")) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                new HomePage(username);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Wrong username or password!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == resetButton) {
            usernameTextField.setText("");
            passTextField.setText("");
        }
    }

    
}


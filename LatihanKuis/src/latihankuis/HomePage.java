package latihankuis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements ActionListener {
    private String username;
    private JButton childBtn, teenBtn, adultBtn;

    public HomePage(String username) {
        this.username = username;

        // Frame Properties
        setTitle("Home Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel
        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));

        // Welcome Label
        JLabel welcomeLabel = new JLabel("Welcome, " + username, SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(welcomeLabel);

        // Buttons
        childBtn = new JButton("Majalah Anak");
        teenBtn = new JButton("Majalah Remaja ");
        adultBtn = new JButton("Majalah Dewasa");

        childBtn.addActionListener(this);
        teenBtn.addActionListener(this);
        adultBtn.addActionListener(this);

        panel.add(childBtn);
        panel.add(teenBtn);
        panel.add(adultBtn);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == childBtn) {
            new BuyPage("Anak", 10800);
        } else if (e.getSource() == teenBtn) {
            new BuyPage("Remaja", 15200);
        } else if (e.getSource() == adultBtn) {
            new BuyPage("Dewasa", 24400);
        }
        this.dispose();
    }
}

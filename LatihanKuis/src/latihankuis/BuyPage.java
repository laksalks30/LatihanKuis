package latihankuis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyPage extends JFrame implements ActionListener {
    private String category;
    private int price;
    private JTextField amountField;
    private JButton backBtn, buyBtn;

    public BuyPage(String category, int price) {
        this.category = category;
        this.price = price;

        // Frame Properties
        setTitle("Buy Page");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        panel.add(new JLabel("Category:"));
        panel.add(new JLabel(category));

        panel.add(new JLabel("Price per Pcs:"));
        panel.add(new JLabel("Rp." + price));

        panel.add(new JLabel("Amount:"));
        amountField = new JTextField();
        panel.add(amountField);

        // Buttons
        backBtn = new JButton("Back");
        buyBtn = new JButton("Buy");

        backBtn.addActionListener(this);
        buyBtn.addActionListener(this);

        panel.add(backBtn);
        panel.add(buyBtn);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backBtn) {
            new HomePage("User"); // Replace with actual username
            this.dispose();
        } else if (e.getSource() == buyBtn) {
            try {
                int amount = Integer.parseInt(amountField.getText());
                new TotalPage(category, price, amount);
                this.dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

package latihankuis;

import javax.swing.*;
import java.awt.*;

public class TotalPage extends JFrame {
    public TotalPage(String category, int price, int amount) {
        int totalPrice = price * amount;

        // Frame Properties
        setTitle("Total Price");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        panel.add(new JLabel("Category:"));
        panel.add(new JLabel(category));

        panel.add(new JLabel("Price per Pcs:"));
        panel.add(new JLabel("Rp." + price));

        panel.add(new JLabel("Amount:"));
        panel.add(new JLabel(String.valueOf(amount)));

        panel.add(new JLabel("Total Price:"));
        panel.add(new JLabel("Rp." + totalPrice));

        add(panel);
        setVisible(true);
    }
}

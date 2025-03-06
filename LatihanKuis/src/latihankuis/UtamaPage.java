package latihankuis;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

class UtamaPage extends JFrame {
    public UtamaPage(String username) {
        super("Halaman Utama");
        setVisible(true);
        setTitle("Halaman Utama");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        
        JLabel welcomeLabel = new JLabel("Selamat Datang, " + username, SwingConstants.CENTER);
        panel.add(welcomeLabel);
        
        JButton anakButton = new JButton("Majalah Anak");
        JButton remajaButton = new JButton("Majalah Remaja");
        JButton dewasaButton = new JButton("Majalah Dewasa");
        
        panel.add(anakButton);
        panel.add(remajaButton);
        panel.add(dewasaButton);
        
        add(panel);
        
        anakButton.addActionListener(e -> new PurchasePage("Majalah Anak").setVisible(true));
        remajaButton.addActionListener(e -> new PurchasePage("Majalah Remaja").setVisible(true));
        dewasaButton.addActionListener(e -> new PurchasePage("Majalah Dewasa").setVisible(true));
    }
}

class PurchasePage extends JFrame {
    public PurchasePage(String category) {
        super("Halaman Pembelian - " + category);
        setVisible(true);
        setTitle("Halaman Pembelian - " + category);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JLabel label = new JLabel("Anda memilih " + category, SwingConstants.CENTER);
        add(label);
        pack();
        setVisible(true);
    }
}

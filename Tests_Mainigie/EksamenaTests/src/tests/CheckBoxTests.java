package tests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CheckBoxTests extends JFrame implements ActionListener {
    JLabel l1, l2;
    JCheckBox cb1, cb2, cb3, cb4;
    JButton b1, b2;
    float sk;

    CheckBoxTests() {
        l1 = new JLabel("1. Kadus skaitlus ievieto int mainigaja");
        l1.setBounds(50, 50, 300, 20);
        cb1 = new JCheckBox("Reālus skaitlus");
        cb1.setBounds(100, 100, 150, 20);
        cb2 = new JCheckBox("Veselus Skaitlus");
        cb2.setBounds(100, 150, 150, 20);
        cb3 = new JCheckBox("Kautkadas Vertibas");
        cb3.setBounds(100, 200, 150, 20);
        b1 = new JButton("Apstiprinat");
        b1.setBounds(100, 250, 100, 30);
        b1.addActionListener(this);

        add(l1);
        add(cb1);
        add(cb2);
        add(cb3);
        add(b1);

        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxTests();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            sk = 0;
            String msg = "";

            if (cb1.isSelected()) {
                // Izpildīt darbības, kas saistītas ar pirmo jautājumu
            }

            if (cb2.isSelected()) {
                sk++;
            }

            if (cb3.isSelected()) {
                // Izpildīt darbības, kas saistītas ar trešo jautājumu
            }
            msg += "-----------\n";
            JOptionPane.showMessageDialog(this, msg + "Total: " + sk);

            if (cb1.isSelected() || cb2.isSelected() || cb3.isSelected()) {
                l2 = new JLabel("2. Kādus skaitļus ievieto double mainīgajā");
                l2.setBounds(50, 50, 300, 20);
                cb4 = new JCheckBox("Reālus skaitļus");
                cb4.setBounds(100, 100, 150, 20);
                b2 = new JButton("Apstiprinat");
                b2.setBounds(100, 150, 100, 30);
                b2.addActionListener(this);

                remove(l1);
                remove(cb1);
                remove(cb2);
                remove(cb3);
                remove(b1);

                add(l2);
                add(cb4);
                add(b2);

                revalidate();
                repaint();
            }
        } else if (e.getSource() == b2) {
            sk = 0;
            String msg = "";

            if (cb4.isSelected()) {
                // Izpildīt darbības, kas saistītas ar otro jautājumu
            }

            msg += "-----------\n";
            JOptionPane.showMessageDialog(this, msg + "Total: " + sk);
        }
    }
}


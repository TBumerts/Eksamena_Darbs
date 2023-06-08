package tests;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CheckBoxTests extends JFrame implements ActionListener {
    JLabel l;
    JCheckBox cb1, cb2, cb3;
    JButton b;
    float sk;

    CheckBoxTests() {
        l = new JLabel("1. Kadus skaitlus ievieto  int mainigaja");
        l.setBounds(50, 50, 300, 20);
        cb1 = new JCheckBox("Reālus skaitlus");
        cb1.setBounds(100, 100, 150, 20);
        cb2 = new JCheckBox("Veselus Skaitlus");
        cb2.setBounds(100, 150, 150, 20);
        cb3 = new JCheckBox("Kautkadas Vertibas");
        cb3.setBounds(100, 200, 150, 20);
        b = new JButton("Apstiprinat");
        b.setBounds(100, 250, 80, 30);
        b.addActionListener(this);
        add(l);
        add(cb1);
        add(cb2);
        add(cb3);
        add(b);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CheckBoxTests();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        sk = 0;
        String msg = "";
        if (cb1.isSelected()) {
        	
        }
        if (cb2.isSelected()) {
        	sk++;
        }
        if (cb3.isSelected()) {
        }
        msg += "-----------\n";
        JOptionPane.showMessageDialog(this, msg + "Total: " + sk);
    }
}

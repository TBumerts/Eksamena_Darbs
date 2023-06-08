package tests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CheckBoxTests extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5;
    JCheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12, cb13, cb14, cb15, cb16, cb17, cb18, cb19, cb20;
    JButton b1, b2, b3, b4, b5;
    int sk;

    CheckBoxTests() {
        l1 = new JLabel("1. Kādus skaitļus ievieto int mainīgajā");
        l1.setBounds(50, 50, 300, 20);
        cb1 = new JCheckBox("Reālus skaitļus");
        cb1.setBounds(100, 100, 150, 20);
        cb2 = new JCheckBox("Veselus skaitļus");
        cb2.setBounds(100, 150, 150, 20);
        cb3 = new JCheckBox("Kautkādas vērtības");
        cb3.setBounds(100, 200, 150, 20);
        b1 = new JButton("Apstiprināt");
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

                sk++;
            }

            if (cb2.isSelected()) {

                sk++;
            }

            if (cb3.isSelected()) {
 
                sk++;
            }

            msg += "-----------\n";
            JOptionPane.showMessageDialog(this, msg + "Kopā: " + sk);

            if (cb1.isSelected() || cb2.isSelected() || cb3.isSelected()) {
                remove(l1);
                remove(cb1);
                remove(cb2);
                remove(cb3);
                remove(b1);

                l2 = new JLabel("2. Kādus skaitļus ievieto double mainīgajā");
                l2.setBounds(50, 50, 300, 20);
                cb4 = new JCheckBox("Reālus skaitļus");
                cb4.setBounds(100, 100, 150, 20);
                cb5 = new JCheckBox("Veselus skaitļus");
                cb5.setBounds(100, 150, 150, 20);
                cb6 = new JCheckBox("Raugāmus skaitļus");
                cb6.setBounds(100, 200, 150, 20);
                b2 = new JButton("Apstiprināt");
                b2.setBounds(100, 250, 100, 30);
                b2.addActionListener(this);

                add(l2);
                add(cb4);
                add(cb5);
                add(cb6);
                add(b2);

                revalidate();
                repaint();
            }
        } else if (e.getSource() == b2) {
            if (cb4.isSelected()) {
 
                sk++;
            }

            if (cb5.isSelected()) {
   
                sk++;
            }

            if (cb6.isSelected()) {
         
                sk++;
            }

            remove(l2);
            remove(cb4);
            remove(cb5);
            remove(cb6);
            remove(b2);

            revalidate();
            repaint();

            String msg = "-----------\n";
            JOptionPane.showMessageDialog(this, msg + "Kopā: " + sk);

            if (cb4.isSelected() || cb5.isSelected() || cb6.isSelected()) {
                l3 = new JLabel("3. Kādus skaitļus ievieto double mainīgajā");
                l3.setBounds(50, 50, 300, 20);
                cb7 = new JCheckBox("Reālus skaitļus");
                cb7.setBounds(100, 100, 150, 20);
                cb8 = new JCheckBox("Veselus skaitļus");
                cb8.setBounds(100, 150, 150, 20);
                cb9 = new JCheckBox("Raugāmus skaitļus");
                cb9.setBounds(100, 200, 150, 20);
                b3 = new JButton("Apstiprināt");
                b3.setBounds(100, 250, 100, 30);
                b3.addActionListener(this);

                add(l3);
                add(cb7);
                add(cb8);
                add(cb9);
                add(b3);

                revalidate();
                repaint();
            }
        } else if (e.getSource() == b3) {
            if (cb7.isSelected()) {
        
                sk++;
            }

            if (cb8.isSelected()) {
            
                sk++;
            }

            if (cb9.isSelected()) {
        
                sk++;
            }

            remove(l3);
            remove(cb7);
            remove(cb8);
            remove(cb9);
            remove(b3);

            l4 = new JLabel("4. Kādus skaitļus ievieto String mainīgajā");
            l4.setBounds(50, 50, 300, 20);
            cb10 = new JCheckBox("Reālus skaitļus");
            cb10.setBounds(100, 100, 150, 20);
            cb11 = new JCheckBox("Veselus skaitļus");
            cb11.setBounds(100, 150, 150, 20);
            cb12 = new JCheckBox("Raugāmus skaitļus");
            cb12.setBounds(100, 200, 150, 20);
            b4 = new JButton("Apstiprināt");
            b4.setBounds(100, 250, 100, 30);
            b4.addActionListener(this);

            add(l4);
            add(cb10);
            add(cb11);
            add(cb12);
            add(b4);

            revalidate();
            repaint();
            String msg = "-----------\n";
            JOptionPane.showMessageDialog(this, msg + "Kopā: " + sk);
        } else if (e.getSource() == b4) {
            if (cb10.isSelected()) {
     
                sk++;
            }

            if (cb11.isSelected()) {

                sk++;
            }

            if (cb12.isSelected()) {

                sk++;
            }

            remove(l4);
            remove(cb12);
            remove(cb10);
            remove(cb11);
            remove(b4);

            revalidate();
            repaint();

            String msg = "-----------\n";
            JOptionPane.showMessageDialog(this, msg + "Kopā: " + sk);

            if (cb12.isSelected() || cb11.isSelected() || cb10.isSelected()) {
                l5 = new JLabel("5. Kādus skaitļus ievieto double mainīgajā");
                l5.setBounds(50, 50, 300, 20);
                cb13 = new JCheckBox("Reālus skaitļus");
                cb13.setBounds(100, 100, 150, 20);
                cb14 = new JCheckBox("Veselus skaitļus");
                cb14.setBounds(100, 150, 150, 20);
                cb15 = new JCheckBox("Raugāmus skaitļus");
                cb15.setBounds(100, 200, 150, 20);
                b5 = new JButton("Apstiprināt");
                b5.setBounds(100, 250, 100, 30);
                b5.addActionListener(this);
                add(l5);
                add(cb13);
                add(cb14);
                add(cb15);
                add(b5);
                revalidate();
                repaint();
            }
        } else if (e.getSource() == b5) {
            if (cb13.isSelected()) {
             
                sk++;
            }

            if (cb14.isSelected()) {
        
                sk++;
            }

            if (cb15.isSelected()) {
             
                sk++;
            }

            remove(l5);
            remove(cb13);
            remove(cb14);
            remove(cb15);
            remove(b5);

            revalidate();
            repaint();

            String msg = "-----------\n";
            JOptionPane.showMessageDialog(this, msg + "Kopā: " + sk);
        }
    }
}

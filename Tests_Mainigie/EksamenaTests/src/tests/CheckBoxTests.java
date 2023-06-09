package tests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CheckBoxTests extends JFrame implements ActionListener {
    JLabel questionLabel;
    JCheckBox[] checkboxes;
    JButton button;
    int currentQuestion;

    String[] questions = {
        "Kādus skaitļus ievieto int mainīgajā?",
        "Kādus skaitļus ievieto double mainīgajā?",
        "Kādus skaitļus ievieto double mainīgajā?",
        "Kādus skaitļus ievieto String mainīgajā?",
        "Kādus skaitļus ievieto double mainīgajā?",
        "Vai int ir maksimala vertība?",
        "Kas ir jaizmanto lai saglabatu mainigaja string?"
    };

    String[][] answerOptions = {
        {"Reālus skaitļus", "Veselus skaitļus", "Kautkādas vērtības"},
        {"Reālus skaitļus", "Veselus skaitļus", "Raugāmus skaitļus"},
        {"Reālus skaitļus", "Veselus skaitļus", "Raugāmus skaitļus"},
        {"Reālus skaitļus", "Veselus skaitļus", "Raugāmus skaitļus"},
        {"Reālus skaitļus", "Veselus skaitļus", "Raugāmus skaitļus"},
        {"Nav","Varbut ir","Janis"},
        {"Iekavas","Semikols","Pedinas"}
    };

    CheckBoxTests() {
        questionLabel = new JLabel();
        checkboxes = new JCheckBox[3];
        button = new JButton("Apstiprināt");
        button.setBounds(100, 250, 100, 30);
        button.addActionListener(this);

        add(questionLabel);
        for (int i = 0; i < 3; i++) {
            checkboxes[i] = new JCheckBox();
            checkboxes[i].setBounds(100, 100 + (i * 50), 150, 20);
            add(checkboxes[i]);
        }
        add(button);

        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        currentQuestion = 0;
        displayQuestion();
    }

    public static void main(String[] args) {
        new CheckBoxTests();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int sk = 0;

        for (JCheckBox checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                sk++;
            }
        }

        String msg = "-----------\n";
        JOptionPane.showMessageDialog(this, msg + "Kopā: " + sk);

        currentQuestion++;
        if (currentQuestion < questions.length) {
            displayQuestion();
        } else {
        	
            dispose();
        }
    }

    private void displayQuestion() {
        questionLabel.setText(questions[currentQuestion]);

        for (int i = 0; i < checkboxes.length; i++) {
            checkboxes[i].setText(answerOptions[currentQuestion][i]);
            checkboxes[i].setSelected(false);
        }
    }
}

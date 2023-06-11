package tests;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CheckBoxTests extends JFrame implements ActionListener {
    JLabel questionLabel;
    JCheckBox[] checkboxes;
    JButton button;
    int tagatJautajums;
    int sk;

    String[] jautajumi = {
        "1. Ko ievieto int mainīgajā?",
        "2. Kurs no dotajiem ir int?",
        "3. Kurs no dotajiem skaitļiem ir double?",
        "4. Ko saglabā mainīgajā double?",
        "5. Kādas vērtības atgriež boolean mainīgais?",
        "6. Kurš no dotajiem ir char mainīgais?",
        "7. Kā piesaista mainīgajam char vērtību?",
        "8. Kā tiek piešķirts simbolu virknes teksts?",
        "9. Kā iegūst simbolu virknes garumu?",
        "10. Kurā no dotajiem ir pareizi uzrakstīts, kas ir masīvs?"
    };

    String[][] Atbildes = {
        {"Reālus skaitļus", "Veselus skaitļus", "Masīva skaitļus", "Skaitļus bez komata"},
        {"2", "\'a'", "1000", "2.0"},
        {"100", "2.0", "2,0", "195.3"},
        {"Reālus skaitļus", "Skaitļus ar komatu", "Veseli skaitļi", "Masīva elementus"},
        {"true", "false", "Ja", "Patiesība"},
        {"\'S'", "\'Janis'", "\'A'", "\"A\"", "1"},
        {"Iekavas", "Semikols", "Pedinas", "Apastrofi"},
        {"Pēdiņas", "Semikols", "Punkts", "Nevar pieskirt"},
        {"length()", "size()", "izmers()", "Nav iespējams noteikt!"},
        {"int[] skaits", "String[]", "[] - Masīvs", "char = 'a'"}
    };

    CheckBoxTests() {
        questionLabel = new JLabel();
        checkboxes = new JCheckBox[4];
        button = new JButton("Apstiprināt");
        button.addActionListener(this);

        JPanel contentPane = new JPanel(new GridLayout(6, 1, 10, 10));
        contentPane.add(questionLabel);
        for (int i = 0; i < 4; i++) {
            checkboxes[i] = new JCheckBox();
            contentPane.add(checkboxes[i]);
        }
        contentPane.add(button);
        setContentPane(contentPane);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        tagatJautajums = 0;
        sk = 0;
        displayQuestion();
    }

    public static void main(String[] args) {
        new CheckBoxTests();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String IzveletasAtbildes = "";

        for (int i = 0; i < checkboxes.length; i++) {
            if (checkboxes[i].isSelected()) {
                IzveletasAtbildes += checkboxes[i].getText() + "\n";
            }
        }

        if (tagatJautajums == 0) {
            if (checkboxes[1].isSelected() && checkboxes[3].isSelected()) {
                sk=sk+2;
            }else if(checkboxes[1].isSelected() || checkboxes[3].isSelected()) {
            	sk++;
            }
        }if(tagatJautajums == 1) {
        	if (checkboxes[0].isSelected() && checkboxes[2].isSelected()) {
                sk=sk+2;
            }else if(checkboxes[1].isSelected() || checkboxes[2].isSelected()) {
            	sk++;
            }
        	
        }if(tagatJautajums == 2) {
        	if (checkboxes[1].isSelected() && checkboxes[3].isSelected()) {
                sk=sk+2;
            }else if(checkboxes[1].isSelected() || checkboxes[3].isSelected()) {
            	sk++;
            }
        	}if(tagatJautajums == 3){
        		if (checkboxes[0].isSelected() && checkboxes[1].isSelected()) {
                    sk=sk+2;
                }else if(checkboxes[0].isSelected() || checkboxes[1].isSelected()) {
                	sk++;
                }
        }if(tagatJautajums == 4) {
        	if (checkboxes[0].isSelected() && checkboxes[1].isSelected()) {
                sk=sk+2;
            }else if(checkboxes[0].isSelected() || checkboxes[1].isSelected()) {
            	sk++;
            }
        }if(tagatJautajums == 5) {
        	if (checkboxes[0].isSelected() && checkboxes[2].isSelected()) {
                sk=sk+2;
            }else if(checkboxes[0].isSelected() || checkboxes[2].isSelected()) {
            	sk++;
            }
        }if(tagatJautajums == 6) {
        	if (checkboxes[0].isSelected() && checkboxes[3].isSelected()) {
                sk=sk+2;
            }else if(checkboxes[0].isSelected() || checkboxes[3].isSelected()) {
            	sk++;
            }
        }if(tagatJautajums == 7) {
        	if (checkboxes[0].isSelected() && checkboxes[3].isSelected()) {
                sk=sk+2;
            }else if(checkboxes[0].isSelected() || checkboxes[3].isSelected()) {
            	sk++;
            }
        }if(tagatJautajums == 8) {
        	if (checkboxes[0].isSelected() && checkboxes[3].isSelected()) {
                sk=sk+2;
            }else if(checkboxes[0].isSelected() || checkboxes[3].isSelected()) {
            	sk++;
            }
        }if(tagatJautajums == 9) {
        	if (checkboxes[0].isSelected() && checkboxes[3].isSelected()) {
                sk=sk+2;
            }else if(checkboxes[0].isSelected() || checkboxes[3].isSelected()) {
            	sk++;
            }
        }else{
            if (parbAtb(Atbildes[tagatJautajums])) {
            }
        }
        JOptionPane.showMessageDialog(this,"\nIzvēlētās atbildes:\n" + IzveletasAtbildes);

        tagatJautajums++;
        if (tagatJautajums < jautajumi.length) {
            displayQuestion();
        } else {
            JOptionPane.showMessageDialog(this, "Tests pabeigts!\nKopā iegūtie punkti: " + sk);
            dispose();
        }
    }

    private void displayQuestion() {
        questionLabel.setText(jautajumi[tagatJautajums]);

        for (int i = 0; i < checkboxes.length; i++) {
            checkboxes[i].setText(Atbildes[tagatJautajums][i]);
            checkboxes[i].setSelected(false);
        }
    }

    private boolean parbAtb(String[] pareizAtb) {
        for (int i = 0; i < checkboxes.length; i++) {
            if (checkboxes[i].isSelected()) {
                String selectedAnswer = checkboxes[i].getText();
                boolean Pareizi = false;
                for (String correctAnswer : pareizAtb) {
                    if (selectedAnswer.equals(correctAnswer)) {
                        Pareizi = true;
                        break;
                    }
                }
                if (!Pareizi) {
                    return false;
                }
            }
        }
        return true;
    }
}

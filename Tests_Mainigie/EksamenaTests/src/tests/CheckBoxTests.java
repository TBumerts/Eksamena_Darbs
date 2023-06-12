package tests;
//Programmas sakotnejā izstrāde tika izmantota https://www.javatpoint.com/java-jcheckbox
//Pēc tam saīsināsanas nolūkos tika izmantoti masīvi
//https://stackoverflow.com/questions/5541570/array-of-checkboxes-in-java

import java.awt.Component;
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
//Jautājumu masīvs
    String[] jautajumi = {
        "1. Ko ievieto int mainīgajā?",
        "2. Kurs no dotajiem ir int?",
        "3. Kurs no dotajiem skaitļiem ir double?",
        "4. Ko saglabā mainīgajā double?",
        "5. Kādas vērtības atgriež boolean mainīgais?",
        "6. Kurš no dotajiem ir char mainīgais?",
        "7. Kādas operācijas ir atļautas ar String datu tipa mainīgajiem?",
        "8. Kādas operācijas ir atļautas ar int datu tipa mainīgajiem?",
        "9. Kā iegūst simbolu virknes garumu?",
        "10. Kā definēt un inicializēt masīvu int datu tipam?"
    };
//Masīvs ar atbildes iespējām
    String[][] Atbildes = {
        {"Reālus skaitļus", "Veselus skaitļus", "Masīva skaitļus", "Skaitļus bez komata"}, // Atbilde: Veselus,Bez komata
        {"2", "\'a'", "1000", "2.0"}, // Atbildes: 2 , 1000
        {"100", "2.0", "2,0", "195.3"}, // Atbildes: 2.0 , 195.3
        {"Reālus skaitļus", "Skaitļus ar komatu", "Veseli skaitļi", "Masīva elementus"}, // Atbilde: Reālus,Ar komatu
        {"true", "false", "Ja", "Patiesība"}, // Atbilde: true,false
        {"\'S'", "\'Janis'", "\'A'", "\"A\"", "1"}, // Atbilde : 'S' , 'A'
        {"Sasaistīšana", "Salīdzināšana", "Matemātiskas operācijas", "Pārvēršana par būla vērtību"}, // Atbilde : Saskaitīšana,Salīdzināšana
        {"Matemātiskās operācijas", "Salīdzināšanas operācijas", "Simbolu virkņu operācijas", "Apaļošanas operācijas"},//Atbilde: Matemātiskas,Salīdzināšanas
        {"length()", "size()", "izmers()", "Nav iespējams noteikt!"},//Atbilde: length,size
        {"int[] numbers = new int[5];", "int numbers = new int[5];", "int[5] numbers = new int[];", "int numbers = {1, 2, 3, 4, 5};"}//Atbilde 0,3 elements
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
        //definē mainīgos jautajumu noteikšanai un punktu skaitīšanai
        tagatJautajums = 0;
        sk = 0;
        displayQuestion();
    }
    //Ar main palīdzību tiek iesaukta metode lai iesaktu programmu
    public static void main(String[] args) {
    	// pievieno divus objektus Sākt,Aizvērt
    	Object[] options = {"Sākt", "Aizvert"};
		Component frame = null;
		// uzdod jautajumu lietotājam vai uzsākt testu.
		int n = JOptionPane.showOptionDialog(frame,
			"Iesākt testu?",
			"Jautājums lietotājam",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			options,
			options[0]);
		//Ja atbilde uz jautājumu ir ja tad tiek palaista programma
		if (n == 0) {
			JOptionPane.showMessageDialog(null,"Veic 10 jautajumus katrā jautajumā 2 pareizas atbildes\n"
					+ "Ja jautājuma abas atbildes ir pareizas tiks pieskaitīti 2 punkti pretējā gadijumā 1 punkts\n"
					+ "Punktu skaits tiks parādīts programmas beigās");
	        new CheckBoxTests();  
		}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String IzveletasAtbildes = "";

        for (int i = 0; i < checkboxes.length; i++) {
            if (checkboxes[i].isSelected()) {
                IzveletasAtbildes += checkboxes[i].getText() + "\n";
            }
        }
        //Pirmais jautajums tiek pārbaudīts izmantojot if
        if (tagatJautajums == 0) {
        	//Ja abas pareizas atbildes ir atzīmētas tad pieskaita +2 punktus
            if (checkboxes[1].isSelected() && checkboxes[3].isSelected()) {
                sk=sk+2;
                //Ja tas netiek izdarīts bet tiek izvēlēta vismaz 1 atbilde pareiza pieskaita +1 punktu
            }else if(checkboxes[1].isSelected() || checkboxes[3].isSelected()) {
            	sk++;
            }
            //Parejie jautājumi tiek pārbaudīti pēc tāda paša principa
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
        	if (checkboxes[0].isSelected() && checkboxes[1].isSelected()) {
                sk=sk+2;
            }else if(checkboxes[0].isSelected() || checkboxes[1].isSelected()) {
            	sk++;
            }
        }if(tagatJautajums == 7) {
        	if (checkboxes[0].isSelected() && checkboxes[1].isSelected()) {
                sk=sk+2;
            }else if(checkboxes[0].isSelected() || checkboxes[1].isSelected()) {
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
        //Parāda lietotājam viņa izvēlētās atbildes pēc jautājuma atbildēšanas
        JOptionPane.showMessageDialog(this,"Izvēlētās atbildes:\n" + IzveletasAtbildes);
        // Pāreja uz nākamo jautajumu
        tagatJautajums++;
        if (tagatJautajums < jautajumi.length) {
            displayQuestion();
        } else {
        	//Ja visi jautajumiem ir iziets cauri tad beigās tiek parādīti iegūtie punkti no max 20
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
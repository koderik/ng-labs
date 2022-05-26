/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel.pkg1.del.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author ERIK
 */
public class Kapitel1Del2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean on = true;

        do {
            int score = 0;
            int difficulty = Integer.parseInt(JOptionPane.showInputDialog("Skriv in svårighetsgraden på hoppet"));
            int maxIndex = 0;
            int minIndex = 0;
            int[] judgeList = new int[7];
            System.out.println(judgeList.length);
            for (int i = 0; i < judgeList.length; i++) {
                judgeList[i] = Integer.parseInt(JOptionPane.showInputDialog("Skriv in betyget för dommare " + (i + 1)));
                if (judgeList[i] < 0 || judgeList[i] > 10) {
                    JOptionPane.showMessageDialog(null, "Mellan 0-10 tack");
                    i -= 1;
                }
                if (judgeList[maxIndex] < judgeList[i]) {
                    maxIndex = i;
                } else if (judgeList[minIndex] > judgeList[i]) {
                    minIndex = i;
                }
            }
            judgeList[minIndex] = 0;
            judgeList[maxIndex] = 0;
            for (int i = 0; i < judgeList.length; i++) {
                score += judgeList[i];
            }
            score = (score / 5) * 3 * difficulty;
            JOptionPane.showMessageDialog(null, "Bedömning:  " + score);
            if (JOptionPane.showConfirmDialog(null, "Vill du fortsätta?", "Avsluta?",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                on = true;
            } else {
                on = false;
            }
        } while (on);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övnprov1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author ERIK
 */
public class Fönster extends JFrame implements ActionListener {

    private JPanel JPuppe, JPnere;
    private JLabel JLtitel, JLfil, JLsortnamn, JLsortsaldo;
    private JButton JBfil, JBsortnamn, JBsortsaldo, JBsök;
    private JTextField JTFsök;
    private JTextArea JTAkonton;
    private ArrayList<Kund> kundList;

    public Fönster() {
        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        JPuppe = new JPanel(new BoxLayout(JPuppe, BoxLayout.Y_AXIS));
        JPuppe.setLayout(new BoxLayout(JPuppe, BoxLayout.Y_AXIS));
        JLfil = new JLabel("Fil:");
        JBfil = new JButton("Välj fil");
        JBfil.addActionListener(this);
        JPnere = new JPanel();
        JPnere.setLayout(new BoxLayout(JPnere, BoxLayout.Y_AXIS));
        JLtitel = new JLabel("Erik äter bajs");
        JPanel JPuppeU = new JPanel();
        JPuppeU.add(JLtitel);
        JPanel JPuppeN = new JPanel();
        JPuppeN.add(JLfil);
        JPuppeN.add(JBfil);
        JPuppe.add(JPuppeU);
        JPuppe.add(JPuppeN);
        JTAkonton = new JTextArea();
        JScrollPane scroll = new JScrollPane(JTAkonton, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setPreferredSize(new Dimension(500,250));
        JPuppe.add(scroll);

        JLsortnamn = new JLabel("Sortera kunder på namn");
        JLsortsaldo = new JLabel("Sortera kunder på totalt saldo");
        JBsortsaldo = new JButton("Sortera");
        JBsortnamn = new JButton("Sortera");
        JBsortnamn.addActionListener(this);
        JBsortsaldo.addActionListener(this);

        JPanel JPnere1 = new JPanel();
        JPnere1.add(JLsortnamn);
        JPnere1.add(JBsortnamn);
        JPanel JPnere2 = new JPanel();
        JPnere2.add(JLsortsaldo);
        JPnere2.add(JBsortsaldo);
        JPanel JPnere3 = new JPanel();
        JTFsök = new JTextField("", 8);
        JPnere3.add(JTFsök);
        JBsök = new JButton("Sök kund (totalt saldo)");
        JBsök.addActionListener(this);
        JPnere3.add(JBsök);

        JPnere.add(JPnere1);
        JPnere.add(JPnere2);
        JPnere.add(JPnere3);

        main.add(JPuppe);
        main.add(JPnere);
        add(main);
        setPreferredSize(new Dimension(500, 500));
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.JBsök) {
            if (!this.JTFsök.getText().equals("")) {
                double saldo = Double.valueOf(JTFsök.getText());
                boolean found = true;
                for (Kund k : kundList) {
                    if (k.getTotalSaldo() == saldo) {
                        JOptionPane.showMessageDialog(this, k.toString());
                        JTFsök.setText("");
                        found = false;
                    }
                }
                if (found) {
                    JOptionPane.showMessageDialog(this, "Ingen kund med saldo: " + saldo + " hittades.");
                }

            }
        } else if (e.getSource() == this.JBsortnamn) {
            if (!JTAkonton.getText().equals("")) {
                jämförNamn j = new jämförNamn();
                kundList.sort(j);
                appendKunder();
            }
        } else if (e.getSource() == this.JBsortsaldo) {
            if (!JTAkonton.getText().equals("")) {
                jämförSaldo j = new jämförSaldo();
                kundList.sort(j);
                appendKunder();
            }

        } else if (e.getSource() == this.JBfil) {
            try {
                kundList = new ArrayList<>();
                JFileChooser Jf = new JFileChooser();
                Jf.setCurrentDirectory(new File("G:\\Min enhet\\NG_PRR2_Erik_Sandlöv\\Kapitel 12\\ÖvnProv1"));

                Jf.showOpenDialog(this);
                File file = Jf.getSelectedFile();

                Scanner sc = new Scanner(file);
                while (sc.hasNext()) {
                    String s = sc.nextLine().replaceAll("\\|", "");
                    System.out.println(s);
                    Scanner sS = new Scanner(s);
                    Kund k = new Kund(sS.next());

                    while (sS.hasNext()) {
                        Konto kk = new Konto(Double.valueOf(sS.next()), Integer.valueOf(sS.next()));
                        System.out.println(kk);
                        k.addKonto(kk);
                    }
                    System.out.println(s);
                    kundList.add(k);
                }
                appendKunder();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Fönster.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private void appendKunder() {
        JTAkonton.setText("");
        for (Kund k : kundList) {
            this.JTAkonton.append(k.toString());
        }
    }

}

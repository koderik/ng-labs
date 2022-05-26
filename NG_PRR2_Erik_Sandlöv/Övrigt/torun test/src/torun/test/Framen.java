/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torun.test;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ERIK
 */
public class Framen extends JFrame implements ActionListener {

    private JLabel LblRegnr, LblMärke, LblBiltyp, LblÅrsmod;
    private JTextField TxfRegnr, TxfMärke;
    private JRadioButton RbSedan, RbKombi, RbCab;
    private JButton BtnKlar, BtnAvbryt, BtnÅrsmod, BtnMärke;
    private JTextArea TxaListan;
    private JComboBox CbCombobox;

    public Framen() {
        LblRegnr = new JLabel("Regnr:");
        LblMärke = new JLabel("Märke:");
        LblBiltyp = new JLabel("Biltyp:");
        LblÅrsmod = new JLabel("Årsmodell:");

        TxfRegnr = new JTextField("", 20);
        TxfMärke = new JTextField("", 20);

        RbSedan = new JRadioButton("Sedan");
        RbKombi = new JRadioButton("Kombi");
        RbCab = new JRadioButton("Cab");
        ButtonGroup b = new ButtonGroup();
        b.add(RbCab);
        b.add(RbKombi);
        b.add(RbSedan);

        BtnKlar = new JButton("Klar");
        BtnKlar.addActionListener(this);
        BtnAvbryt = new JButton("Avbryt");
        BtnAvbryt.addActionListener(this);
        BtnÅrsmod = new JButton("Årsmodell");
        BtnÅrsmod.addActionListener(this);
        BtnMärke = new JButton("Märke");
        BtnMärke.addActionListener(this);

        TxaListan = new JTextArea("");
        TxaListan.setPreferredSize(new Dimension(350, 150));
        
        CbCombobox = new JComboBox();
        
        for (int i = 2001; i <= 2016; i++) {
            CbCombobox.addItem(i);
        }
        

        GridBagLayout g = new GridBagLayout();
        this.setLayout(g);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        this.add(this.LblRegnr, c);

        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 4;
        this.add(this.TxfRegnr, c);

        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 1;
        this.add(this.LblMärke, c);

        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 4;
        this.add(this.TxfMärke, c);

        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 2;
        this.add(this.LblBiltyp, c);

        JPanel ja1 = new JPanel();
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        this.add(ja1, c);

        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 2;
        this.add(this.RbSedan, c);

        c = new GridBagConstraints();
        c.gridx = 3;
        c.gridy = 2;
        this.add(this.RbKombi, c);

        c = new GridBagConstraints();
        c.gridx = 4;
        c.gridy = 2;
        this.add(this.RbCab, c);

        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 3;
        this.add(this.LblÅrsmod, c);

        JPanel ja2 = new JPanel();
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;
        this.add(ja2, c);

        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 3;
        this.add(this.CbCombobox, c);

        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 4;
        this.add(this.BtnKlar, c);

        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 4;
        this.add(this.BtnAvbryt, c);

        JPanel ja3 = new JPanel();
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 4;
        this.add(ja3, c);

        c = new GridBagConstraints();
        c.gridx = 3;
        c.gridy = 4;
        this.add(this.BtnÅrsmod, c);

        c = new GridBagConstraints();
        c.gridx = 4;
        c.gridy = 4;
        this.add(this.BtnMärke, c);

        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 5;
        c.gridheight = 3;
        c.gridwidth = 5;
        
        this.add(this.TxaListan, c);

        pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

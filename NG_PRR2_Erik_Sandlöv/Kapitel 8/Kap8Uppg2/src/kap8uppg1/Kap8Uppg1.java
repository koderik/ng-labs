/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap8uppg1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author erik.sandlov
 */
public class Kap8Uppg1 extends JFrame implements ActionListener {

    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JTextField t1;
    private JTextField t2;
    private JTextArea a1;
    private JComboBox b;
    private LinkedList userList;

    public Kap8Uppg1() {
        // TODO code application logic here
        GridBagLayout m = new GridBagLayout();
        userList = new LinkedList<User>();

        JPanel mainmain = new JPanel(m);

        JLabel l1 = new JLabel("Namn");
        JLabel l2 = new JLabel("Ålder");
        JLabel l3 = new JLabel("Favoritspråk");
        t1 = new JTextField();
        t1.setPreferredSize(new Dimension(120, 30));
        t2 = new JTextField();
        t2.setPreferredSize(new Dimension(120, 30));
        b = new JComboBox();
        b.setPreferredSize(new Dimension(120, 30));
        b.addItem("Java");
        b.addItem("Python");
        b.addItem("C++");

        a1 = new JTextArea();
        a1.setBorder((new LineBorder(Color.black)));
        a1.setRows(5);
        a1.setEditable(false);

        JScrollPane s1 = new JScrollPane(a1);

        b1 = new JButton();
        b1.setText("Avbryt");
        b1.addActionListener(this);
        b2 = new JButton();
        b2.setText("Lägg till");
        b2.addActionListener(this);

        b3 = new JButton();
        b3.setText("Rensa");
        b3.addActionListener(this);
//1
        GridBagConstraints con;
        con = new GridBagConstraints();
        con.gridx = 0;
        con.gridy = 0;
        con.gridheight = 1;
        con.ipadx = 15;
        con.ipady = 15;
        con.insets = new Insets(0, 10, 0, 0);
        con.anchor = GridBagConstraints.NORTHWEST;
        con.fill = GridBagConstraints.VERTICAL;
        m.setConstraints(l1, con);
        mainmain.add(l1);
        con = new GridBagConstraints();
        con.gridx = 1;
        con.gridy = 0;
        con.gridwidth = 2;
        con.anchor = GridBagConstraints.NORTHWEST;
        con.fill = GridBagConstraints.HORIZONTAL;
        m.setConstraints(t1, con);
        mainmain.add(t1);
//2
        con = new GridBagConstraints();
        con.gridx = 0;
        con.gridy = 1;
        con.gridheight = 1;
        con.ipadx = 15;
        con.ipady = 15;
        con.insets = new Insets(0, 10, 0, 0);
        con.anchor = GridBagConstraints.NORTHWEST;
        con.fill = GridBagConstraints.VERTICAL;
        m.setConstraints(l2, con);
        mainmain.add(l2);
        con = new GridBagConstraints();
        con.gridx = 1;
        con.gridy = 1;
        con.gridwidth = 2;
        con.anchor = GridBagConstraints.NORTHWEST;
        con.fill = GridBagConstraints.HORIZONTAL;
        m.setConstraints(t2, con);
        mainmain.add(t2);
//3
        con = new GridBagConstraints();
        con.gridx = 0;
        con.gridy = 2;
        con.gridheight = 1;
        con.ipadx = 15;
        con.ipady = 15;
        con.insets = new Insets(0, 10, 0, 0);
        con.anchor = GridBagConstraints.NORTHWEST;
        con.fill = GridBagConstraints.VERTICAL;
        m.setConstraints(l3, con);
        mainmain.add(l3);
        con = new GridBagConstraints();
        con.gridx = 1;
        con.gridy = 2;
        con.gridwidth = 2;

        con.anchor = GridBagConstraints.NORTHWEST;
        con.fill = GridBagConstraints.HORIZONTAL;
        m.setConstraints(b, con);
        mainmain.add(b);
//knappar
        con = new GridBagConstraints();
        con.gridx = 1;
        con.gridy = 3;
        con.gridheight = 1;

        con.insets = new Insets(0, 0, 0, 5);
        con.anchor = GridBagConstraints.NORTHWEST;
        m.setConstraints(b1, con);
        mainmain.add(b1);
        con = new GridBagConstraints();
        con.gridx = 2;
        con.gridy = 3;
        con.insets = new Insets(0, 5, 0, 0);

        con.gridheight = 1;

        con.anchor = GridBagConstraints.NORTHWEST;
        m.setConstraints(b2, con);
        mainmain.add(b2);
//txa
        con = new GridBagConstraints();
        con.gridx = 3;
        con.gridy = 0;
        con.gridheight = 3;
        con.gridwidth = 3;
        con.insets = new Insets(0, 30, 5, 10);
        con.ipadx = 50;
        con.ipady = 50;
        con.fill = GridBagConstraints.BOTH;
        con.weightx = 1;
        con.anchor = GridBagConstraints.NORTHWEST;
        m.setConstraints(s1, con);
        mainmain.add(s1);
        con = new GridBagConstraints();
        con.gridx = 5;
        con.gridy = 3;
        con.gridheight = 1;
        con.insets = new Insets(0, 0, 0, 10);

        con.anchor = GridBagConstraints.SOUTHEAST;
        m.setConstraints(b3, con);
        mainmain.add(b3);

        add(mainmain);
        setPreferredSize(new Dimension(500, 200));
        pack();
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Kap8Uppg1 a = new Kap8Uppg1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            t1.setText("");
            t2.setText("");
        } else if (e.getSource() == b2) {
            try {
                User u = new User(t1.getText(), b.getSelectedItem().toString(), Integer.valueOf(t2.getText()));
                userList.add(u);
            } catch (NumberFormatException a) {

                JOptionPane.showMessageDialog(this, "Feting error " + a.getMessage());
            }

            updateField();
            t1.setText("");
            t2.setText("");
        } else if (e.getSource() == b3) {

            userList.clear();
            updateField();
        }

        {

        }
    }

    private void updateField() {
        a1.setText("");
        for (Object u : userList) {
            a1.append(u.toString() + "\n");
        }
    }

}

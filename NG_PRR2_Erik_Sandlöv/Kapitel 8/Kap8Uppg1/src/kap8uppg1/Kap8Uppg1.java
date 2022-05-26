/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap8uppg1;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.*;

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

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BoxLayout(outputPanel, BoxLayout.Y_AXIS));
        JPanel over = new JPanel();
        over.setLayout(new BoxLayout(over, BoxLayout.X_AXIS));
        JPanel under = new JPanel();
        under.setLayout(new BoxLayout(under, BoxLayout.X_AXIS));
        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));

        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));

        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));

        JPanel p4 = new JPanel();
        p4.setLayout(new BoxLayout(p4, BoxLayout.X_AXIS));

        JLabel l1 = new JLabel("Namn");
        JLabel l2 = new JLabel("Ålder");
        JLabel l3 = new JLabel("Favoritspråk");
        t1 = new JTextField();
        t1.setMaximumSize(new Dimension(120, 30));
        t2 = new JTextField();
        t2.setMaximumSize(new Dimension(120, 30));
        b = new JComboBox();
        b.setMaximumSize(new Dimension(120, 30));
        b.addItem("Java");
        b.addItem("Python");
        b.addItem("C++");

        a1 = new JTextArea();

        b1 = new JButton();
        b1.setText("Avbryt");
        b1.addActionListener(this);
        b2 = new JButton();
        b2.setText("Lägg till");
        b2.addActionListener(this);
        b3 = new JButton();
        b3.setText("Rensa");
        b3.addActionListener(this);

        over.add(a1);
        under.add(Box.createRigidArea(new Dimension(50, 1)));
        under.add(b3);
        outputPanel.add(over);
        outputPanel.add(Box.createRigidArea(new Dimension(1, 10)));
        outputPanel.add(under);

        p1.add(l1);
        p1.add(Box.createRigidArea(new Dimension(40, 1)));
        p1.add(t1);
        p1.add(Box.createRigidArea(new Dimension(20, 1)));

        p2.add(l2);
        p2.add(Box.createRigidArea(new Dimension(43, 1)));
        p2.add(t2);
        p2.add(Box.createRigidArea(new Dimension(20, 1)));

        p3.add(l3);
        p3.add(Box.createRigidArea(new Dimension(2, 1)));
        p3.add(b);
        p3.add(Box.createRigidArea(new Dimension(20, 1)));

        p4.add(Box.createRigidArea(new Dimension(10, 1)));
        p4.add(b1);
        p4.add(Box.createRigidArea(new Dimension(10, 1)));
        p4.add(b2);

        inputPanel.add(p1);
        inputPanel.add(Box.createRigidArea(new Dimension(1, 10)));
        inputPanel.add(p2);
        inputPanel.add(Box.createRigidArea(new Dimension(1, 10)));
        inputPanel.add(p3);
        inputPanel.add(Box.createRigidArea(new Dimension(1, 10)));
        inputPanel.add(p4);

        GridBagConstraints con;
        con = new GridBagConstraints();
        con.gridx = 0;
        con.gridy = 0;
        con.gridheight = 1;
        con.fill = GridBagConstraints.VERTICAL;
        m.setConstraints(inputPanel, con);
        mainmain.add(inputPanel);
        con = new GridBagConstraints();
        con.gridx = 1;
        con.gridy = 0;
        con.gridheight = 1;
        con.fill = GridBagConstraints.VERTICAL;
        m.setConstraints(outputPanel, con);
        mainmain.add(outputPanel);
        add(mainmain);
        setPreferredSize(new Dimension(350, 200));
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
            User u = new User(t1.getText(), b.getSelectedItem().toString(), Integer.valueOf(t2.getText()));
            userList.add(u);
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

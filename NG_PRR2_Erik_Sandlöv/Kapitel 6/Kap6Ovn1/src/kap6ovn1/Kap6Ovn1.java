/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap6ovn1;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author erik.sandlov
 */
public class Kap6Ovn1 extends JFrame implements ActionListener {

    JFrame window;
    JLabel label;
    JButton button;
    boolean on = true;
    ImageIcon gif1;
    ImageIcon gif2;

    public Kap6Ovn1() {
        // TODO code application logic here
        setPreferredSize(new Dimension(500,500));
        window = new JFrame();
        label = new JLabel();
        button = new JButton();
        button.addActionListener(this);
        button.setText("Växla");

        label.setIcon(gif1);
        this.setLayout(new FlowLayout());
        gif1 = new ImageIcon("miniongif.gif");
        gif2 = new ImageIcon("sloth_gif.gif");
        label.setIcon(gif1);
        add(button);
        add(label);

        setVisible(true);
        setResizable(true);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Kap6Ovn1 j = new Kap6Ovn1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (on) {
            label.setIcon(gif2);
            on = false;
        } else {
            label.setIcon(gif1);
            on = true;

        }
    }

}

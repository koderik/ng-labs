/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap12ovn1;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import javax.swing.*;

/**
 *
 * @author ERIK
 */
public class F extends JFrame implements WindowStateListener {

    JComponent första;

    public F() {
        första = new JPanel();
        addWindowStateListener(this);
        this.add(första);
        pack();
        this.setVisible(true);

    }



    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println(e.getNewState());
        System.out.println("aa");
        if (e.getNewState() == WindowEvent.WINDOW_GAINED_FOCUS) {
            första.requestFocus();
            första.setBackground(Color.blue);
            System.out.println("ping");
        } else {
            första.requestFocus();
            första.setBackground(Color.red);
            System.out.println("pong");
        }
    }

}

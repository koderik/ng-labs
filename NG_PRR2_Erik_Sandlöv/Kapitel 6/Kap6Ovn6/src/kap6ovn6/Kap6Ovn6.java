/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap6ovn6;

import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author erik.sandlov
 */
public class Kap6Ovn6 extends JFrame implements ChangeListener {

    JFrame window;
    JLabel label1;
    JLabel label2;
    JSlider slider1;
    JSlider slider2;
    int temperature = 32;

    public Kap6Ovn6() {
        window = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        slider1 = new JSlider();
        slider2 = new JSlider();
        label1.setText(temperature + " celsius");
        label2.setText(getFahrenheit(temperature) + " fahrenheit");
        setLayout(new GridLayout(2, 1));

        slider1.setMaximum(150);
        slider2.setMaximum(302);
        slider2.setMinimum(0);
        slider1.setMinimum(-18);
        slider1.setValue(temperature);
        slider2.setValue(getFahrenheit(temperature));
        add(slider1);
        add(slider2);
        add(label1);
        add(label2);
        slider1.addChangeListener(this);
        slider2.addChangeListener(this);
        setVisible(true);
        setResizable(true);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private int getFahrenheit(int celcius) {
        int fahrenheit = (int) ((1.8) * celcius + 32);
        return fahrenheit;

    }

    private int getCelcius(int fahrenheit) {
        int celcius = (int) ((fahrenheit - 32) / 1.8);
        return celcius;

    }

    public static void main(String[] args) {
        Kap6Ovn6 j = new Kap6Ovn6();

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == slider1) {
            temperature = slider1.getValue();
            label1.setText(temperature + " celsius");
            slider2.setValue(getFahrenheit(temperature));
            label2.setText(getFahrenheit(temperature) + " fahrenheit");

        }
        if (e.getSource() == slider2) {
            temperature = getCelcius(slider2.getValue());
            label1.setText(temperature + " celsius");
            slider1.setValue(temperature);
            label2.setText(getFahrenheit(temperature) + " fahrenheit");

        }
    }

}

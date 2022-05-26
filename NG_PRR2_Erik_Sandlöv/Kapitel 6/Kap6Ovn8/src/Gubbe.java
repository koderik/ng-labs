
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author erik.sandlov
 */
public class Gubbe extends JFrame implements KeyListener {

    private List<String> ordLista = new ArrayList<>();
    private List<String> ordetLista = new ArrayList<>();
    private String ordet;
    private JFrame frame;
    private JLabel label;
    private JTextField textfield;
    private JProgressBar bar;
    private String s;
    private int errors;

    public Gubbe() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ord.txt"));
        while (sc.hasNext()) {
            ordLista.add(sc.next());
        }
        ordet = ordLista.get((int) (Math.random() * ordLista.size()));
        frame = new JFrame();
        label = new JLabel();
        textfield = new JTextField();
        bar = new JProgressBar();
        this.setLayout(new GridLayout(3, 1));

        for (int i = 0; i < ordet.length(); i++) {
            ordetLista.add("?");
        }
        errors = 0;
        label.setText(ordetLista.toString());
        bar.setValue(errors);
        bar.setMaximum(ordet.length());
        textfield.addKeyListener(this);
        textfield.setEditable(true);
        add(label);
        add(textfield);
        add(bar);

        setVisible(true);
        setResizable(true);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Gubbe j = new Gubbe();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            String guess = textfield.getText().charAt(0) + "";
            if (ordet.contains(guess)) {
                for (int i = 0; i < ordetLista.size(); i++) {
                    if (ordetLista.get(i).equals(guess)) {
                        ordetLista.set(i, guess);

                    }
                    label.setText(ordetLista.toString());
                }
                label.setText(ordetLista.toString());
            } else {
                errors++;
                bar.setValue(errors);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

}

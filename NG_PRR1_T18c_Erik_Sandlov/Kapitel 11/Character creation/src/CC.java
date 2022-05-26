
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erik.sandlov
 */
public class CC extends javax.swing.JPanel {
int head = 0;
int chest = 0;
int legs = 0;
    /**
     * Creates new form CC
     */
    public CC() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headMinus = new javax.swing.JButton();
        chestMinus = new javax.swing.JButton();
        legsMinus = new javax.swing.JButton();
        headPlus = new javax.swing.JButton();
        chestPlus = new javax.swing.JButton();
        legsPlus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        headMinus.setText("<<");
        headMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headMinusActionPerformed(evt);
            }
        });

        chestMinus.setText("<<");
        chestMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chestMinusActionPerformed(evt);
            }
        });

        legsMinus.setText("<<");
        legsMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legsMinusActionPerformed(evt);
            }
        });

        headPlus.setText(">>");
        headPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headPlusActionPerformed(evt);
            }
        });

        chestPlus.setText(">>");
        chestPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chestPlusActionPerformed(evt);
            }
        });

        legsPlus.setText(">>");
        legsPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legsPlusActionPerformed(evt);
            }
        });

        jLabel1.setText("Head");

        jLabel2.setText("Chest");

        jLabel3.setText("Legs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(headMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(chestMinus))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(legsMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(legsPlus)
                    .addComponent(chestPlus)
                    .addComponent(headPlus))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headMinus)
                    .addComponent(headPlus)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chestMinus)
                    .addComponent(chestPlus)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(legsMinus)
                    .addComponent(legsPlus)
                    .addComponent(jLabel3))
                .addContainerGap(201, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void headMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headMinusActionPerformed
        // TODO add your handling code here:
        if(head==1){
            head--;
        }
        else head ++;
        repaint();
        
    }//GEN-LAST:event_headMinusActionPerformed

    private void headPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headPlusActionPerformed
        // TODO add your handling code here:
        if(head==0){
            head++;
        }
        else head --;
        repaint();
    }//GEN-LAST:event_headPlusActionPerformed

    private void chestMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chestMinusActionPerformed
        // TODO add your handling code here:
        if(chest==1){
            chest--;
        }
        else chest ++;
        repaint();
    }//GEN-LAST:event_chestMinusActionPerformed

    private void chestPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chestPlusActionPerformed
        // TODO add your handling code here:
        if(chest==0){
            chest++;
        }
        else chest --;
        repaint();
    }//GEN-LAST:event_chestPlusActionPerformed

    private void legsMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legsMinusActionPerformed
        // TODO add your handling code here:
        if(legs==1){
            legs--;
        }
        else legs ++;
        repaint();
    }//GEN-LAST:event_legsMinusActionPerformed

    private void legsPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legsPlusActionPerformed
        // TODO add your handling code here:
         if(legs==0){
            legs++;
        }
        else legs --;
        repaint();
    }//GEN-LAST:event_legsPlusActionPerformed

protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(5, 5, 200, 400);
        g.setColor(Color.PINK);
        g.fillRect(50, 50, 100, 320);
        g.setColor(Color.BLACK);
        g.fillRect(70, 135, 10, 10);
        g.fillRect(130, 135, 10, 10);
        g.fillRect(70, 155, 60, 10);
        switch(head){
            case 0:
                g.setColor(Color.red);
                g.fillRect(50, 50, 100, 50);
                g.fillRect(50, 100, 170, 25);
                break;
            case 1:
                g.setColor(Color.YELLOW);
                g.fillRect(50, 50, 100, 70);

                break;
        }
        switch(chest){
            case 0:
                g.setColor(Color.CYAN);
                g.fillRect(50, 180, 100, 80);
                break;
            case 1:
                g.setColor(Color.PINK);
                g.fillRect(50, 180, 100, 80);
                g.setColor(Color.RED);
                g.fillRect(65, 200, 5, 5);
                g.fillRect(125, 200, 5, 5);
                
                break;
        }
        switch(legs){
            case 1:
                g.setColor(Color.GREEN);
                g.fillRect(50, 260, 100, 70);
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(50, 360, 100, 30);
                
                break;
            case 0:
                g.setColor(Color.DARK_GRAY);
                g.fillRect(50, 260, 100, 100);
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(50, 360, 100, 30);
                break;
        }
        g.setColor(Color.WHITE);
        g.fillRect(100, 290, 4, 100);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chestMinus;
    private javax.swing.JButton chestPlus;
    private javax.swing.JButton headMinus;
    private javax.swing.JButton headPlus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton legsMinus;
    private javax.swing.JButton legsPlus;
    // End of variables declaration//GEN-END:variables
}

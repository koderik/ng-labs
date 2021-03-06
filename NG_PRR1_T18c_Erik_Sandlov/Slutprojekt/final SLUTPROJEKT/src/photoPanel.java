
import java.awt.Color;
import java.awt.Graphics;

/**
 * Hela den här panelen går utt på att den ritar en pizza som fungerar som en
 * logotyp i några av framesen så kunskapskravet grafiskt kommer med. Den är
 * asful
 */
/**
 *
 * @author ERIK
 */
public class photoPanel extends javax.swing.JPanel {

    /**
     * Creates new form photoPanel
     */
    public photoPanel() {
        initComponents();
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.drawString("PIZZA", 65, 50);
        /**
         * Ritar ut "pizzan"
         */
        int middle = 80;
        int width = 90;
        int height = 55;
        g.setColor(new Color(204, 153, 0));
        g.fillOval(middle - (width / 2), middle - (height / 2), width, height);

        width *= 0.92;
        height *= 0.92;
        g.setColor(new Color(204, 0, 0));
        g.fillOval(middle - (width / 2), middle - (height / 2), width, height);
        width *= 0.92;
        height *= 0.92;
        g.setColor(new Color(255, 191, 0));
        g.fillOval(middle - (width / 2), middle - (height / 2), width, height);
        g.setColor(new Color(179, 0, 0));
        /**
         * Ritar ut pepperonis
         */
        g.fillOval(80, 80, 10, 10);
        g.fillOval(100, 80, 10, 10);
        g.fillOval(90, 90, 10, 10);
        g.fillOval(60, 80, 10, 10);
        g.fillOval(80, 80, 10, 10);
        g.fillOval(70, 90, 10, 10);
        g.fillOval(55, 65, 10, 10);
        g.fillOval(70, 63, 10, 10);
        g.fillOval(85, 65, 10, 10);
        g.fillOval(99, 69, 10, 10);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

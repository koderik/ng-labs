
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ERIK
 */
public final class OrderStandardPizzaFrame extends javax.swing.JFrame {

    ArrayList<Customer> customerList;
    int customerIndex;

    DefaultListModel dmPizzas = new DefaultListModel();

    ArrayList<Topping> toppingList = new ArrayList<>();
    ArrayList<Pizza> pizzaList = new ArrayList<>();

    /*
     *
     * @param c Tar in en lista med kunder
     * @param i Tar in det specifika indexet på kunden man vill göra ändringar
     * till
     */
    public OrderStandardPizzaFrame(ArrayList<Customer> c, int i) {
        initComponents();
        /**
         * Flyttar över variabler och tilldelar listor osv.
         */
        customerList = c;
        customerIndex = i;

        addToppings();
        addMargherita();
        addVesuvio();
        addFunghi();
        addKebab();

        refreshlstPizzas();
    }

    /**
     * Metoder för standardpizzor. Kan ärligt talat inte komma på ett effektivt
     * sätt att göra detta på.
     */
    public void addMargherita() {
        Pizza p = new Pizza(3);
        p.setName("Margherita");
        p.addTopping(toppingList.get(0));
        p.addTopping(toppingList.get(1));
        pizzaList.add(p);
    }

    public void addVesuvio() {
        Pizza p = new Pizza(3);
        p.setName("Vesuvio");
        p.addTopping(toppingList.get(0));
        p.addTopping(toppingList.get(1));
        p.addTopping(toppingList.get(2));
        pizzaList.add(p);
    }

    public void addFunghi() {
        Pizza p = new Pizza(3);
        p.setName("Funghi");
        p.addTopping(toppingList.get(0));
        p.addTopping(toppingList.get(1));
        p.addTopping(toppingList.get(7));
        pizzaList.add(p);
    }

    public void addKebab() {
        Pizza p = new Pizza(3);
        p.setName("Kebab");
        p.addTopping(toppingList.get(0));
        p.addTopping(toppingList.get(1));
        p.addTopping(toppingList.get(8));
        pizzaList.add(p);
    }

    /**
     * Lägger till toppings metoden, går säkert att göra den här till en global
     * metod så jag slipper skriva in den i varje frame men vet ej hur man gör
     */
    public void addToppings() {

        this.toppingList.add(new Topping("Tomato", 2));
        this.toppingList.add(new Topping("Cheese", 2));
        this.toppingList.add(new Topping("Ham", 3));
        this.toppingList.add(new Topping("Pineapple", 5));
        this.toppingList.add(new Topping("Pickle", 5));
        this.toppingList.add(new Topping("Chicken", 3));
        this.toppingList.add(new Topping("Fries", 2));
        this.toppingList.add(new Topping("Mushroom", 5));
        this.toppingList.add(new Topping("Kebab", 3));
        this.toppingList.add(new Topping("Banana", 5));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPizzas = new javax.swing.JList<>();
        btnSelect = new javax.swing.JButton();
        finishPizza = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txfCost = new javax.swing.JTextField();
        txfPreviewPizza = new javax.swing.JTextField();
        photoPanel1 = new photoPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstPizzas.setBorder(javax.swing.BorderFactory.createTitledBorder("Pizzas"));
        lstPizzas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPizzas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(lstPizzas);

        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        finishPizza.setText("Finish Pizza");
        finishPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishPizzaActionPerformed(evt);
            }
        });

        jLabel1.setText("Cost:");

        txfCost.setEditable(false);

        txfPreviewPizza.setEditable(false);

        javax.swing.GroupLayout photoPanel1Layout = new javax.swing.GroupLayout(photoPanel1);
        photoPanel1.setLayout(photoPanel1Layout);
        photoPanel1Layout.setHorizontalGroup(
            photoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        photoPanel1Layout.setVerticalGroup(
            photoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSelect)
                            .addComponent(txfPreviewPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(finishPizza)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txfCost, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(photoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelect))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(photoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txfCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(finishPizza)))
                .addGap(11, 11, 11)
                .addComponent(txfPreviewPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        /**
         * Visar priset och ingridienserna i pizzan man valt.
         */
        int index = this.lstPizzas.getSelectedIndex();
        if (index != -1) {
            this.txfPreviewPizza.setText(pizzaList.get(index).toString());
            this.txfCost.setText("$" + pizzaList.get(index).getTotalCost());

        }

    }//GEN-LAST:event_btnSelectActionPerformed

    private void finishPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishPizzaActionPerformed
        /**
         * Lägger till pizzan man valt i kunden för det specifika indexet
         */
        if (lstPizzas.getSelectedIndex() != -1) {
            customerList.get(customerIndex).addPizza(pizzaList.get(lstPizzas.getSelectedIndex()));
        }
        /**
         * Skapar en "ny" frame och skickar tillbaka kundlistan och indexet och
         * raderar denna frame
         */
        new OrderListFrame(customerList, customerIndex).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_finishPizzaActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderStandardPizzaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new OrderStandardPizzaFrame(customerList, customerIndex).setVisible(true);
        });
    }

    /**
     * Metod för att rensa och fylla listan igen. Så man ska kunna sortera
     * pizzorna i framtiden och uppdatera listan.
     */
    private void refreshlstPizzas() {
        this.lstPizzas.setModel(dmPizzas);
        dmPizzas.clear();
        for (int i = 0; i < pizzaList.size(); i++) {
            dmPizzas.addElement(pizzaList.get(i).getName());

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton finishPizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstPizzas;
    private photoPanel photoPanel1;
    private javax.swing.JTextField txfCost;
    private javax.swing.JTextField txfPreviewPizza;
    // End of variables declaration//GEN-END:variables
}

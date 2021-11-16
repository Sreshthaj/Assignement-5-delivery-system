/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Sreshtha
 */
public class ManageOrders extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrders
     */
    EcoSystem system;
    JPanel userProcessContainer;
    UserAccount account;
    Order orderdet;
    Restaurant res;
     public ManageOrders(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
        this.account=account;
        this.system=system;
        this.userProcessContainer=userProcessContainer;
        populateTable();
    }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        
        model.setRowCount(0);
        
       
        for (Restaurant restro:system.getRestaurantDirectory().getRestaurantList()) {
           
            if (restro.getAdminUName().equals(account.getUsername())) {
                //System.out.println(restro.getOrderList());
               for(Order menu:restro.getOrderList()){
                Object[] row = new Object[5];
                row[0] = menu;
                row[1] = menu.getCustomerName();
                row[2] = menu.getDeliveryAddress();
                row[3] = menu.getCost();
                row[4] = menu.getStatus();
                model.addRow(row);
               }
                
            }
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        deliverbtn = new javax.swing.JButton();
        Assignbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        refreshbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer Name", "Delivery Address", "Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderTable);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        deliverbtn.setText("Accept or Reject Order");
        deliverbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliverbtnActionPerformed(evt);
            }
        });

        Assignbtn.setText("Assign to Delivery Man ");
        Assignbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Manage Orders");

        refreshbtn.setText("Refresh");
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshbtn)
                        .addGap(18, 18, 18)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(deliverbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(257, 257, 257)
                                .addComponent(Assignbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(286, 286, 286)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 160, Short.MAX_VALUE)))
                .addComponent(jLabel3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refreshbtn)
                            .addComponent(backBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(128, 128, 128)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliverbtn)
                    .addComponent(Assignbtn))
                .addContainerGap(281, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void deliverbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliverbtnActionPerformed
        int selectedRow = orderTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Order order  = (Order)orderTable.getValueAt(selectedRow, 0);
            if(order.getStatus().equals("Ready to Deliver")|| order.getStatus().equals("Order Rejected")){
                JOptionPane.showMessageDialog(null,"check order status","Warning",JOptionPane.WARNING_MESSAGE);
            }else{
                OrderDetails viewOrder=new OrderDetails(userProcessContainer,account,order,system);
                userProcessContainer.add("View Order",viewOrder);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_deliverbtnActionPerformed

    private void AssignbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignbtnActionPerformed
        int selectedRow = orderTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Order order  = (Order)orderTable.getValueAt(selectedRow, 0);
            if(order.getStatus().equals("Assign to Deliveryman")){
                JOptionPane.showMessageDialog(null,"Already Assigned Order","Warning",JOptionPane.WARNING_MESSAGE);
            }else{
                AssignDeliveryMan viewOrder=new AssignDeliveryMan(userProcessContainer,account,order,system);
                userProcessContainer.add("View Order",viewOrder);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_AssignbtnActionPerformed

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshbtnActionPerformed


        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Assignbtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deliverbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton refreshbtn;
    // End of variables declaration//GEN-END:variables
}
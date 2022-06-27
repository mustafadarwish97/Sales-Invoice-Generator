package sig.view;

import java.util.Date;
import javax.swing.table.DefaultTableModel;
import sig.controller.ActionHandler;
import sig.model.InvoiceHeader;
import sig.model.InvoiceItem;

public class InvoiceJFrame extends javax.swing.JFrame {

    public InvoiceJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogAddInvoice = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        okBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        dialogAddItem = new javax.swing.JDialog();
        ItemCount = new javax.swing.JTextField();
        itemName = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        itemPrice = new javax.swing.JTextField();
        newInvoiceBtn = new javax.swing.JButton();
        newInvoiceBtn.addActionListener(handler);
        deleteInvoiceBtn = new javax.swing.JButton();
        deleteInvoiceBtn.addActionListener(handler);
        jScrollPane2 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        newItemBtn = new javax.swing.JButton();
        newItemBtn.addActionListener(handler);
        deleteItemBtn = new javax.swing.JButton();
        deleteItemBtn.addActionListener(handler);
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        invoiceNumberValue = new javax.swing.JLabel();
        customerLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        headerTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFile = new javax.swing.JMenuItem();
        loadFile.addActionListener(handler);
        saveFile = new javax.swing.JMenuItem();
        saveFile.addActionListener(handler);

        dialogAddInvoice.setLocation(new java.awt.Point(200, 200));
        dialogAddInvoice.setSize(new java.awt.Dimension(400, 200));

        jLabel7.setText("Invoice Date");

        jLabel8.setText("Customer Name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        okBtn.setText("Ok");
        okBtn.setActionCommand("OkClickListener");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogAddInvoiceLayout = new javax.swing.GroupLayout(dialogAddInvoice.getContentPane());
        dialogAddInvoice.getContentPane().setLayout(dialogAddInvoiceLayout);
        dialogAddInvoiceLayout.setHorizontalGroup(
            dialogAddInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAddInvoiceLayout.createSequentialGroup()
                .addGroup(dialogAddInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogAddInvoiceLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(dialogAddInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(dialogAddInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dialogAddInvoiceLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        dialogAddInvoiceLayout.setVerticalGroup(
            dialogAddInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAddInvoiceLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(dialogAddInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(dialogAddInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(dialogAddInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBtn)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dialogAddItem.setLocation(new java.awt.Point(600, 200));
        dialogAddItem.setSize(new java.awt.Dimension(380, 220));

        ItemCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCountActionPerformed(evt);
            }
        });

        jButton3.setText("Ok");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setText("Item Name");

        jLabel10.setText("Item Count");

        jLabel11.setText("Item Price");

        itemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogAddItemLayout = new javax.swing.GroupLayout(dialogAddItem.getContentPane());
        dialogAddItem.getContentPane().setLayout(dialogAddItemLayout);
        dialogAddItemLayout.setHorizontalGroup(
            dialogAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAddItemLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(dialogAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(dialogAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(dialogAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itemName, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(ItemCount, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(itemPrice))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(dialogAddItemLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        dialogAddItemLayout.setVerticalGroup(
            dialogAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAddItemLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(dialogAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(21, 21, 21)
                .addGroup(dialogAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ItemCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(itemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales Invoice Genrator");
        setLocation(new java.awt.Point(200, 100));

        newInvoiceBtn.setText("Add New Invoice");
        newInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newInvoiceBtnActionPerformed(evt);
            }
        });

        deleteInvoiceBtn.setText("Delete Invoice");

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item name", "Unit price", "Count", "Line total"
            }
        ));
        jScrollPane2.setViewportView(itemTable);

        newItemBtn.setText("Add New Item");
        newItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemBtnActionPerformed(evt);
            }
        });

        deleteItemBtn.setText("Delete Item");
        deleteItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("Invoices Table");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("Invoice Items Table");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dateLabel.setText("label");

        invoiceNumberValue.setText("label");

        customerLabel.setText("label");

        totalLabel.setText("label");

        jLabel1.setText("Invoice Number : ");

        jLabel2.setText("Invoice Date :");

        jLabel3.setText("Customer Name : ");

        jLabel4.setText("Invoice Total :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalLabel)
                    .addComponent(dateLabel)
                    .addComponent(invoiceNumberValue)
                    .addComponent(customerLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceNumberValue)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerLabel)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalLabel)
                    .addComponent(jLabel4))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        headerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Customer Name", "Date"
            }
        ));
        headerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headerTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(headerTable);

        jMenu1.setText("File");

        loadFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        loadFile.setText("Load File");
        loadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileActionPerformed(evt);
            }
        });
        jMenu1.add(loadFile);

        saveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveFile.setText("Save File");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveFile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(newInvoiceBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteInvoiceBtn)
                        .addGap(116, 116, 116)
                        .addComponent(newItemBtn)
                        .addGap(44, 44, 44)
                        .addComponent(deleteItemBtn)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newInvoiceBtn)
                    .addComponent(deleteInvoiceBtn)
                    .addComponent(newItemBtn)
                    .addComponent(deleteItemBtn))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileActionPerformed

    }//GEN-LAST:event_loadFileActionPerformed

    private void newInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newInvoiceBtnActionPerformed
        InvoiceJFrame.dialogAddInvoice.setVisible(true);
    }//GEN-LAST:event_newInvoiceBtnActionPerformed

    private void newItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemBtnActionPerformed
        InvoiceJFrame.dialogAddItem.setVisible(true);
    }//GEN-LAST:event_newItemBtnActionPerformed

    private void deleteItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteItemBtnActionPerformed

    private void headerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerTableMouseClicked
        // TODO add your handling code here:
        InvoiceHeader header = handler.getHeader().get(headerTable.getSelectedRow());
        invoiceNumberValue.setText(String.valueOf(header.getNum()));
        dateLabel.setText(String.valueOf(header.getDate()));
        customerLabel.setText(String.valueOf(header.getCustomer()));
        totalLabel.setText(String.valueOf(handler.getInvoiceTotal(header)));
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (InvoiceItem item : header.getItems()) {
            Object data[] = {item.getItemName(), item.getItemPrice(), item.getCount(), (item.getItemPrice() * item.getCount())};
            model.addRow(data);
        }


    }//GEN-LAST:event_headerTableMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        // TODO add your handling code here:
        InvoiceHeader header = new InvoiceHeader((handler.getHeader().size() + 1), jTextField2.getText(), jTextField1.getText());
        handler.getHeader().add(header);
        DefaultTableModel model = (DefaultTableModel) headerTable.getModel();
        Object data[] = {header.getNum(), header.getCustomer(), header.getDate()};
        model.addRow(data);
        headerTable.setRowSelectionInterval(handler.getHeader().size()-1, handler.getHeader().size()-1);
        headerTableMouseClicked(null);
        dialogAddInvoice.dispose();


    }//GEN-LAST:event_okBtnActionPerformed

    private void ItemCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemCountActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        InvoiceItem invoiceItem = new InvoiceItem(itemName.getText(), Double.valueOf(itemPrice.getText()), Integer.valueOf(ItemCount.getText()));
        handler.getHeader().get(headerTable.getSelectedRow()).getItems().add(invoiceItem);
        Object data[] = {invoiceItem.getItemName(), invoiceItem.getItemPrice(), invoiceItem.getCount(), (invoiceItem.getItemPrice() * invoiceItem.getCount())};
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        model.addRow(data);
        totalLabel.setText(String.valueOf(handler.getInvoiceTotal(handler.getHeader().get(headerTable.getSelectedRow()))));
        dialogAddItem.dispose();


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dialogAddInvoice.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dialogAddItem.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void itemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemPriceActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveFileActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField ItemCount;
    public static javax.swing.JLabel customerLabel;
    public static javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteInvoiceBtn;
    private javax.swing.JButton deleteItemBtn;
    public static javax.swing.JDialog dialogAddInvoice;
    public static javax.swing.JDialog dialogAddItem;
    public static javax.swing.JTable headerTable;
    public static javax.swing.JLabel invoiceNumberValue;
    public static javax.swing.JTextField itemName;
    public static javax.swing.JTextField itemPrice;
    public static javax.swing.JTable itemTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    private javax.swing.JMenuItem loadFile;
    private javax.swing.JButton newInvoiceBtn;
    private javax.swing.JButton newItemBtn;
    public static javax.swing.JButton okBtn;
    private javax.swing.JMenuItem saveFile;
    public static javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
    private ActionHandler handler = new ActionHandler();

}

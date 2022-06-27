package sig.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sig.model.FileType;
import sig.model.InvoiceHeader;
import sig.model.InvoiceItem;
import sig.view.InvoiceJFrame;
import static sig.view.InvoiceJFrame.itemTable;

public class ActionHandler implements ActionListener {

    ArrayList<InvoiceHeader> header = new ArrayList();
    String headPath, itemsPath;

    public ArrayList<InvoiceHeader> getHeader() {
        return header;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "Add New Invoice":
                addNewInvoice();
                break;
            case "Delete Invoice":
                deleteInvoice();
                break;
            case "Add New Item":
                addNewItem();
                break;
            case "Delete Item":
                deleteItem();
                break;
            case "Load File":
                loadFile();
                break;
            case "Save File":
                saveFile();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid step", "Error Message", JOptionPane.ERROR_MESSAGE);

        }

    }

    private void addNewInvoice() {

    }

    private void deleteInvoice() {

        DefaultTableModel model3 = (DefaultTableModel) InvoiceJFrame.headerTable.getModel();
        if (InvoiceJFrame.headerTable.getSelectedRowCount() == 1) {
            header.remove(InvoiceJFrame.headerTable.getSelectedRow());
            model3.removeRow(InvoiceJFrame.headerTable.getSelectedRow());
            InvoiceJFrame.invoiceNumberValue.setText("");
            InvoiceJFrame.dateLabel.setText("");
            InvoiceJFrame.customerLabel.setText("");
            InvoiceJFrame.totalLabel.setText("");
            DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
            int rows = model.getRowCount();
            for (int i = rows - 1; i >= 0; i--) {
                model.removeRow(i);
            }
        } else {
            if (InvoiceJFrame.headerTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Empty Table", "Error Message", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Please, Select a row to Delete it", "Plain Message", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

    private void addNewItem() {

    }

    private void deleteItem() {
        DefaultTableModel model4 = (DefaultTableModel) InvoiceJFrame.itemTable.getModel();
        if (InvoiceJFrame.itemTable.getSelectedRowCount() == 1) {
            header.get(InvoiceJFrame.headerTable.getSelectedRow()).getItems().remove(InvoiceJFrame.itemTable.getSelectedRow());
            model4.removeRow(InvoiceJFrame.itemTable.getSelectedRow());

        } else {
            if (InvoiceJFrame.itemTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Empty Table", "Error Message", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Please, Select a row to Delete it", "Plain Message", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

    private void loadFile() {
        BufferedReader br = null;
        JFileChooser fc = new JFileChooser();
        JFileChooser fc2 = new JFileChooser();
        int resultHeader = fc.showOpenDialog(null);
        int resultItem = fc2.showOpenDialog(null);

        if (resultHeader == JFileChooser.APPROVE_OPTION) {          // open file chooser to select invoiceHeader.csv
            headPath = fc.getSelectedFile().getPath();
            File f1 = new File(headPath);

            if (resultItem == JFileChooser.APPROVE_OPTION) {        // open file chooser to select invoiceitem.csv
                itemsPath = fc2.getSelectedFile().getPath();
                File f2 = new File(itemsPath);

                try {
                    br = new BufferedReader(new FileReader(f1));                                                // Read csv file
                    DefaultTableModel model = (DefaultTableModel) InvoiceJFrame.headerTable.getModel();
                    Object[] headerTableLines = br.lines().toArray();
                    readCsvFile(FileType.Header, model, headerTableLines);

                    br = new BufferedReader(new FileReader(f2));                                                // Read csv file
                    DefaultTableModel model2 = (DefaultTableModel) InvoiceJFrame.itemTable.getModel();
                    Object[] itemTableLines = br.lines().toArray();
                    readCsvFile(FileType.Items, model2, itemTableLines);

                    try {
                        br.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private void saveFile() {
        
        JFileChooser fc = new JFileChooser();
        JFileChooser fc2 = new JFileChooser();
        int resultHeader = fc.showSaveDialog(null);
        int resultItem = fc2.showSaveDialog(null);
        
        FileWriter csvWriter = null;
        FileWriter csvWriter2 = null;
        
        try {
            csvWriter = new FileWriter(new File(headPath));
            csvWriter2 = new FileWriter(new File(itemsPath));
            for (InvoiceHeader rowData : header) {
                csvWriter.append(String.valueOf(rowData.getNum()));
                csvWriter.append(",");
                csvWriter.append(rowData.getCustomer());
                csvWriter.append(",");
                csvWriter.append(rowData.getDate());
                csvWriter.append("\n");
                for (InvoiceItem item : rowData.getItems()) {
                    csvWriter2.append(String.valueOf(rowData.getNum()));
                    csvWriter2.append(",");
                    csvWriter2.append(item.getItemName());
                    csvWriter2.append(",");
                    csvWriter2.append(String.valueOf(item.getItemPrice()));
                    csvWriter2.append(",");
                    csvWriter2.append(String.valueOf(item.getCount()));
                    csvWriter2.append("\n");
                }
            }
            csvWriter2.flush();
            csvWriter2.close();
            csvWriter.flush();
            csvWriter.close();
            JOptionPane.showMessageDialog(null, "File saved successfully", "Success", JOptionPane.OK_OPTION);

        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "File Failed to save", "Error", JOptionPane.OK_OPTION);

        } finally {
            try {
                csvWriter.close();
                csvWriter2.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public Double getInvoiceTotal(InvoiceHeader header) {
        Double total = 0.0;
        for (InvoiceItem item : header.getItems()) {
            total += item.getItemPrice() * item.getCount();
        }
        return total;
    }

    private Date convertStringToDate(String dateString) {
        try {
            return new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
        } catch (Exception e) {
            return new Date();
        }

    }

    private void readCsvFile(FileType type, DefaultTableModel model, Object[] array) {
        for (Object array1 : array) {
            String[] lines1 = array1.toString().split(",");
            String[] invoiceRows = lines1;
            if (type == FileType.Header) {
                header.add(new InvoiceHeader(                                   // creates new header obj and add it to header arraylist and adding it to model
                        Integer.parseInt(invoiceRows[0]),                       //parse first element (header num to int)
                        invoiceRows[2],                                         //convert string date from sheet to Date type
                        invoiceRows[1]));//
                model.addRow(invoiceRows);

            } else {
                header.get(Integer.parseInt(invoiceRows[0]) - 1).getItems()     //getting header item with item invoice number and adding new item to header item list
                        .add(new InvoiceItem(
                                invoiceRows[1],
                                Double.valueOf(invoiceRows[2]),
                                Integer.valueOf(invoiceRows[3])));
            }
        }
    }
}

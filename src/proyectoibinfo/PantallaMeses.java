/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoibinfo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Carlos Manuel
 */
public class PantallaMeses extends javax.swing.JFrame {

    /**
     * Creates new form PantallaMeses
     */
    TableRowSorter trs;
    public PantallaMeses() {
        initComponents();
         setSize(900,600);
        this.setLocationRelativeTo(null);
        this.setTitle("                                                                      REGISTRO MENSUAL");
        setResizable(false);
        showDate();
    }
    
      void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy    hh:mm a");
        date.setText(s.format(d));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        mesCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtFiltro2 = new java.awt.TextField();
        filtroCBPM = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(66, 134, 244));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date.setText("jLabel1");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel8.setText("///////////////////////////////////////////////////////////////////////");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(date)
                .addGap(163, 163, 163))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Precio", "ID", "Leyenda", "Fecha In", "Fecha Out"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 810, 400));

        mesCB.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        mesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        mesCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesCBActionPerformed(evt);
            }
        });
        jPanel1.add(mesCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 140, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel1.setText("Seleccionar Mes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 30));

        jButton1.setText("ELIMINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, -1, -1));

        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));

        txtFiltro2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtFiltro2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltro2KeyTyped(evt);
            }
        });
        jPanel1.add(txtFiltro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 340, 30));

        filtroCBPM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Precio", "ID", "Leyenda", "Fecha In", "Fecha Out" }));
        jPanel1.add(filtroCBPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 60, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mesCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesCBActionPerformed
        // TODO add your handling code here:
        
        String query = mesCB.getSelectedItem().toString();
        String yt;
        DefaultTableModel modelo = (DefaultTableModel)jTable2.getModel();
        modelo.setRowCount(0);
          
        
      
       
        
        
        if (query == "Enero"){
            yt="enero";
        }
        else if (query == "Febrero"){
            yt="febrero";
        }
        else if (query == "Marzo"){
            yt="marzo";
        }
        else if (query == "Abril"){
            yt="abril";;
        }
         else if (query == "Mayo"){
            yt="mayo";
        }
          else if (query == "Junio"){
            yt="junio";
        }
           else if (query == "Julio"){
            yt="julio";
        }
            else if (query == "Agosto"){
            yt="agosto";
        }
             else if (query == "Septiembre"){
            yt="septiembre";
        }
              else if (query == "Octubre"){
            yt="octubre";
        }
               else if (query == "Noviembre"){
            yt="noviembre";
        }
        else {
           
            yt="diciembre";
        }
          String filePath = "C:\\Users\\Carlos Manuel\\Documents\\NetBeansProjects\\HelpMe\\MESES\\"+yt+".txt";
          File file = new File(filePath);
          String line = null;
          FileReader fr;
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
            Object[] lines = br.lines().toArray();
            
            for(int i= 0; i<lines.length; i++){
                String [] row = lines[i].toString().split(" ");
                
                
                if (row.length>1){
                    model.addRow(row);
                }
                
              
             //   System.out.println(row[1]);
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PantallaMeses.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
     
          
          
         
        
    }//GEN-LAST:event_mesCBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        int i= jTable2.getSelectedRow();
        
        if (i>=0){
           model.removeRow(i);
        }
        else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para eliminar");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void writee (){
         String query = mesCB.getSelectedItem().toString();
        String yt;
        
         if (query == "Enero"){
            yt="enero";
        }
        else if (query == "Febrero"){
            yt="febrero";
        }
        else if (query == "Marzo"){
            yt="marzo";
        }
        else if (query == "Abril"){
            yt="abril";;
        }
         else if (query == "Mayo"){
            yt="mayo";
        }
          else if (query == "Junio"){
            yt="junio";
        }
           else if (query == "Julio"){
            yt="julio";
        }
            else if (query == "Agosto"){
            yt="agosto";
        }
             else if (query == "Septiembre"){
            yt="septiembre";
        }
              else if (query == "Octubre"){
            yt="octubre";
        }
               else if (query == "Noviembre"){
            yt="noviembre";
        }
        else {
           
            yt="diciembre";
        }
        
        int c;
         String filePath = "C:\\Users\\Carlos Manuel\\Documents\\NetBeansProjects\\HelpMe\\MESES\\"+yt+".txt";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0; i<jTable2.getRowCount(); i++){
                for (int j=0; j<jTable2.getColumnCount(); j++){
                    
                    
                    
                    bw.write(jTable2.getValueAt(i,j).toString()+" ");
                    
                   
                }
                bw.newLine();
            }
            
            
            
            bw.close();
            fw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(PantallaRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          int o;   
     o = jTable2.getRowCount();
     if (o==0){
         new Menu().setVisible(true);
         this.dispose();
     }
     else {
     
    int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "¿Estás seguro?", 
                                  "     REGRESAR", 
                                  JOptionPane.YES_NO_OPTION); 
              if (selectedOption == JOptionPane.YES_OPTION) {
  int in;
    
        writee();
        new Menu().setVisible(true);
       this.dispose(); 
    }
              
           
    }
     
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtFiltro2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltro2KeyTyped
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        txtFiltro2.addKeyListener(new KeyAdapter() {
            
            @Override
               public void keyReleased (KeyEvent ke){
               int ty;
        String query = filtroCBPM.getSelectedItem().toString();
        
        if (query == "Precio"){
            ty=0;
        }
        else if (query == "ID"){
            ty=1;
        }
        else if (query == "Leyenda"){
            ty=2;
        }
        else if (query == "Fecha In"){
            ty=3;
        }
        else {
           
            ty=4;
        }
                trs.setRowFilter(RowFilter.regexFilter(txtFiltro2.getText(),ty));
            }
            
        });        
        
        trs = new TableRowSorter(model);
        jTable2.setRowSorter(trs);
    }//GEN-LAST:event_txtFiltro2KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaMeses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaMeses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaMeses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaMeses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaMeses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JComboBox<String> filtroCBPM;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> mesCB;
    private java.awt.TextField txtFiltro2;
    // End of variables declaration//GEN-END:variables
}

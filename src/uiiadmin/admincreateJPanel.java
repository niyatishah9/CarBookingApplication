/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiiadmin;


import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.Car;
import model.CarHistory;

/**
 *
 * @author niyat
 */
public class admincreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form admincreateJPanel
     */
    CarHistory history;
    
    public admincreateJPanel(CarHistory history) {
        initComponents();
        this.history=history;
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtexpirydate = new javax.swing.JTextField();
        txtcarmanufacturer = new javax.swing.JTextField();
        txtmodelno = new javax.swing.JTextField();
        txtmanufactureryear = new javax.swing.JTextField();
        txtserialno = new javax.swing.JTextField();
        txtlocation = new javax.swing.JTextField();
        txtseats = new javax.swing.JTextField();
        txtcolor = new javax.swing.JTextField();
        txtavailability = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lblseats = new javax.swing.JLabel();
        lbllocation = new javax.swing.JLabel();
        lblyear = new javax.swing.JLabel();
        lblavail = new javax.swing.JLabel();
        lblmanufacturer = new javax.swing.JLabel();
        lblmodelno = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblexpiry = new javax.swing.JLabel();
        lblserialno = new javax.swing.JLabel();
        lblcolor = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1084, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        lblTitle.setBackground(new java.awt.Color(204, 204, 255));
        lblTitle.setFont(new java.awt.Font("Californian FB", 3, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ADD NEW CAR DETAILS");

        btnAdd.setBackground(new java.awt.Color(204, 204, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 153, 255));

        txtmanufactureryear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmanufactureryearActionPerformed(evt);
            }
        });

        txtserialno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtserialnoActionPerformed(evt);
            }
        });

        txtavailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtavailabilityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtavailability, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtexpirydate, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtseats, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmodelno, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmanufactureryear, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcarmanufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtserialno, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtserialno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtcarmanufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtmanufactureryear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtmodelno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtseats, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtexpirydate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtavailability, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtName, txtavailability, txtcarmanufacturer, txtexpirydate, txtlocation, txtmanufactureryear, txtmodelno, txtseats, txtserialno});

        jPanel4.setBackground(new java.awt.Color(255, 153, 255));

        lblseats.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblseats.setText("NUMBER OF SEATS :");

        lbllocation.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbllocation.setText("CAR LOCATION :");

        lblyear.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblyear.setText("CAR MANUFACTURING YEAR :");

        lblavail.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblavail.setText("CAR AVAILABILITY :");

        lblmanufacturer.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblmanufacturer.setText("CAR MANUFACTURER :");

        lblmodelno.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblmodelno.setText("CAR MODEL NUMBER :");

        lblname.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblname.setText("CAR NAME :");

        lblexpiry.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblexpiry.setText("MAINTENANCE CERTIFICATE EXPIRY DATE :");

        lblserialno.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblserialno.setText("CAR SERIAL NUMBER :");

        lblcolor.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblcolor.setText("CAR COLOR:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblseats, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmanufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblserialno, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblyear, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmodelno, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblavail, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllocation, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblexpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblserialno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblmanufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblyear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblmodelno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblseats, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblexpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblavail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lbllocation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(423, 423, 423))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(304, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        
        
      
        
        Car cr = history.addnewcars();
        
      
                  
                    
       if(!txtmodelno.getText().isEmpty()){
             String regex = "^[0-9]{1,5}$";
              if(txtmodelno.getText().matches(regex)){
                   cr.setModel_no(Integer.parseInt(txtmodelno.getText()));       
              }
              else{
                JOptionPane.showMessageDialog(this, " Invalid Model Number");
            }
        }
         if(!txtserialno.getText().isEmpty()){
             String regex = "^[0-9]{1,5}$";
              if(txtmodelno.getText().matches(regex)){
                   cr.setSerialnumber(Integer.parseInt(txtmodelno.getText()));       
              }
              else{
                JOptionPane.showMessageDialog(this, " Invalid Serial Number");
            }
        }
         
          if(!txtexpirydate.getText().isEmpty()){
             String regex = "(\\d{4})";
              if(txtexpirydate.getText().matches(regex)){
                   cr.setMaintenancecertificate_date(Integer.parseInt(txtexpirydate.getText()));       
              }
              else{
                JOptionPane.showMessageDialog(this, " Invalid Certificate Date");
            }
        }
         
     
         
       
       
       
       
            cr.setSerialnumber(Integer.parseInt(txtserialno.getText()));
          cr.setCar_name((txtName.getText()));
            cr.setCar_manufacturer((txtcarmanufacturer.getText()));
            cr.setManufactureryear((txtmanufactureryear.getText()));
             cr.setModel_no(Integer.parseInt(txtmodelno.getText()));
             cr.setAvailability((txtavailability.getText()));
               cr.setCar_location((txtlocation.getText()));
               cr.setNo_seats(txtseats.getText());
                 cr.setMaintenancecertificate_date(Integer.parseInt(txtexpirydate.getText()));
                  cr.setColor((txtcolor.getText()));
                 
                 
                 
                  if(txtserialno.getText()!=null||txtName.getText()!=null||txtcarmanufacturer.getText()!=null||txtmanufactureryear.getText()!=null
                ||txtmodelno.getText()!=null||txtlocation.getText()!=null||txtseats.getText()!=null||txtexpirydate.getText()!=null||txtcolor.getText()!=null) {
        
             JOptionPane.showMessageDialog(this,"New Car Added." );
        } 
        
        else {
            JOptionPane.showMessageDialog(this, "ALL Fields Required");
        }
                 
                 txtName.setText("");
                 txtavailability.setText("");
                 txtcarmanufacturer.setText("");
                 txtexpirydate.setText("");
                 txtlocation.setText("");
                 txtmanufactureryear.setText("");
                 txtmodelno.setText("");
                 txtserialno.setText("");
                 txtseats.setText("");
                 txtcolor.setText("");
                 
            
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtmanufactureryearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmanufactureryearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmanufactureryearActionPerformed

    private void txtserialnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtserialnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtserialnoActionPerformed

    private void txtavailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtavailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtavailabilityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblavail;
    private javax.swing.JLabel lblcolor;
    private javax.swing.JLabel lblexpiry;
    private javax.swing.JLabel lbllocation;
    private javax.swing.JLabel lblmanufacturer;
    private javax.swing.JLabel lblmodelno;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblseats;
    private javax.swing.JLabel lblserialno;
    private javax.swing.JLabel lblyear;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtavailability;
    private javax.swing.JTextField txtcarmanufacturer;
    private javax.swing.JTextField txtcolor;
    private javax.swing.JTextField txtexpirydate;
    private javax.swing.JTextField txtlocation;
    private javax.swing.JTextField txtmanufactureryear;
    private javax.swing.JTextField txtmodelno;
    private javax.swing.JTextField txtseats;
    private javax.swing.JTextField txtserialno;
    // End of variables declaration//GEN-END:variables


}



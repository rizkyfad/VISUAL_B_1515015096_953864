package Posttest1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DADANG
 */
public class suhu extends javax.swing.JFrame {
    float c,f,k,r,cel,rem,kel,far;

    /**
     * Creates new form suhu
     */
    public suhu() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelsuhu = new javax.swing.JLabel();
        txtsuhu = new javax.swing.JTextField();
        celcius = new javax.swing.JRadioButton();
        kelvin = new javax.swing.JRadioButton();
        farenheit = new javax.swing.JRadioButton();
        konversi = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        labelcls = new javax.swing.JLabel();
        labelkel = new javax.swing.JLabel();
        labelfar = new javax.swing.JLabel();
        txtcelcius = new javax.swing.JTextField();
        txtkelvin = new javax.swing.JTextField();
        txtfarenheit = new javax.swing.JTextField();
        reamur = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtreamur = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jLabel1.setText("KONVERSI SUHU");

        labelsuhu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelsuhu.setText("SUHU AWAL");

        txtsuhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsuhuActionPerformed(evt);
            }
        });

        celcius.setBackground(new java.awt.Color(102, 153, 255));
        buttonGroup1.add(celcius);
        celcius.setText("Celcius");
        celcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celciusActionPerformed(evt);
            }
        });

        kelvin.setBackground(new java.awt.Color(102, 153, 255));
        buttonGroup1.add(kelvin);
        kelvin.setText("Kelvin");
        kelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelvinActionPerformed(evt);
            }
        });

        farenheit.setBackground(new java.awt.Color(102, 153, 255));
        buttonGroup1.add(farenheit);
        farenheit.setText("Farenheit");
        farenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farenheitActionPerformed(evt);
            }
        });

        konversi.setBackground(new java.awt.Color(255, 51, 153));
        konversi.setText("Konversi");
        konversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversiActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 51, 153));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        keluar.setBackground(new java.awt.Color(255, 51, 153));
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        labelcls.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelcls.setText("Celcius");

        labelkel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelkel.setText("Kelvin");

        labelfar.setText("Farenheit");

        txtcelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelciusActionPerformed(evt);
            }
        });

        reamur.setBackground(new java.awt.Color(102, 153, 255));
        buttonGroup1.add(reamur);
        reamur.setText("Reamur");
        reamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reamurActionPerformed(evt);
            }
        });

        jLabel2.setText("Reamur");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelsuhu)
                    .addComponent(labelcls)
                    .addComponent(labelkel)
                    .addComponent(labelfar)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtsuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(konversi))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(celcius)
                        .addGap(18, 18, 18)
                        .addComponent(kelvin)
                        .addGap(18, 18, 18)
                        .addComponent(farenheit)
                        .addGap(18, 18, 18)
                        .addComponent(reamur))
                    .addComponent(txtcelcius, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtkelvin, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfarenheit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtreamur))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(keluar)
                        .addGap(174, 174, 174))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(konversi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelsuhu)
                        .addComponent(txtsuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reamur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(celcius)
                        .addComponent(kelvin)
                        .addComponent(farenheit)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcelcius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelcls))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelkel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfarenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelfar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtreamur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keluar)
                    .addComponent(reset))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsuhuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsuhuActionPerformed

    private void celciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celciusActionPerformed
        // TODO add your handling code here:
        if(celcius.isSelected())
        {
            c = Float.parseFloat(txtsuhu.getText());
            rem = (4/5)*c;
            cel = c;
            far = ((9/5)*c)+32;
            kel = c+273;
        }
        
        
    }//GEN-LAST:event_celciusActionPerformed

    private void kelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelvinActionPerformed
        // TODO add your handling code here:
        if(kelvin.isSelected())
        {
            k = Float.parseFloat(txtsuhu.getText());
            far = ((9/5)*(k-273))+32;
            cel = k-273;
            kel = k;
            rem = (4/5)*(k-273);
        }
    }//GEN-LAST:event_kelvinActionPerformed

    private void farenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farenheitActionPerformed
        // TODO add your handling code here:
        if(farenheit.isSelected())
        {
            f = Float.parseFloat(txtsuhu.getText());
            cel =((f-32)*5)/9;
            rem =((f-32)*4)/9;
            kel = (((f-32)*5)/9)+273;
            far = f;
        }
    }//GEN-LAST:event_farenheitActionPerformed

    private void reamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reamurActionPerformed
        // TODO add your handling code here:
        if(reamur.isSelected())
        {
            r = Float.parseFloat(txtsuhu.getText());
            rem = r;
            cel = (5/4)*r;
            far = ((9/4)*r)+32;
            kel = ((5/4)*r)+273;
        }
    }//GEN-LAST:event_reamurActionPerformed

    private void konversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversiActionPerformed
        // TODO add your handling code here:
        txtcelcius.setText(Float.toString(cel));
        txtfarenheit.setText(Float.toString(far));
        txtkelvin.setText(Float.toString(kel));
        txtreamur.setText(Float.toString(rem));
        
    }//GEN-LAST:event_konversiActionPerformed

    private void txtcelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelciusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelciusActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        txtsuhu.setText("");
        txtcelcius.setText("");
        txtkelvin.setText("");
        txtfarenheit.setText("");
        txtreamur.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton celcius;
    private javax.swing.JRadioButton farenheit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton keluar;
    private javax.swing.JRadioButton kelvin;
    private javax.swing.JButton konversi;
    private javax.swing.JLabel labelcls;
    private javax.swing.JLabel labelfar;
    private javax.swing.JLabel labelkel;
    private javax.swing.JLabel labelsuhu;
    private javax.swing.JRadioButton reamur;
    private javax.swing.JButton reset;
    private javax.swing.JTextField txtcelcius;
    private javax.swing.JTextField txtfarenheit;
    private javax.swing.JTextField txtkelvin;
    private javax.swing.JTextField txtreamur;
    private javax.swing.JTextField txtsuhu;
    // End of variables declaration//GEN-END:variables
}


import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 24DD018LA
 */
public class formulario extends javax.swing.JFrame {

    /**
     * Creates new form formulario
     */
    public formulario() {
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

        lbl_correo = new javax.swing.JLabel();
        lbl_sitio = new javax.swing.JLabel();
        lbl_tarjeta = new javax.swing.JLabel();
        txt_sitio = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_tarjeta = new javax.swing.JTextField();
        lbl_aviso1 = new javax.swing.JLabel();
        lbl_aviso2 = new javax.swing.JLabel();
        lbl_aviso3 = new javax.swing.JLabel();
        btn_evaluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_correo.setText("Correo Electronico");

        lbl_sitio.setText("Sitio Web");

        lbl_tarjeta.setText("Tarjets");

        lbl_aviso1.setForeground(new java.awt.Color(255, 0, 0));
        lbl_aviso1.setText("CAMPO VACIO");

        lbl_aviso2.setForeground(new java.awt.Color(204, 0, 0));
        lbl_aviso2.setText("CAMPO VACIO");

        lbl_aviso3.setForeground(new java.awt.Color(204, 0, 0));
        lbl_aviso3.setText("CAMPO VACIO");

        btn_evaluar.setText("EVALUAR");
        btn_evaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_evaluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_correo)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_sitio)
                            .addComponent(lbl_tarjeta))
                        .addGap(76, 76, 76)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_sitio, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(txt_correo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_aviso2)
                                .addGap(59, 59, 59)
                                .addComponent(btn_evaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_aviso1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_tarjeta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_aviso3)
                        .addGap(182, 182, 182)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_correo)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_aviso1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_aviso2)
                            .addComponent(btn_evaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_sitio)
                            .addComponent(txt_sitio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_aviso3)
                    .addComponent(lbl_tarjeta))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_evaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_evaluarActionPerformed
        // TODO add your handling code here:
        lbl_aviso1.setVisible(false);
        lbl_aviso2.setVisible(false);
        lbl_aviso3.setVisible(false);
        int validacion = 0;
        String correo = txt_correo.getText().trim();
        String sitio_web = txt_sitio.getText().trim();
        String tarjeta = txt_tarjeta.getText().trim();
        Pattern patron1 = Pattern.compile("[a-z,0-9,_,-]%@[a-z,0-9,_,-]%.[a-z][a-z]%"); //correo
       Matcher coincidir1 = patron1.matcher(correo);
        Pattern patron2 = Pattern.compile("[w][w][w][.]%[.]%"); //expresion deL sitio web
        Matcher coincidir2 = patron2.matcher(sitio_web);
           Pattern patron3 = Pattern.compile("[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]"); //expresion de la tarjeta 
        Matcher coincidir3 = patron3.matcher(tarjeta);
       if(txt_correo.getText().trim().isEmpty() && coincidir1.find() == false){
            JOptionPane.showMessageDialog(null,"EL CORREO ELECTRONICO NO ES VALIDO");
            lbl_aviso1.setVisible(true);
        }else {
             JOptionPane.showMessageDialog(null,"EL CORREO ELECTRONICO ES VALIDO");
             lbl_aviso1.setVisible(false);
        }
            if(txt_sitio.getText().trim().isEmpty() && coincidir2.find() == false){
            JOptionPane.showMessageDialog(null,"EL SITIO WEB NO ES VALIDO");
            lbl_aviso2.setVisible(true);
        }  else {
             JOptionPane.showMessageDialog(null,"EL SITIO WEB ES VALIDO");
             lbl_aviso2.setVisible(false);
        }
              if(txt_tarjeta.getText().trim().isEmpty() && coincidir3.find() == false){
            JOptionPane.showMessageDialog(null,"LA TARJETA NO ES VALIDA");
            lbl_aviso3.setVisible(true);
        }else {
             JOptionPane.showMessageDialog(null,"LA TARJETA ES VALIDA");
               lbl_aviso3.setVisible(false);
        }
           if(correo.equals("")){
           txt_correo.setBackground(Color.red);
           validacion++;
       }
        if(sitio_web.equals("")){
              txt_sitio.setBackground(Color.red);
              validacion++;
          }
         if(tarjeta.equals("")){
              txt_tarjeta.setBackground(Color.red);
              validacion++;
          } 
    }//GEN-LAST:event_btn_evaluarActionPerformed

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
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_evaluar;
    private javax.swing.JLabel lbl_aviso1;
    private javax.swing.JLabel lbl_aviso2;
    private javax.swing.JLabel lbl_aviso3;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_sitio;
    private javax.swing.JLabel lbl_tarjeta;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_sitio;
    private javax.swing.JTextField txt_tarjeta;
    // End of variables declaration//GEN-END:variables
}

import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jimmy
 */
public class Inter extends javax.swing.JFrame {

    /**
     * Creates new form Inter
     */
    private String nveces;
    private String tiemp;
    private String quant;
    private String dist;
    public Inter() {
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

        veces = new javax.swing.JLabel();
        quantum = new javax.swing.JLabel();
        tiempo = new javax.swing.JLabel();
        textVeces = new javax.swing.JTextField();
        textQu = new javax.swing.JTextField();
        textSeg = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        quantum1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        reloj = new javax.swing.JLabel();
        eve = new javax.swing.JLabel();
        estProc = new javax.swing.JLabel();
        estES = new javax.swing.JLabel();
        colaCPU = new javax.swing.JLabel();
        colaES = new javax.swing.JLabel();
        progFin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulación I.O");
        setLocationByPlatform(true);
        setName("frame"); // NOI18N

        veces.setText("Número de veces:");

        quantum.setText("Quantum:");

        tiempo.setText("Tiempo en segundos");

        textVeces.setName("textVec"); // NOI18N

        textQu.setName("textQu"); // NOI18N

        textSeg.setName("textSeg"); // NOI18N
        textSeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSegActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Exponencial", "Normal" }));
        jComboBox1.setName("combDist"); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        quantum1.setText("Distribución");

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        reloj.setText("Reloj: ");
        reloj.setName("reloj"); // NOI18N

        eve.setText("Evento: ");
        eve.setName("eve"); // NOI18N

        estProc.setText("Estado Procesador:");
        estProc.setName("proc"); // NOI18N

        estES.setText("Estado Disp E/S:");
        estES.setName("es"); // NOI18N

        colaCPU.setText("# prog en cola CPU:");
        colaCPU.setName("colaCPU"); // NOI18N

        colaES.setText("# prog en cola E/S:");
        colaES.setName("colaES"); // NOI18N

        progFin.setText("# prog que han salido:");
        progFin.setName("progTermi"); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reloj)
                    .addComponent(eve)
                    .addComponent(estProc)
                    .addComponent(estES)
                    .addComponent(colaCPU)
                    .addComponent(colaES)
                    .addComponent(progFin))
                .addContainerGap(494, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reloj)
                .addGap(12, 12, 12)
                .addComponent(eve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(estProc)
                .addGap(12, 12, 12)
                .addComponent(estES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colaCPU)
                .addGap(12, 12, 12)
                .addComponent(colaES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(progFin)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tiempo)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(textSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(veces)
                            .addComponent(textVeces, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantum)
                            .addComponent(textQu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiempo)
                    .addComponent(veces)
                    .addComponent(quantum)
                    .addComponent(quantum1))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textVeces, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textQu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textSegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSegActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!"".equals(textVeces.getText()) && !"".equals(textQu.getText()) 
                && !"".equals(textSeg.getText()) && jComboBox1.getSelectedItem() != "Seleccione" ){
            nveces = textVeces.getText();
            tiemp = textSeg.getText();
            quant = textQu.getText();
            dist = jComboBox1.getSelectedItem().toString();
            
            //empieza simulacion
            reloj.setText("Reloj: algo");
            
            /*try{
            TimeUnit.SECONDS.sleep(5);
            } catch(Exception e){}*/
            //panel.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Simulación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colaCPU;
    private javax.swing.JLabel colaES;
    private javax.swing.JLabel estES;
    private javax.swing.JLabel estProc;
    private javax.swing.JLabel eve;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel progFin;
    private javax.swing.JLabel quantum;
    private javax.swing.JLabel quantum1;
    private javax.swing.JLabel reloj;
    private javax.swing.JTextField textQu;
    private javax.swing.JTextField textSeg;
    private javax.swing.JTextField textVeces;
    private javax.swing.JLabel tiempo;
    private javax.swing.JLabel veces;
    // End of variables declaration//GEN-END:variables
}
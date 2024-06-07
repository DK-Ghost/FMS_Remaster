package Simulador;

import java.awt.Color;

public class EstacionesPanel extends javax.swing.JFrame {
    
    boolean cortadoraEstado;

    public EstacionesPanel() {
        initComponents();
        this.cortadoraEstado = true;
    }
    
    public void setEstadoCortadora(boolean libre){
        this.cortadoraEstado = libre;
        if (libre) {
            this.estCortadoraPanel.setBackground(new Color(0,204,0));
        } else{
            this.estCortadoraPanel.setBackground(new Color(204,51,0));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas = new javax.swing.JPanel();
        estCortadoraPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCortando = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.darkShadow"));
        setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));

        canvas.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));

        estCortadoraPanel.setBackground(new java.awt.Color(0, 204, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Cortadora");

        javax.swing.GroupLayout estCortadoraPanelLayout = new javax.swing.GroupLayout(estCortadoraPanel);
        estCortadoraPanel.setLayout(estCortadoraPanelLayout);
        estCortadoraPanelLayout.setHorizontalGroup(
            estCortadoraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estCortadoraPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        estCortadoraPanelLayout.setVerticalGroup(
            estCortadoraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estCortadoraPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnCortando.setText("cortando");
        btnCortando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortandoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(canvasLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(estCortadoraPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(btnCortando)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(canvasLayout.createSequentialGroup()
                .addGroup(canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(canvasLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(estCortadoraPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(canvasLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnCortando)))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCortandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortandoActionPerformed
        setEstadoCortadora(!this.cortadoraEstado);
    }//GEN-LAST:event_btnCortandoActionPerformed

 
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EstacionesPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstacionesPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstacionesPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstacionesPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstacionesPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCortando;
    private javax.swing.JPanel canvas;
    private javax.swing.JPanel estCortadoraPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
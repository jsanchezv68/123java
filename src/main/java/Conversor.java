
package convertidor;

public class Conversor extends javax.swing.JFrame {
    
    double Valor;

    public Conversor() {
        initComponents();
        this.setTitle("Convertidor de Divisas ");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        divisa = new javax.swing.JComboBox<>();
        divisa1 = new javax.swing.JComboBox<>();
        Cantidad = new javax.swing.JTextField();
        convertidor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 3, 12)); // NOI18N
        jLabel1.setText("Introduce importe:");

        jLabel2.setFont(new java.awt.Font("Bodoni MT Black", 3, 12)); // NOI18N
        jLabel2.setText("Convertir a:");

        divisa.setFont(new java.awt.Font("Bodoni MT Black", 1, 12)); // NOI18N
        divisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "GTQ", "PESO MX" }));
        divisa.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        divisa.setName(""); // NOI18N
        divisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisaActionPerformed(evt);
            }
        });

        divisa1.setFont(new java.awt.Font("Bodoni MT Black", 1, 12)); // NOI18N
        divisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "GTQ", "PESO MX" }));
        divisa1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        divisa1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        divisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisa1ActionPerformed(evt);
            }
        });

        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });

        convertidor.setFont(new java.awt.Font("Bodoni MT Black", 3, 12)); // NOI18N
        convertidor.setText("Convertir");
        convertidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertidorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bodoni MT Condensed", 3, 24)); // NOI18N
        jLabel3.setText("Resultado:");

        resultado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resultado.setBorder(null);
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(divisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(convertidor))
                        .addGap(89, 89, 89))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertidor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertidorActionPerformed
    
        Valor = Double.parseDouble(Cantidad.getText());
        int divisa2 = divisa.getSelectedIndex();
        int divisa3 = divisa1.getSelectedIndex();
        
        
        Divisas puente = new Divisas();
        
        puente.setValor(Valor);
        puente.setDivisa2(divisa2);
        puente.setDivisa3(divisa3);
        
        float resultadofinal = puente.convertir();
        
        resultado.setText(" ");        
        
        resultado.setText(""+resultadofinal);
        
    }//GEN-LAST:event_convertidorActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
      
    }//GEN-LAST:event_CantidadActionPerformed

    private void divisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisaActionPerformed
      
    }//GEN-LAST:event_divisaActionPerformed

    private void divisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisa1ActionPerformed
        
    }//GEN-LAST:event_divisa1ActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
       
    }//GEN-LAST:event_resultadoActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cantidad;
    private javax.swing.JButton convertidor;
    private javax.swing.JComboBox<String> divisa;
    private javax.swing.JComboBox<String> divisa1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}

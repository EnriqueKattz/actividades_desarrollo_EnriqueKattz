package com.mycompany.proyecto;

import javax.swing.JOptionPane;

public class Sistema extends javax.swing.JFrame {
    
    private String nombre, tipo, cantidad, proveedor, sucursal, sucursal1, sucursal2, sucursal3;
    private int cantidadInt1;
    boolean datos = false;
    
    public Sistema() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesProveedor = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        prodcutoLabel = new javax.swing.JLabel();
        tipoLabel = new javax.swing.JLabel();
        CantidadLabel = new javax.swing.JLabel();
        proveedorLabel = new javax.swing.JLabel();
        sucursalLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        tipoComboBox = new javax.swing.JComboBox<>();
        cantidadTextField = new javax.swing.JTextField();
        skullCandyRadioButton = new javax.swing.JRadioButton();
        beatsRadioButton = new javax.swing.JRadioButton();
        sonyRadioButton = new javax.swing.JRadioButton();
        minatitlanCheckBox = new javax.swing.JCheckBox();
        coatzacoalcosCheckBox = new javax.swing.JCheckBox();
        cosoleacaqueCheckBox = new javax.swing.JCheckBox();
        eliminarButton = new javax.swing.JButton();
        continuarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("SISTEMA DE PEDIDOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1)
                .addContainerGap(497, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        prodcutoLabel.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        prodcutoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prodcutoLabel.setText("Nombre del producto");

        tipoLabel.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        tipoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipoLabel.setText("Tipo de producto");

        CantidadLabel.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        CantidadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CantidadLabel.setText("Cantidad");

        proveedorLabel.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        proveedorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proveedorLabel.setText("Seleccione el proveedor");

        sucursalLabel.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        sucursalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sucursalLabel.setText("Seleccione la sucursal");

        nombreTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        tipoComboBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tipoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar una opción", "Deportivos", "Gaming", "Diadema", " " }));

        cantidadTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        skullCandyRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        botonesProveedor.add(skullCandyRadioButton);
        skullCandyRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        skullCandyRadioButton.setText("SkullCandy");

        beatsRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        botonesProveedor.add(beatsRadioButton);
        beatsRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        beatsRadioButton.setText("Beats");

        sonyRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        botonesProveedor.add(sonyRadioButton);
        sonyRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sonyRadioButton.setText("Sony");

        minatitlanCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        minatitlanCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        minatitlanCheckBox.setText("Minatitlán");

        coatzacoalcosCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        coatzacoalcosCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        coatzacoalcosCheckBox.setText("Coatzacoalcos");

        cosoleacaqueCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        cosoleacaqueCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cosoleacaqueCheckBox.setText("Cosoleacaque");

        eliminarButton.setBackground(new java.awt.Color(255, 0, 0));
        eliminarButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        eliminarButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        continuarButton.setBackground(new java.awt.Color(255, 0, 0));
        continuarButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        continuarButton.setForeground(new java.awt.Color(255, 255, 255));
        continuarButton.setText("Continuar");
        continuarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(proveedorLabel)
                        .addGap(61, 61, 61)
                        .addComponent(sucursalLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreTextField)
                            .addComponent(prodcutoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(tipoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CantidadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantidadTextField)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beatsRadioButton)
                            .addComponent(sonyRadioButton)
                            .addComponent(skullCandyRadioButton))
                        .addGap(264, 264, 264)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(coatzacoalcosCheckBox)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(minatitlanCheckBox)
                                    .addComponent(cosoleacaqueCheckBox)))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(eliminarButton)
                        .addGap(77, 77, 77)
                        .addComponent(continuarButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(prodcutoLabel)
                .addGap(18, 18, 18)
                .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(tipoLabel)
                .addGap(18, 18, 18)
                .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(CantidadLabel)
                .addGap(18, 18, 18)
                .addComponent(cantidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proveedorLabel)
                    .addComponent(sucursalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(skullCandyRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(beatsRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sonyRadioButton))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(minatitlanCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(coatzacoalcosCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(cosoleacaqueCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarButton)
                    .addComponent(continuarButton))
                .addGap(14, 14, 14))
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        nombreTextField.setText("");
        tipoComboBox.setSelectedItem("Seleccionar una opción");
        cantidadTextField.setText("");
        botonesProveedor.clearSelection();
        minatitlanCheckBox.setSelected(false);
        cosoleacaqueCheckBox.setSelected(false);
        coatzacoalcosCheckBox.setSelected(false);
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void continuarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarButtonActionPerformed
        nombre = nombreTextField.getText();
        if(tipoComboBox.getSelectedItem().toString().equals("Deportivos")){
            tipo = "Deportivos";
        }else if(tipoComboBox.getSelectedItem().toString().equals("Gaming")){
            tipo = "Gaming";
        }else{
            tipo = "Diadema";
        }
        cantidad = cantidadTextField.getText();
        try{
            int cantidadInt = Integer.parseInt(cantidad);
            cantidadInt1 = cantidadInt;
        }catch(Exception e){
            System.out.println("No hay numero para convertir");
        }
        if(beatsRadioButton.isSelected()){
            proveedor = "Beats";
        }else if(sonyRadioButton.isSelected()){
            proveedor = "Sony";
        }else{
            proveedor = "SkullCandy";
        }
        
        if(minatitlanCheckBox.isSelected()){          
            sucursal1 = "Minatitlan ";
        } 
        if(cosoleacaqueCheckBox.isSelected()){
            sucursal2 = " Cosoleacaque ";
        }
        if(coatzacoalcosCheckBox.isSelected()){
            sucursal3 = "Coatzacoalcos";
        }
        if(sucursal1 == null){
            sucursal1 = "";
        }
        if(sucursal2 == null){
            sucursal2 = "";
        }
        if(sucursal3 == null){
            sucursal3 = "";
        }
        sucursal = sucursal1 + sucursal2 + sucursal3;
        
        corroborarDatos();
        
        if(datos == true){
            int respuesta = JOptionPane.showConfirmDialog(this, "RESUMEN DE DATOS:"
                    + "\nNOMBRE DEL PRODUCTO: " + nombre
                    + "\nTIPO DE PRODUCTO: " + tipo
                    + "\nCANTIDAD DE PRODUCTO: " + cantidadInt1
                    + "\nPROVEEDOR DEL PRODUCTO: " + proveedor
                    + "\nSUCURSAL DEL PRODUCTO: " + sucursal
                    + "\nSeleccione OK para confirmar el pedido y CANCEL para cancelar el pedido"
                    , "DATOS ELEGIDOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);             
            System.out.println(respuesta);
            if(respuesta == 0){
                int respuesta2 = JOptionPane.showConfirmDialog(this, "SU PEDIDO SE HA REALIZADO CON ÉXITO"
                    , "PEDIDO EXITOSO", JOptionPane.CLOSED_OPTION, JOptionPane.QUESTION_MESSAGE); 
                if(respuesta2 != -1){
                    System.exit(0);
                }
            }else{
                System.exit(0);
            }
        }else{
            JOptionPane.showMessageDialog(this, "DEBE COMPLETAR TODOS LOS CAMPOS", "CAMPOS INCOMPLETOS", JOptionPane.OK_OPTION);      
        }
    }//GEN-LAST:event_continuarButtonActionPerformed

    public void corroborarDatos(){
        if(nombre.isEmpty()){
           datos = false;
        }else{
           datos = true;
        }  
        if(tipoComboBox.getSelectedItem().toString().equals("Seleccione una opción")){
           datos = false;
        }else{
            datos = true;
        }
        if(cantidad.isEmpty() || cantidadInt1 == 0){
           datos = false;
        }else {
            datos = true;
        }
        if(!(beatsRadioButton.isSelected())){
           datos = false;
        }else{
            datos = true;
        }        
        if(!(sonyRadioButton.isSelected())){
           datos = false;
        }else{
            datos = true;
        }             
        if(!(skullCandyRadioButton.isSelected())){
           datos = false;
        }else{
            datos = true;
        }         
        if(sucursal.isEmpty()){
           datos = false;
        }else{
            datos = true;
        }  
    }
    
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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CantidadLabel;
    private javax.swing.JRadioButton beatsRadioButton;
    private javax.swing.ButtonGroup botonesProveedor;
    private javax.swing.JTextField cantidadTextField;
    private javax.swing.JCheckBox coatzacoalcosCheckBox;
    private javax.swing.JButton continuarButton;
    private javax.swing.JCheckBox cosoleacaqueCheckBox;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JCheckBox minatitlanCheckBox;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel prodcutoLabel;
    private javax.swing.JLabel proveedorLabel;
    private javax.swing.JRadioButton skullCandyRadioButton;
    private javax.swing.JRadioButton sonyRadioButton;
    private javax.swing.JLabel sucursalLabel;
    private javax.swing.JComboBox<String> tipoComboBox;
    private javax.swing.JLabel tipoLabel;
    // End of variables declaration//GEN-END:variables
}

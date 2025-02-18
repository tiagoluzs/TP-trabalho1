
package br.pucrs.tp;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Catalogo extends javax.swing.JFrame {
    
    public static ArrayList<Veiculo> veiculos;
    
    /**
     * Creates new form Main
     */
    public Catalogo() {
        this.setTitle("Trabalho Técnicas de Programação");
        initComponents();
        center();
        veiculos = new ArrayList<>();
    }
    
    void center() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Marca", "Modelo", "Placa", "Cor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jToolBar1.setRollover(true);

        jButton1.setText("Novo veículo");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setText("Carregar veículos");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton4.setText("Limpar");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Motos", "Carros", "Bicicletas", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jComboBox1);

        jButton3.setText("Filtrar");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton5.setText("Sobre");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        carregar();
    }//GEN-LAST:event_jButton2ActionPerformed

    void carregar() {
        veiculos.clear();
        
        veiculos.add(new Moto("Yamaha", "CBX-100", "Branca", "PLA-1232"));
        veiculos.add(new Moto("Yamaha", "CBX-150", "Preta", "XXS-1232"));
        veiculos.add(new Moto("Yamaha", "CBX-200", "Branca", "ABC-1232"));
        veiculos.add(new Moto("Yamaha", "CBX-250", "Branca", "CNN-1233"));
        veiculos.add(new Moto("Yamaha", "CBX-100", "Branca", "NBC-1235"));
        veiculos.add(new Moto("Yamaha", "CBX-100", "Branca", "ABC-4123"));
        veiculos.add(new Moto("Yamaha", "CBX-100", "Branca", "KWA-5123"));
        
        veiculos.add(new Bicicleta("Caloi", "Caloi 10", "Branca"));
        veiculos.add(new Bicicleta("Monark", "Morark BMX", "Preta"));
        veiculos.add(new Bicicleta("TREK", "Émonda SLR 7", "Vermelha"));
        veiculos.add(new Bicicleta("TREK", "Émonda SLR 6", "Azul"));
        veiculos.add(new Bicicleta("Caloi", "Caloi 10", "Prata"));
        
        veiculos.add(new Carro("Mitsubishi", "ASX", "Prata","VLX-9312"));
        veiculos.add(new Carro("GM Chevrolet", "Cruise", "Branco","VLX-9312"));
        veiculos.add(new Carro("Honda", "Civic", "Preto","VLX-9312"));
        veiculos.add(new Carro("Toyota", "Corolla", "Vermelho","VLX-9312"));
        veiculos.add(new Carro("Toyota", "Prius", "Azul","VLX-9312"));
        veiculos.add(new Carro("Toyota", "Ethios", "Verde","VLX-9312"));
        veiculos.add(new Carro("Honda", "City", "Branco","VLX-9312"));
        veiculos.add(new Carro("Honda", "Fit", "Prata","VLX-9312"));
        veiculos.add(new Carro("Honda", "CRV", "Branco","VLX-9312"));
        veiculos.add(new Carro("Honda", "WRV", "Branco","VLX-9312"));
        this.filtrar();
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        veiculos.clear();
        filtrar();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        this.filtrar();
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    void filtrar() {
        String selected = jComboBox1.getSelectedItem().toString();
        
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Tipo");
        model.addColumn("Marca");
        model.addColumn("Modelo");
        model.addColumn("Placa");
        model.addColumn("Cor");
        
        for(Veiculo v : veiculos) {
            if(selected.equals("") || selected.equals("Todos") || (selected.equals("Motos") && v instanceof Moto) || 
                    (selected.equals("Carros") && v instanceof Carro) || 
                    (selected.equals("Bicicletas") && v instanceof Bicicleta) ) {
                
                model.addRow(new Object[] {v.getTipo(),v.getMarca(),v.getModelo(),v.getPlaca(), v.getCor()} );
            }
        }
        
        jTable1.setModel(model);
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Sobre s = new Sobre();
        s.setAlwaysOnTop(true);
        s.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Novo n = new Novo();
        n.setParent(this);
        n.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void addVeiculo(Veiculo v) {
        veiculos.add(v);
        this.filtrar();
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
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}

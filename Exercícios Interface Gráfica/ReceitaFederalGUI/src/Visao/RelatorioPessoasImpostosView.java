/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao;

import Modelo.Pessoa;

/**
 *
 * @author warml
 */
public class RelatorioPessoasImpostosView extends javax.swing.JFrame {

    private SistemaReceitaFederalView sistemaReceitaView;
    /**
     * Creates new form RelatorioPessoasImpostosView
     */
    public RelatorioPessoasImpostosView(SistemaReceitaFederalView sistemaReceitaView) {
        this.sistemaReceitaView = sistemaReceitaView;
        initComponents();
        for (Pessoa pessoa : this.sistemaReceitaView.getPessoas()){
            taContribuinteImposto.append(pessoa.toString() + ", Imposto: " + pessoa.calcularImposto());
            taContribuinteImposto.append("\n");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        taContribuinteImposto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Pessoas com Impostos");

        taContribuinteImposto.setColumns(20);
        taContribuinteImposto.setRows(5);
        jScrollPane2.setViewportView(taContribuinteImposto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taContribuinteImposto;
    // End of variables declaration//GEN-END:variables
}

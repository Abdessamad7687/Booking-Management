/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import entities.Categorie;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.CategorieService;

/**
 *
 * @author Inas
 */
public class CategorieForm extends javax.swing.JInternalFrame {
     private final CategorieService cs = new CategorieService();
        private final DefaultTableModel model;
        private Categorie selectedCategorie = null;
    /**
     * Creates new form CatForm
     */
    public CategorieForm() {
        initComponents();
        model = (DefaultTableModel)this.categorieListTable.getModel();
        loadCategorieData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categorieListTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codeTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        libelleTxt = new javax.swing.JTextField();
        updateCategorie = new javax.swing.JButton();
        addCategorie = new javax.swing.JButton();
        removeCategorie = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "My list of categorys", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 20))); // NOI18N

        categorieListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Code", "Label"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        categorieListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categorieListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categorieListTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 20))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setText("Code :");

        codeTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setText("Label :");

        libelleTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        libelleTxt.setToolTipText("");
        libelleTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libelleTxtActionPerformed(evt);
            }
        });

        updateCategorie.setBackground(new java.awt.Color(204, 204, 204));
        updateCategorie.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        updateCategorie.setText("Modify");
        updateCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCategorieActionPerformed(evt);
            }
        });

        addCategorie.setBackground(new java.awt.Color(204, 204, 204));
        addCategorie.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addCategorie.setText("Add");
        addCategorie.setActionCommand("Add");
        addCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategorieActionPerformed(evt);
            }
        });

        removeCategorie.setBackground(new java.awt.Color(204, 204, 204));
        removeCategorie.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        removeCategorie.setText("Delete");
        removeCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCategorieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(libelleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(removeCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(libelleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateCategorie)
                    .addComponent(addCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeCategorie))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCategorieActionPerformed
        // TODO add your handling code here:
        if(this.selectedCategorie == null){
            JOptionPane.showMessageDialog(this, "No category selected", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Do you need to modify?");
        if(confirm == 0){
            this.selectedCategorie.setCode(codeTxt.getText());
            this.selectedCategorie.setLibelle(libelleTxt.getText());
            if(cs.update(selectedCategorie)){
                selectedCategorie = null;
                clearInputs();
                loadCategorieData();
            } else{
                JOptionPane.showMessageDialog(this, "Category change error", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_updateCategorieActionPerformed

    private void addCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategorieActionPerformed
        // TODO add your handling code here:
        String codeInput = codeTxt.getText();
        String libelleInput = libelleTxt.getText();

        if(codeInput.equals("") || libelleInput.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter category informations", "Error!", JOptionPane.ERROR_MESSAGE);
        } else{
            if(this.cs.create(new Categorie(codeInput, libelleInput))){
                loadCategorieData();
                clearInputs();
            }else{
                JOptionPane.showMessageDialog(this, "Error adding category", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_addCategorieActionPerformed

    private void removeCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCategorieActionPerformed
        // TODO add your handling code here:
        if(this.selectedCategorie == null){
            JOptionPane.showMessageDialog(this, "No category selected", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Do you want to delete?");
        if(confirm == 0){
            if(cs.delete(selectedCategorie)){
                selectedCategorie = null;
                clearInputs();
                loadCategorieData();
            } else{
                JOptionPane.showMessageDialog(this, " Category deletion error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_removeCategorieActionPerformed

    private void categorieListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categorieListTableMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = categorieListTable.getSelectedRow();
        int id = Integer.parseInt(this.model.getValueAt(selectedRowIndex,0).toString());
        String code = this.model.getValueAt(selectedRowIndex,1).toString();
        String libelle = this.model.getValueAt(selectedRowIndex, 2).toString();
        selectedCategorie = new Categorie(id, code, libelle);
        codeTxt.setText(code);
        libelleTxt.setText(libelle);
    }//GEN-LAST:event_categorieListTableMouseClicked

    private void libelleTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libelleTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_libelleTxtActionPerformed

       
    public void loadCategorieData(){
        this.model.setRowCount(0);
        for(Categorie c : cs.findAll()){
            this.model.addRow(new Object[]{
                c.getId(),
                c.getCode(),
                c.getLibelle()
            });
        }
    }
    
    private void clearInputs(){
        codeTxt.setText("");
        libelleTxt.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCategorie;
    private javax.swing.JTable categorieListTable;
    private javax.swing.JTextField codeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField libelleTxt;
    private javax.swing.JButton removeCategorie;
    private javax.swing.JButton updateCategorie;
    // End of variables declaration//GEN-END:variables
}
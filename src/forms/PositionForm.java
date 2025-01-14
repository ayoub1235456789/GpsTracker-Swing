/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import entities.Position;
import entities.Tracker;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.PositionService;
import service.TrackerService;

/**
 *
 * @author Lachgar
 */
public class PositionForm extends javax.swing.JInternalFrame {

    private TrackerService ts;
    private PositionService ps;
    private DefaultTableModel model;
    private static int id;

    /**
     * Creates new form PositionForm
     */
    public PositionForm() {
        initComponents();
        ts = new TrackerService();
        ps = new PositionService();
        model = (DefaultTableModel) listePositions.getModel();
        loadTrackers();
        loadPositins();
    }

    private void loadTrackers() {
        for (Tracker t : ts.findAll()) {
            listeTrackers.addItem(t);
        }
    }

    private void loadPositins() {
        model.setRowCount(0);
        for (Position p : ps.findAll()) {
            model.addRow(new Object[]{
                p.getId(),
                p.getLatitude(),
                p.getLongitude(),
                p.getDate(),
                p.getTracker()
            });
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        latitudeTxt = new javax.swing.JTextField();
        longitudeTxt = new javax.swing.JTextField();
        dateTxt = new com.toedter.calendar.JDateChooser();
        listeTrackers = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listePositions = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion des positions");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nouvelle Position", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel1.setText("Latitude : ");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel2.setText("Longitude :");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel3.setText("Date : ");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel4.setText("Tracker : ");

        latitudeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latitudeTxtActionPerformed(evt);
            }
        });

        longitudeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longitudeTxtActionPerformed(evt);
            }
        });

        listeTrackers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeTrackersActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton2.setText("Supprimer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton3.setText("Modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(43, 43, 43)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(longitudeTxt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(latitudeTxt)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(listeTrackers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(latitudeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(longitudeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listeTrackers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des positions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 12))); // NOI18N

        listePositions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Latitude", "Longitude", "Date", "Tracker"
            }
        ));
        listePositions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listePositionsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listePositions);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double latitude = Double.parseDouble(latitudeTxt.getText());
        double longitude = Double.parseDouble(longitudeTxt.getText());
        Date date = dateTxt.getDate();
        Tracker tracker = (Tracker) listeTrackers.getSelectedItem();
        if (ps.create(new Position(latitude, longitude, date, tracker))) {
            JOptionPane.showMessageDialog(this, "Position bien enregistrée");
            loadPositins();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listePositionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listePositionsMouseClicked
        // TODO add your handling code here:
        id = Integer.parseInt(model.getValueAt(listePositions.getSelectedRow(), 0).toString());
        latitudeTxt.setText(model.getValueAt(listePositions.getSelectedRow(), 1).toString());
        longitudeTxt.setText(model.getValueAt(listePositions.getSelectedRow(), 2).toString());
        dateTxt.setDate((Date) model.getValueAt(listePositions.getSelectedRow(), 3));
        listeTrackers.setSelectedItem((Tracker)model.getValueAt(listePositions.getSelectedRow(), 4));
    }//GEN-LAST:event_listePositionsMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int reponse = JOptionPane.showConfirmDialog(this, "Voulez vous vraiment supprimer cette position");
//kkk
        if (reponse == 0 && id != 0) {
            if (ps.delete(ps.findById(id))) {
                JOptionPane.showMessageDialog(this, "Position supprimée");
                loadPositins();
            } 
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    Position p = ps.findById(id);
    p.setLatitude(Double.parseDouble(latitudeTxt.getText()));
    p.setLongitude(Double.parseDouble(longitudeTxt.getText()));
    p.setDate(dateTxt.getDate());
    p.setTracker((Tracker) listeTrackers.getSelectedItem()); int reponse = JOptionPane.showConfirmDialog(this, "Voulez vous vraiment modifier ce position"); if (reponse == 0 && id != 0) {
    if (ps.update(p)) {
    JOptionPane.showMessageDialog(this, "Position modifié");
    loadPositins();
    }
    }



         
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void latitudeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latitudeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_latitudeTxtActionPerformed

    private void listeTrackersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeTrackersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listeTrackersActionPerformed

    private void longitudeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longitudeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_longitudeTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField latitudeTxt;
    private javax.swing.JTable listePositions;
    private javax.swing.JComboBox listeTrackers;
    private javax.swing.JTextField longitudeTxt;
    // End of variables declaration//GEN-END:variables
}

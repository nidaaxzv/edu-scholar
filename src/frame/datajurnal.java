/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class datajurnal extends javax.swing.JFrame {

    private datajurnal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void clearForm() {
        noJurnal.setText(null);
        userId.setText(null);
        penga.setText(null);
        jud.setText(null);
        th.setText(null);
        pener.setText(null);
        topik.setText(null);
    }

    /**
     * Creates new form datajurnal
     */
    public datajurnal(String nama3) {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        Fetch();
        jLabel2.setText(nama3);
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
        jLabel3 = new javax.swing.JLabel();
        txtIsi = new javax.swing.JTextField();
        txtCari = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        koleksiBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableJurnal = new javax.swing.JTable();
        bg = new javax.swing.JLabel();
        jud = new javax.swing.JTextField();
        th = new javax.swing.JTextField();
        pener = new javax.swing.JTextField();
        penga = new javax.swing.JTextField();
        topik = new javax.swing.JTextField();
        noJurnal = new javax.swing.JTextField();
        userId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 0, 1200, 610));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/back2.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, 50));

        txtIsi.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtIsi.setText(" ");
        txtIsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsiActionPerformed(evt);
            }
        });
        getContentPane().add(txtIsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 330, -1));

        txtCari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCariMouseClicked(evt);
            }
        });
        getContentPane().add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 40, 40));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 153, 153));
        jButton2.setText("BACK");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 550, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cari judul jurnal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 99, 330, 30));

        koleksiBtn.setBackground(new java.awt.Color(204, 204, 255));
        koleksiBtn.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        koleksiBtn.setForeground(new java.awt.Color(51, 51, 255));
        koleksiBtn.setText("+ Koleksiku");
        koleksiBtn.setToolTipText("");
        koleksiBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        koleksiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koleksiBtnActionPerformed(evt);
            }
        });
        getContentPane().add(koleksiBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 140, -1));

        tableJurnal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No Jurnal", "Pengarang", "Judul", "Tahun", "Penerbit", "Topik", "user id"
            }
        ));
        tableJurnal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableJurnalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableJurnal);
        if (tableJurnal.getColumnModel().getColumnCount() > 0) {
            tableJurnal.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableJurnal.getColumnModel().getColumn(1).setPreferredWidth(40);
            tableJurnal.getColumnModel().getColumn(2).setPreferredWidth(70);
            tableJurnal.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 1000, 360));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/datajur.png"))); // NOI18N
        bg.setText(" ");
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 610));
        getContentPane().add(jud, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 140, -1));
        getContentPane().add(th, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 130, -1));

        pener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penerActionPerformed(evt);
            }
        });
        getContentPane().add(pener, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 90, -1));
        getContentPane().add(penga, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 150, -1));
        getContentPane().add(topik, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 110, -1));

        noJurnal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noJurnalActionPerformed(evt);
            }
        });
        getContentPane().add(noJurnal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 120, -1));
        getContentPane().add(userId, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 560, 90, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 130, 30));

        setSize(new java.awt.Dimension(1199, 611));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Fetch() {
        int q;

        try {
            Connection conn = Koneksi.getKoneksi();
            String sql = "SELECT * FROM data_jurnal";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData res = rs.getMetaData();
            q = res.getColumnCount();

            DefaultTableModel df = (DefaultTableModel) tableJurnal.getModel();
            df.setRowCount(0);
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int a = 1; a <= q; a++) {
                    v2.add(rs.getString("no_jurnal"));
                    v2.add(rs.getString("pengarang"));
                    v2.add(rs.getString("judul"));
                    v2.add(rs.getString("tahun"));
                    v2.add(rs.getString("penerbit"));
                    v2.add(rs.getString("topik"));
                    v2.add(rs.getString("user_id"));
                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(datajurnal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void txtIsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsiActionPerformed

    private void txtCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCariMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("No jurnal");
        tb.addColumn("Pengarang");
        tb.addColumn("Judul");
        tb.addColumn("Tahun");
        tb.addColumn("Penerbit");
        tb.addColumn("Topik");
        tb.addColumn("User id");
        try {
            Connection conn = Koneksi.getKoneksi();
            String sql = "SELECT * FROM data_jurnal WHERE judul LIKE '%" + txtIsi.getText() + "%'";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),});
            } tableJurnal.setModel(tb);
        } catch (SQLException ex) {
            Logger.getLogger(datajurnal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtCariMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtIsi.setText("");
        Fetch();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableJurnalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableJurnalMouseClicked
        // TODO add your handling code here:
        int baris = tableJurnal.rowAtPoint(evt.getPoint());
        String noJur = tableJurnal.getValueAt(baris, 0).toString();
        noJurnal.setText(noJur);
        String namaPg = tableJurnal.getValueAt(baris, 1).toString();
        penga.setText(namaPg);
        String judul = tableJurnal.getValueAt(baris, 2).toString();
        jud.setText(judul);
        String thn = tableJurnal.getValueAt(baris, 3).toString();
        th.setText(thn);
        String pb = tableJurnal.getValueAt(baris, 4).toString();
        pener.setText(pb);
        String tpk = tableJurnal.getValueAt(baris, 5).toString();
        topik.setText(tpk);
        String usId = tableJurnal.getValueAt(baris, 6).toString();
        userId.setText(usId);
    }//GEN-LAST:event_tableJurnalMouseClicked

    private void koleksiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koleksiBtnActionPerformed
        try {
            Connection conn = Koneksi.getKoneksi();
            String sql = "SELECT * FROM koleksiku WHERE no_jurnal ='" + noJurnal.getText() + "' AND user ='" + jLabel2.getText() + "';";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Data sudah pernah ditambahkan di koleksiku!");
                clearForm();
            } else {
                String sql2 = "insert into koleksiku values ('" + noJurnal.getText() + "','" + penga.getText() + "','" + jud.getText() + "','" + th.getText() + "','" + pener.getText() + "','" + topik.getText() + "','" + jLabel2.getText() + "')";
                PreparedStatement ps = conn.prepareStatement(sql2);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil ditambahakan ke koleksiku!");
                clearForm();
            }
        } catch (SQLException ex) {
            Logger.getLogger(datajurnal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_koleksiBtnActionPerformed

    private void penerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penerActionPerformed

    private void noJurnalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noJurnalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noJurnalActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        masuk a = new masuk(jLabel2.getText());
        a.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(datajurnal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datajurnal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datajurnal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datajurnal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datajurnal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jud;
    private javax.swing.JButton koleksiBtn;
    private javax.swing.JTextField noJurnal;
    private javax.swing.JTextField pener;
    private javax.swing.JTextField penga;
    private javax.swing.JTable tableJurnal;
    private javax.swing.JTextField th;
    private javax.swing.JTextField topik;
    private javax.swing.JLabel txtCari;
    private javax.swing.JTextField txtIsi;
    private javax.swing.JTextField userId;
    // End of variables declaration//GEN-END:variables
}
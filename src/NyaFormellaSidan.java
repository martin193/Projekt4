
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marku
 */
public class NyaFormellaSidan extends javax.swing.JFrame {
    
        private String epost;
        public String filepath;
    /**
     * Creates new form NyaFormellaSidan
     */
    public NyaFormellaSidan(String e) {
        initComponents();
        
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        
        
        fyllCbKategorier();
        fyllBloggTabell();
        epost = e;
        kollaAdmin();
    }

    private void fyllCbKategorier() {
        String fraga = "SELECT KATEGORINAMN FROM KATEGORI_FORMELL";
        
        jComboBox1.addItem("Alla inlägg");
        jComboBox1.addItem("Mina inlägg");

        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        String kategori = null;
        try {
            String query = fraga;
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                kategori = rs.getString(1);
                /*if (kategori == "")
                {
                    kategori = "Kategori saknas";
                    JOptionPane.showMessageDialog(null, "hej " + kategori);
                }*/
                jComboBox1.addItem(kategori);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
        private void fyllBloggTabell(){
        
        try
        {
            String fraga = "SELECT * FROM FORMELL_BLOGG JOIN KATEGORI_FORMELL ON KATEGORIID = "
                    + "KATEGORI JOIN ANVANDARE ON ANVANDARE.ANVANDARID = FORMELL_BLOGG.ANVANDARID ORDER BY TIDPUNKT DESC";
                
                
            String rubrik = GetQuery(fraga);
                
                
        }
        catch (Exception bla)
        {
             JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
        
        }
        
            public void kollaAdmin()
    {
        try
        {
            String fraga = "SELECT ADMIN FROM ANVANDARE WHERE EPOST = '" + epost + "'"; 
            String svar = GetAdmin(fraga);

            if(svar.equals("T"))
            {
            btnTaBort.setVisible(true);
            }
            else
            {
            btnTaBort.setVisible(false);
            }
        
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Hmmm");
        }
    }
    public String GetAdmin(String q){
        String svar = null;
        DB_connection.DB_Connection obj_DB_Connection= new DB_connection.DB_Connection();
	Connection connection=obj_DB_Connection.get_connection();
	PreparedStatement ps=null;
	try {
	    String query= q;
	    ps=connection.prepareStatement(query);
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()){
                svar = rs.getString(1);
	    }
	} catch (Exception e) {
	    System.out.println(e);
	} 
        return svar;
    }
    public String GetQuery(String s)
    {
	DB_connection.DB_Connection obj_DB_Connection= new DB_connection.DB_Connection();
	Connection connection=obj_DB_Connection.get_connection();
	PreparedStatement ps=null;
        String rubrik = null;
        String text = null;
        String kategori = null;
        String fornamn = null;
        String efternamn = null;
        
        DefaultTableModel yaya = (DefaultTableModel)jTable2.getModel();
        int rowCount = yaya.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            yaya.removeRow(i);
        }
        
	try {
	    String query= s;
	    ps=connection.prepareStatement(query);
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()){
                rubrik = rs.getString(1);
                text = rs.getString(2);
                kategori = rs.getString(8);
                fornamn = rs.getString(11);
                efternamn = rs.getString(12);
                
                String forfattare = fornamn + " " + efternamn;
                
                String resultat = "";                    
                
                //resultat+=rubrik + "\n" + "Författare: " + fornamn + ' ' + efternamn + "\n" + "Kategori: " + kategori + "\n" + text +  "\n" + "\n";
                
                DefaultTableModel taaInlagg = (DefaultTableModel) jTable2.getModel();
                taaInlagg.addRow(new Object[]{rubrik,forfattare,kategori});
                
                
	    }
	} catch (SQLException e) {
	    System.out.println(e);
	} 
        return rubrik;
    }
        
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblrubrik = new javax.swing.JLabel();
        lbltid = new javax.swing.JLabel();
        labelforfattare = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Välj kategori");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tryck på ett inlägg");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("Open");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnTaBort.setText("Ta bort inlägg");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        lblrubrik.setPreferredSize(new java.awt.Dimension(41, 45));

        jButton2.setText("Skriv nytt blogginlägg");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Rubrik", "Författare", "Kategori"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btnTaBort)
                .addGap(197, 197, 197)
                .addComponent(lbltid, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(111, 111, 111)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(labelforfattare, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(lblrubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblrubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(labelforfattare, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnTaBort))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton2)
                        .addGap(125, 125, 125)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbltid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
         String kategori = jComboBox1.getSelectedItem().toString();
                
        if (kategori == "Alla inlägg")
        {
            try
        {
            
         String fraga = "SELECT * FROM FORMELL_BLOGG JOIN KATEGORI_FORMELL ON KATEGORIID = "
                    + "KATEGORI JOIN ANVANDARE ON ANVANDARE.ANVANDARID = FORMELL_BLOGG.ANVANDARID ORDER BY TIDPUNKT DESC";
                
                
            String rubrik = GetQuery(fraga);
                
                
        }
        catch (Exception bla)
        {
             JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
        }
        else if (kategori == "Mina inlägg")
        {
            try
        {
            
            String fraga = "SELECT * FROM FORMELL_BLOGG JOIN KATEGORI_FORMELL ON KATEGORIID = "
                    + "KATEGORI JOIN ANVANDARE ON ANVANDARE.ANVANDARID = FORMELL_BLOGG.ANVANDARID ORDER BY TIDPUNKT DESC";
                
                
            String rubrik = GetQuery(fraga);
                
                
        }
        catch (Exception bla)
        {
             JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
        }
        else
        {
            try
            {

            String fraga= "SELECT * FROM FORMELL_BLOGG JOIN KATEGORI_FORMELL ON KATEGORIID = KATEGORI JOIN ANVANDARE ON ANVANDARE.ANVANDARID = FORMELL_BLOGG.ANVANDARID ORDER BY TIDPUNKT DESC";


                String rubrik = GetQuery(fraga);


            }
            catch (Exception bla)
            {
                 JOptionPane.showMessageDialog(null, "Något gick fel!");
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        // TODO add your handling code here:
                
        DefaultTableModel yaya = (DefaultTableModel)jTable2.getModel();

        int selectedRowIndex = jTable2.getSelectedRow();
        
        String id = (yaya.getValueAt(selectedRowIndex, 0).toString());
        
        JOptionPane.showMessageDialog(null, "Rubrik: " + id);
        
        //id är rubrik nu dock
        
        //String fraga= "SELECT * FROM INFORMELL_BLOGG JOIN ANVANDARE ON ANVANDARE.ANVANDARID = INFORMELL_BLOGG.ANVANDARID WHERE RUBRIK = '" + id + "'";
                
                
        //String text = GetText(fraga);
        
    }//GEN-LAST:event_btnTaBortActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                filepath = jTextField1.getText();
        try {
            File pdfFile = new File(filepath);
            if (pdfFile.exists())
            {
                if (Desktop.isDesktopSupported())
                {
                    Desktop.getDesktop().open(pdfFile);
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "desktop is not supported");
                }
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "File doesnt exist");
            }
        }
        catch ( HeadlessException | IOException e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                this.dispose();
        new SkrivaFormelltInlagg(epost).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    public String GetText(String s)
    {
	DB_connection.DB_Connection obj_DB_Connection= new DB_connection.DB_Connection();
	Connection connection=obj_DB_Connection.get_connection();
	PreparedStatement ps=null;
        String rubrik = null;
        String text = null;
        String fornamn = null;
        String efternamn = null;
        String tidpunkt = null;
        String epostForfattare = null;
        String fil = null;

	try {
	    String query= s;
	    ps=connection.prepareStatement(query);
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()){
                rubrik = rs.getString(1);
                text = rs.getString(2);
                fornamn = rs.getString(9);
                efternamn = rs.getString(10);
                epostForfattare = rs.getString(11);
                tidpunkt = rs.getString(5);
                fil = rs.getString(7);
	    }
        
            String namn = "Av: " + fornamn + " " + efternamn;
            String tid = tidpunkt.substring(0, 16);
            
            lblrubrik.setText(rubrik);
            jTextArea1.setText(text);
            labelforfattare.setText(namn);
            lbltid.setText(tid);
            
            if (epost.equals(epostForfattare))
            {
                btnTaBort.setVisible(true);
            }
            else
            {
                btnTaBort.setVisible(false);
            }
        }
        catch (SQLException e) {
	    System.out.println(e);
        }
        
        return text;
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
            java.util.logging.Logger.getLogger(bloggExperiment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bloggExperiment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bloggExperiment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bloggExperiment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new bloggExperiment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelforfattare;
    private javax.swing.JLabel lblrubrik;
    private javax.swing.JLabel lbltid;
    // End of variables declaration//GEN-END:variables
}

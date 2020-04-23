
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.getProperty;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        private byte[] filebytes;
    /**
     * Creates new form NyaFormellaSidan
     */
    public NyaFormellaSidan(String e) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        BloggRuta.setLineWrap(true);
        BloggRuta.setWrapStyleWord(true);
        
        
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
                kategori = rs.getString(9);
                fornamn = rs.getString(12);
                efternamn = rs.getString(13);
                
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
        BloggRuta = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();
        lblFörfattare = new javax.swing.JLabel();
        lbltid = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblbild = new javax.swing.JLabel();
        btntillbaka = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Välj kategori");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Välj ett inlägg att visa:");

        BloggRuta.setColumns(20);
        BloggRuta.setRows(5);
        jScrollPane2.setViewportView(BloggRuta);

        jButton1.setText("Öppna");
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

        lblRubrik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblFörfattare.setPreferredSize(new java.awt.Dimension(41, 45));

        lbltid.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        btntillbaka.setText("Tillbaka");
        btntillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntillbakaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setText("Formell blogg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2)
                            .addComponent(lblRubrik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFörfattare, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbltid, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblbild, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTaBort, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
                                .addGap(0, 34, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btntillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblbild, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFörfattare, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btntillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        
        DefaultTableModel yaya = (DefaultTableModel)jTable2.getModel();

        int selectedRowIndex = jTable2.getSelectedRow();
        
        String id = (yaya.getValueAt(selectedRowIndex, 0).toString());
        //id är rubrik nu dock        
        
        try {
            String sql = "DELETE FROM FORMELL_BLOGG WHERE RUBRIK = '" + id + "'";
                ps = connection.prepareStatement(sql);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Inlägget " + id + " har tagits bort");
        }
        catch (Exception bla) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");            
        }
        
        fyllCbKategorier();
        fyllBloggTabell();
        lblRubrik.setText("");
        BloggRuta.setText("");
        lblFörfattare.setText("");
        lbltid.setText("");
        
    }//GEN-LAST:event_btnTaBortActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                filepath = jTextField1.getText();
        try {
            
           String basepath = System.getProperty("user.dir");
           String newfilepath = basepath + "\\src\\UploadedFiles\\" + filepath; 
           Path path = Paths.get(newfilepath);
           if (Files.exists(path))
                   {
                       Files.delete(path);
                   }
           File file = new File(newfilepath);
           FileOutputStream os = new FileOutputStream(file); 
           
           os.write(filebytes);
           os.close();
            
            File pdfFile = new File(newfilepath);
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

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        
        
                DefaultTableModel yaya = (DefaultTableModel)jTable2.getModel();
        int selectedRowIndex = jTable2.getSelectedRow();
        
        String id = (yaya.getValueAt(selectedRowIndex, 0).toString());
        
        //id är rubrik nu dock
        
        String fraga= "SELECT * FROM FORMELL_BLOGG JOIN ANVANDARE ON ANVANDARE.ANVANDARID = FORMELL_BLOGG.ANVANDARID WHERE RUBRIK = '" + id + "'";
                
                
        String text = GetText(fraga);
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void btntillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntillbakaActionPerformed
        // TODO add your handling code here:
                        this.dispose();
        new AnvStartsida(epost).setVisible(true);
    }//GEN-LAST:event_btntillbakaActionPerformed
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
                fornamn = rs.getString(10);
                efternamn = rs.getString(11);
                epostForfattare = rs.getString(12);
                tidpunkt = rs.getString(6);
                fil = rs.getString(7);
                filebytes = rs.getBytes(8);
	    }
            String namn = "Av: " + fornamn + " " + efternamn;
            String tid = tidpunkt.substring(0, 16);
            lblRubrik.setText(rubrik);
            BloggRuta.setText(text);
            lblFörfattare.setText(namn);
            lbltid.setText(tid);
            jTextField1.setText(fil);
            
            
            if (epost.equals(epostForfattare))
            {
                btnTaBort.setVisible(true);
            }
            else
            {
                btnTaBort.setVisible(false);
            }
            
	} catch (Exception e) {
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
            java.util.logging.Logger.getLogger(NyInformellBlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NyInformellBlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NyInformellBlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NyInformellBlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new NyInformellBlogg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea BloggRuta;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btntillbaka;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblFörfattare;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblbild;
    private javax.swing.JLabel lbltid;
    // End of variables declaration//GEN-END:variables
}

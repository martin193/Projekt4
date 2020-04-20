
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
 * @author oskar
 */
public class bloggExperiment extends javax.swing.JFrame {

    private String epost;
    /**
     * Creates new form bloggExperiment
     */
    public bloggExperiment(String e) {
        initComponents();
        
        bloggRuta.setLineWrap(true);
        bloggRuta.setWrapStyleWord(true);
        
        
        fyllCbKategorier();
        fyllBloggTabell();
        epost = e;
        kollaAdmin();
    }
    private void fyllCbKategorier() {
        String fraga = "SELECT KATEGORINAMN FROM KATEGORI_INFORMELL";
        
        cbxKategorier.addItem("Alla inlägg");
        cbxKategorier.addItem("Mina inlägg");

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
                cbxKategorier.addItem(kategori);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fyllBloggTabell(){
        
        try
        {
            
            String fraga= "SELECT * FROM INFORMELL_BLOGG JOIN KATEGORI_INFORMELL ON KATEGORIID = KATEGORI JOIN ANVANDARE ON ANVANDARE.ANVANDARID = INFORMELL_BLOGG.ANVANDARID ORDER BY TIDPUNKT DESC";
                
                
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
        
        DefaultTableModel yaya = (DefaultTableModel)tblInlagg.getModel();
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
                
                DefaultTableModel taaInlagg = (DefaultTableModel) tblInlagg.getModel();
                taaInlagg.addRow(new Object[]{rubrik,forfattare,kategori});
                
                
	    }
	} catch (Exception e) {
	    System.out.println(e);
	} 
        return rubrik;
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
        tblInlagg = new javax.swing.JTable();
        cbxKategorier = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblBild = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bloggRuta = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        lblRubrik = new javax.swing.JLabel();
        lblForfattare = new javax.swing.JLabel();
        lblTidpunkt = new javax.swing.JLabel();
        btnTaBort = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnNyttInlagg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblInlagg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rubrik", "Författare", "Kategori"
            }
        ));
        tblInlagg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInlaggMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInlagg);

        cbxKategorier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxKategorierActionPerformed(evt);
            }
        });

        jLabel1.setText("blogg osv");

        lblBild.setPreferredSize(new java.awt.Dimension(208, 212));

        bloggRuta.setColumns(20);
        bloggRuta.setRows(5);
        jScrollPane2.setViewportView(bloggRuta);

        jLabel2.setText("hej där tryck på ett inlägg");

        lblRubrik.setPreferredSize(new java.awt.Dimension(100, 20));

        btnTaBort.setText("Ta bort inlägg");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        jLabel3.setText("Välj kategori:");

        btnNyttInlagg.setText("Skriv nytt blogginlägg");
        btnNyttInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyttInlaggActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxKategorier, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblForfattare, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTidpunkt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnTaBort)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblBild, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNyttInlagg)
                        .addGap(150, 150, 150))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxKategorier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTidpunkt, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(lblForfattare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnTaBort))
                    .addComponent(btnNyttInlagg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxKategorierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxKategorierActionPerformed
        String kategori = cbxKategorier.getSelectedItem().toString();
                
        if (kategori == "Alla inlägg")
        {
            try
        {
            
            String fraga= "SELECT * FROM INFORMELL_BLOGG JOIN KATEGORI_INFORMELL ON KATEGORIID = KATEGORI JOIN ANVANDARE ON ANVANDARE.ANVANDARID = INFORMELL_BLOGG.ANVANDARID ORDER BY TIDPUNKT DESC";
                
                
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
            
            String fraga= "SELECT * FROM INFORMELL_BLOGG JOIN KATEGORI_INFORMELL ON KATEGORIID = KATEGORI JOIN ANVANDARE ON ANVANDARE.ANVANDARID = INFORMELL_BLOGG.ANVANDARID WHERE EPOST = '" + epost + "' ORDER BY TIDPUNKT DESC";
                
                
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

                String fraga= "SELECT * FROM INFORMELL_BLOGG JOIN KATEGORI_INFORMELL ON KATEGORIID = KATEGORI JOIN ANVANDARE ON ANVANDARE.ANVANDARID = INFORMELL_BLOGG.ANVANDARID WHERE KATEGORINAMN = '" + kategori + "' ORDER BY TIDPUNKT DESC";


                String rubrik = GetQuery(fraga);


            }
            catch (Exception bla)
            {
                 JOptionPane.showMessageDialog(null, "Något gick fel!");
            }
        }
    }//GEN-LAST:event_cbxKategorierActionPerformed

    private void tblInlaggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInlaggMouseClicked
                
        
        DefaultTableModel yaya = (DefaultTableModel)tblInlagg.getModel();
        int selectedRowIndex = tblInlagg.getSelectedRow();
        
        String id = (yaya.getValueAt(selectedRowIndex, 0).toString());
        
        //id är rubrik nu dock
        
        String fraga= "SELECT * FROM INFORMELL_BLOGG JOIN ANVANDARE ON ANVANDARE.ANVANDARID = INFORMELL_BLOGG.ANVANDARID WHERE RUBRIK = '" + id + "'";
                
                
        String text = GetText(fraga);
        
        

    
        
    }//GEN-LAST:event_tblInlaggMouseClicked

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        
        DefaultTableModel yaya = (DefaultTableModel)tblInlagg.getModel();

        int selectedRowIndex = tblInlagg.getSelectedRow();
        
        String id = (yaya.getValueAt(selectedRowIndex, 0).toString());
        
        JOptionPane.showMessageDialog(null, "Rubrik: " + id);
        
        //id är rubrik nu dock
        
        //String fraga= "SELECT * FROM INFORMELL_BLOGG JOIN ANVANDARE ON ANVANDARE.ANVANDARID = INFORMELL_BLOGG.ANVANDARID WHERE RUBRIK = '" + id + "'";
                
                
        //String text = GetText(fraga);
    }//GEN-LAST:event_btnTaBortActionPerformed

    private void btnNyttInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyttInlaggActionPerformed
        this.dispose();
        new SkrivaInformelltInlagg(epost).setVisible(true);
    }//GEN-LAST:event_btnNyttInlaggActionPerformed

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
                if (rs.getBytes(7) == null){
                    lblBild.setIcon(null);
                }
                else {
                    byte[] img = rs.getBytes(7);
                    ImageIcon bilden = new ImageIcon(img);
                    Image bild = bilden.getImage();
                    Image myImg = bild.getScaledInstance(lblBild.getWidth(), lblBild.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon nyBild = new ImageIcon(myImg);
                    lblBild.setIcon(nyBild);
                }
	    }
            
            String namn = "Av: " + fornamn + " " + efternamn;
            String tid = tidpunkt.substring(0, 16);
            
            lblRubrik.setText(rubrik);
            bloggRuta.setText(text);
            lblForfattare.setText(namn);
            lblTidpunkt.setText(tid);
            
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
    private javax.swing.JTextArea bloggRuta;
    private javax.swing.JButton btnNyttInlagg;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JComboBox<String> cbxKategorier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBild;
    private javax.swing.JLabel lblForfattare;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblTidpunkt;
    private javax.swing.JTable tblInlagg;
    // End of variables declaration//GEN-END:variables
}
